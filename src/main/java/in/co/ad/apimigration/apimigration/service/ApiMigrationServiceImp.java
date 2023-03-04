package in.co.ad.apimigration.apimigration.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import in.co.ad.apimigration.apimigration.apigee.dto.ApiProxyDto;
import in.co.ad.apimigration.apimigration.apigee.dto.ApiResourceFileDownloadDto;
import in.co.ad.apimigration.apimigration.apigee.dto.ApiResourceFileUrlDto;
import in.co.ad.apimigration.apimigration.apigee.dto.ApiResourceFilesDto;
import in.co.ad.apimigration.apimigration.apigee.dto.ApiRevisionDto;
import in.co.ad.apimigration.apimigration.apigee.dto.ApiTargetDto;
import in.co.ad.apimigration.apimigration.apigee.dto.ApiTargetServerDto;
import in.co.ad.apimigration.apimigration.apigee.dto.ApiTokenDto;
import in.co.ad.apimigration.apimigration.apigee.dto.ApiTokenRequestDto;
import in.co.ad.apimigration.apimigration.client.RestClient;
import in.co.ad.apimigration.apimigration.config.MigrationConfig;
import in.co.ad.apimigration.apimigration.dto.SourceApiMappingDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewRouteReplyDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewRouteRequestDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewServiceReplyDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewServiceRequestDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewUpstreamReplyDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewUpstreamRequestDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewUpstreamTargetReplyDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewUpstreamTargetRequestDto;
import in.co.ad.apimigration.apimigration.kong.dto.ServiceReplyDto;
import in.co.ad.apimigration.apimigration.kong.dto.UpdateServiceReplyDto;
import in.co.ad.apimigration.apimigration.kong.dto.UpdateServiceRequestDto;
import in.co.ad.apimigration.apimigration.kong.dto.generated.FRoute;
import in.co.ad.apimigration.apimigration.kong.dto.generated.FService;
import in.co.ad.apimigration.apimigration.kong.dto.generated.FTarget;
import in.co.ad.apimigration.apimigration.kong.dto.generated.FUpstream;
import in.co.ad.apimigration.apimigration.kong.dto.generated.KongJsonSchema;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApiMigrationServiceImp<T> implements ApiMigrationService {

    private final MigrationConfig migrationConfig;
    private final RestClient<T> client;

    @Override
    public void migrate() {

        List<SourceApiMappingDto> sourceApiMapping = new ArrayList<>();

        String apigeeBaseUrl = migrationConfig.getApigeeConfig().getBaseUrl() + "/"
                + migrationConfig.getApigeeConfig().getBaseVersion() + "/organizations/"
                + migrationConfig.getApigeeConfig().getOrganizationsName();

        String apigeeUrl = apigeeBaseUrl + "/apis";
        String apigeeEnvUrl = apigeeBaseUrl + "/environments";

        List<String> apiList = getApigeeApis(apigeeUrl);

        log.info("Before apply filter: ", apiList);

        List<String> apiIncludeList = migrationConfig.getApigeeConfig().getIncludeApiList();
        List<String> apiExcludeList = migrationConfig.getApigeeConfig().getExcludeApiList();

        if (!CollectionUtils.isEmpty(apiIncludeList)) {
            apiList = apiList.stream()
                    .filter(api -> apiIncludeList.stream()
                            .anyMatch(includeApi -> includeApi.equals(api)))
                    .collect(Collectors.toList());
        } else {
            apiList = apiList.stream()
                    .filter(api -> apiExcludeList.stream()
                            .anyMatch(excludeApi -> excludeApi.equals(api)))
                    .collect(Collectors.toList());
        }

        log.info("After apply filter: ", apiList.toString());

        /*ApiTokenRequestDto tokenRequest = new ApiTokenRequestDto();
        tokenRequest.setGrant_type("password");
        tokenRequest.setUsername(migrationConfig.getApigeeConfig().getUserName());
        tokenRequest.setPassword(migrationConfig.getApigeeConfig().getPassword());*/
        
        MultiValueMap<String, String> tokenRequest = new LinkedMultiValueMap<String, String>(); 
        tokenRequest.add("grant_type", "password"); 
        tokenRequest.add("username", migrationConfig.getApigeeConfig().getUserName());
        tokenRequest.add("password", migrationConfig.getApigeeConfig().getPassword());

        T result = client.invokeLogin(migrationConfig.getApigeeConfig().getTokenLoginBaseUrl(), HttpMethod.POST, (T) tokenRequest, migrationConfig.getApigeeConfig().getAuthToken(), ApiTokenDto.class);
        
        ApiTokenDto token = ApiTokenDto.class.cast(result);

        apiList.stream().forEach(api -> {

            SourceApiMappingDto apiMappingDto = new SourceApiMappingDto();
            apiMappingDto.setServiceName(api + "_service");
            apiMappingDto.setUpstreamName(api + "_upstream");
            apiMappingDto.setServiceHost(api + "_upstream");

            String apigeeUrlLocal = apigeeUrl + "/" + api + "/revisions";

            List<String> revisionList = getApigeeAllReversions(apigeeUrlLocal);

            log.info("All Reversion List: ", revisionList);

            String latestRevisionNumber = "";

            if (!CollectionUtils.isEmpty(revisionList)) {
                latestRevisionNumber = CollectionUtils.lastElement(revisionList);
            }

            apigeeUrlLocal = apigeeUrlLocal + "/" + latestRevisionNumber;

            ApiRevisionDto getRevisions = getRevisions(apigeeUrlLocal);

            log.info("Latest Revision: ", getRevisions.toString());

            String apigeeResourceUrl = apigeeUrlLocal + "/resourcefiles";
            ApiResourceFilesDto files = getResourceFiles(apigeeResourceUrl);
            List<ApiResourceFileDownloadDto> downloadResources = files.getResourceFile().stream().map(file-> getResourceFileUrlDownoad(apigeeResourceUrl , file.getType(), file.getName())).collect(Collectors.toList());
            
            downloadResources = downloadResources.stream().map(file -> {
                String data = getApigeeResourceFileString("https://apigee.com"+file.getUrl(), token.getAccess_token());
                ApiResourceFileDownloadDto downloadDto = new ApiResourceFileDownloadDto();
                downloadDto.setData(data);
                downloadDto.setName(file.getName());
                downloadDto.setType(file.getType());
                return downloadDto;
            }).collect(Collectors.toList());
            

            downloadResources.stream().forEach(saveFile -> {
                String fileName = removeExtension(saveFile.getName()) + ".yaml";
                Path directory =  Paths.get(migrationConfig.getApigeeConfig().getOpenApiDownloadPath()); 
                Path path = Paths.get(migrationConfig.getApigeeConfig().getOpenApiDownloadPath()+"/"+fileName); 
	            try {
                    if (!Files.exists(directory)) {
                        Files.createDirectories(directory);
                    } 
                    if (!Files.exists(path)) {
                        Files.createFile(path);
                    } 

                    Files.write(path, saveFile.getData().getBytes(StandardCharsets.UTF_8), StandardOpenOption.TRUNCATE_EXISTING);
                    
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            String apigeeUrlLocalProxy = apigeeUrlLocal + "/proxies";
            List<String> proxiesList = getApigeeAllProxies(apigeeUrlLocalProxy);
            log.info("Proxy List: ", proxiesList);
            List<ApiProxyDto> apiProxyList = proxiesList.stream()
                    .map(proxy -> getApigeeApiProxy(apigeeUrlLocalProxy + "/" + proxy)).collect(Collectors.toList());
            List<String> basePathList = apiProxyList.stream().map(apiProxy -> apiProxy.getConnection().getBasePath())
                    .collect(Collectors.toList());
            apiMappingDto.setRoutePaths(basePathList);
            apiMappingDto.setRouteName(api + "_route");

            String apigeeUrlLocalTarget = apigeeUrlLocal + "/targets";
            List<String> targetList = getApigeeAllTargets(apigeeUrlLocalTarget);
            log.info("Target List: ", targetList);
            List<ApiTargetDto> apiTargetList = targetList.stream()
                    .map(target -> getApigeeApiTarget(apigeeUrlLocalTarget + "/" + target))
                    .collect(Collectors.toList());

            List<String> serverList = apiTargetList.stream()
                    .map(apiTarget -> apiTarget.getConnection().getLoadBalancer().getServer()
                            .stream()
                            .map(server -> server.getName())
                            .collect(Collectors.toList()))
                    .flatMap(list -> list.stream())
                    .collect(Collectors.toList());

            List<String> environments = getApigeeAllEnv(apigeeEnvUrl);

            environments.stream().forEach(env -> {

                List<String> targetServers = getApigeeAllEnvTargetServer(apigeeEnvUrl + "/" + env + "/targetservers");
                List<ApiTargetServerDto> servers = targetServers.stream()
                        .filter(server -> serverList.stream().anyMatch(apiServer -> apiServer.equals(server)))
                        .map(server -> getApigeeEnvironmentServer(
                                apigeeEnvUrl + "/" + env + "/targetservers" + "/" + server))
                        .collect(Collectors.toList());

                if (servers.stream().findFirst().isPresent()) {
                    ApiTargetServerDto server = servers.stream().findFirst().get();
                    String url = server.getPort() == 443 ? "https://" : "http://";
                    url = url + server.getHost() + ":" + server.getPort();
                    apiMappingDto.setServiceUrl(url);
                }

                List<String> targetServerList = servers.stream()
                        .map(apiTarget -> apiTarget.getHost() + ":" + apiTarget.getPort()).collect(Collectors.toList());

                List<String> targetsPerEnv = null;
                if (apiMappingDto.getTargets() == null || apiMappingDto.getTargets().isEmpty()) {
                    targetsPerEnv = new ArrayList<>();
                } else {
                    targetsPerEnv = apiMappingDto.getTargets();
                }
                targetsPerEnv.addAll(targetServerList);

                apiMappingDto.setTargets(targetsPerEnv.stream().distinct().collect(Collectors.toList()));

            });

            sourceApiMapping.add(apiMappingDto);

        });

        if (migrationConfig.getKongConfig().isDbLess()) {

            KongJsonSchema schema = new KongJsonSchema();
            schema.setFormatVersion("3.0");
            schema.setTransform(true);
            
            List<FService> servicesList = new ArrayList<>();
            List<FUpstream> upstreamList = new ArrayList<>();

            sourceApiMapping.stream().forEach(mapping -> {

                FService service = new FService();
                service.setName(mapping.getServiceName());
                service.setUrl(mapping.getServiceUrl());
                service.setHost(mapping.getServiceHost());
                
                List<FRoute> routes = new ArrayList<>();
                FRoute route = new FRoute();
                route.setName(mapping.getRouteName());
                route.setPaths(mapping.getRoutePaths());

                //route.setProtocols(List.of("http", "https"));
                
                routes.add(route);
                service.setRoutes(routes);

                servicesList.add(service);
                
                FUpstream upstream = new FUpstream();
                upstream.setName(mapping.getUpstreamName());
                
                List<FTarget> targets = new ArrayList<>();
                mapping.getTargets().stream().forEach(targetValue -> {
                    FTarget target = new FTarget();
                    target.setTarget(targetValue);

                    //Upstream upstreamValue = new Upstream();
                    //upstreamValue.setName(mapping.getUpstreamName());

                    //target.setUpstream(upstreamValue);
                    targets.add(target);
                });
                
                upstream.setTargets(targets);
                upstreamList.add(upstream);
            });
           
            schema.setServices(servicesList);
            schema.setUpstreams(upstreamList);

            ObjectMapper mapper = YAMLMapper.builder().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER).build();
            try {
                mapper.setSerializationInclusion(Include.NON_NULL);
                mapper.setSerializationInclusion(Include.NON_EMPTY);
                mapper.writeValue(new File("./kong.yaml"), schema);
            } catch (StreamWriteException e) {
                e.printStackTrace();
            } catch (DatabindException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

            String kongUrl = migrationConfig.getKongConfig().getBaseUrl() + "/services";

            String kongUpstreamUrl = migrationConfig.getKongConfig().getBaseUrl() + "/upstreams";

            ServiceReplyDto serviceReplyDto = getKongServices(kongUrl);

            sourceApiMapping.stream()
                    .filter(mapping -> mapping.isValidationFailed() == false)
                    .forEach(mapping -> {

                        long count = serviceReplyDto.getData().stream()
                                .filter(data -> data.getName().equalsIgnoreCase(mapping.getServiceName() + "_service"))
                                .count();
                        NewServiceReplyDto newServiceReplyDto = null;

                        if (count == 0) {
                            NewUpstreamRequestDto newUpstreamRequestDto = new NewUpstreamRequestDto();
                            newUpstreamRequestDto.setName(mapping.getUpstreamName());

                            NewUpstreamReplyDto newUpstreamReplyDto = createKongUpstream(kongUpstreamUrl,
                                    newUpstreamRequestDto);

                            log.info("Kong new Upstream: ", newUpstreamReplyDto);

                            mapping.getTargets().stream()
                                    .map(target -> createKongUpstreamTarget(
                                            kongUpstreamUrl + "/" + mapping.getUpstreamName() + "/targets",
                                            getNewUpstreamTarget(target)))
                                    .collect(Collectors.toList());

                            NewServiceRequestDto requestDto = new NewServiceRequestDto();
                            requestDto.setName(mapping.getServiceName());
                            requestDto.setUrl(mapping.getServiceUrl());
                            // requestDto.setHost(mapping.getUpstreamName());

                            newServiceReplyDto = createKongServices(kongUrl, requestDto);

                            log.info("Kong new Service: ", newServiceReplyDto);

                            UpdateServiceRequestDto updateRequestDto = new UpdateServiceRequestDto();
                            updateRequestDto.setHost(mapping.getUpstreamName());

                            UpdateServiceReplyDto updateServiceReplyDto = updateKongServices(
                                    kongUrl + "/" + mapping.getServiceName(), updateRequestDto);

                            log.info("Kong update Service with upstream: ", updateServiceReplyDto);

                        }

                        if (newServiceReplyDto != null) {
                            NewRouteRequestDto requestDto = new NewRouteRequestDto();
                            requestDto.setName(mapping.getRouteName());
                            requestDto.setPaths(mapping.getRoutePaths());
                            String routeKongUrl = kongUrl + "/" + mapping.getServiceName() + "/routes";

                            NewRouteReplyDto replyDto = createKongRoutes(routeKongUrl, requestDto);

                            log.info("Kong new Route: ", replyDto);

                        }
                    });
        }

    }

    private NewUpstreamTargetRequestDto getNewUpstreamTarget(String target) {
        NewUpstreamTargetRequestDto dto = new NewUpstreamTargetRequestDto();
        dto.setTarget(target);
        return dto;
    }

    private List<String> getApigeeApis(String apigeeUrl) {
        return getApigeeArrayResponseApi(apigeeUrl);
    }

    private List<String> getApigeeAllReversions(String apigeeUrl) {
        return getApigeeArrayResponseApi(apigeeUrl);
    }

    private List<String> getApigeeAllProxies(String apigeeUrl) {
        return getApigeeArrayResponseApi(apigeeUrl);
    }

    private List<String> getApigeeAllTargets(String apigeeUrl) {
        return getApigeeArrayResponseApi(apigeeUrl);
    }

    private List<String> getApigeeAllEnv(String apigeeUrl) {
        return getApigeeArrayResponseApi(apigeeUrl);
    }

    private List<String> getApigeeAllEnvTargetServer(String apigeeUrl) {
        return getApigeeArrayResponseApi(apigeeUrl);
    }

    private List<String> getApigeeArrayResponseApi(String apigeeUrl) {
        T result = client.invoke(apigeeUrl, HttpMethod.GET, (T) "body", migrationConfig.getApigeeConfig().getUserName(),
                migrationConfig.getApigeeConfig().getPassword(), String[].class);

        String[] apis = String[].class.cast(result);

        List<String> apiList = List.of(apis);
        return apiList;
    }

    private ApiRevisionDto getRevisions(String apigeeUrl) {

        T result = client.invoke(apigeeUrl, HttpMethod.GET, (T) "body", migrationConfig.getApigeeConfig().getUserName(),
                migrationConfig.getApigeeConfig().getPassword(), ApiRevisionDto.class);

        ApiRevisionDto revisions = ApiRevisionDto.class.cast(result);

        return revisions;
    }

    private ApiResourceFilesDto getResourceFiles(String apigeeUrl) {

        T result = client.invoke(apigeeUrl, HttpMethod.GET, (T) "body", migrationConfig.getApigeeConfig().getUserName(),
                migrationConfig.getApigeeConfig().getPassword(), ApiResourceFilesDto.class);

                ApiResourceFilesDto files = ApiResourceFilesDto.class.cast(result);

        return files;
    }

    private ApiResourceFileDownloadDto getResourceFileUrlDownoad(String apigeeUrl, String type, String name) {
        
        ApiResourceFileUrlDto apiResourceFileUrlDto = getResourceFileUrl(apigeeUrl + "/" +type +"/" + name);

        ApiResourceFileDownloadDto downloadData = new ApiResourceFileDownloadDto();
        downloadData.setType(type);
        downloadData.setName(name);
        downloadData.setUrl(apiResourceFileUrlDto.getUrl());

        return downloadData;
    }
    
    private String getApigeeResourceFileString(String apigeeUrl, String bearerToken) {
        T result = client.invokeSpecDownload(apigeeUrl, HttpMethod.GET, (T) "body",  bearerToken, String.class);

        String downloadFileString = String.class.cast(result);

        return downloadFileString;
    }

    private ApiResourceFileUrlDto getResourceFileUrl(String apigeeUrl) {

        T result = client.invoke(apigeeUrl, HttpMethod.GET, (T) "body", migrationConfig.getApigeeConfig().getUserName(),
                migrationConfig.getApigeeConfig().getPassword(), ApiResourceFileUrlDto.class);

                ApiResourceFileUrlDto urls = ApiResourceFileUrlDto.class.cast(result);

        return urls;
    }

    private ApiProxyDto getApigeeApiProxy(String apigeeUrl) {

        T result = client.invoke(apigeeUrl, HttpMethod.GET, (T) "body", migrationConfig.getApigeeConfig().getUserName(),
                migrationConfig.getApigeeConfig().getPassword(), ApiProxyDto.class);

        ApiProxyDto proxy = ApiProxyDto.class.cast(result);

        return proxy;
    }

    private ApiTargetDto getApigeeApiTarget(String apigeeUrl) {

        T result = client.invoke(apigeeUrl, HttpMethod.GET, (T) "body", migrationConfig.getApigeeConfig().getUserName(),
                migrationConfig.getApigeeConfig().getPassword(), ApiTargetDto.class);

        ApiTargetDto target = ApiTargetDto.class.cast(result);

        return target;
    }

    private ApiTargetServerDto getApigeeEnvironmentServer(String apigeeUrl) {

        T result = client.invoke(apigeeUrl, HttpMethod.GET, (T) "body", migrationConfig.getApigeeConfig().getUserName(),
                migrationConfig.getApigeeConfig().getPassword(), ApiTargetServerDto.class);

        ApiTargetServerDto target = ApiTargetServerDto.class.cast(result);

        return target;
    }

    private ServiceReplyDto getKongServices(String kongUrl) {
        T result = client.invoke(kongUrl, HttpMethod.GET, (T) "body", migrationConfig.getKongConfig().getUserName(),
                migrationConfig.getKongConfig().getPassword(), ServiceReplyDto.class);

        ServiceReplyDto serviceReplyDto = ServiceReplyDto.class.cast(result);

        return serviceReplyDto;
    }

    private NewUpstreamReplyDto createKongUpstream(String kongUrl, NewUpstreamRequestDto requestDto) {
        T result = client.invoke(kongUrl, HttpMethod.POST, (T) requestDto,
                migrationConfig.getKongConfig().getUserName(), migrationConfig.getKongConfig().getPassword(),
                NewUpstreamReplyDto.class);

        NewUpstreamReplyDto newUpstreamReplyDto = NewUpstreamReplyDto.class.cast(result);

        return newUpstreamReplyDto;
    }

    private NewUpstreamTargetReplyDto createKongUpstreamTarget(String kongUrl, NewUpstreamTargetRequestDto requestDto) {
        T result = client.invoke(kongUrl, HttpMethod.POST, (T) requestDto,
                migrationConfig.getKongConfig().getUserName(), migrationConfig.getKongConfig().getPassword(),
                NewUpstreamTargetReplyDto.class);

        NewUpstreamTargetReplyDto newUpstreamTargetReplyDto = NewUpstreamTargetReplyDto.class.cast(result);

        return newUpstreamTargetReplyDto;
    }

    private NewServiceReplyDto createKongServices(String kongUrl, NewServiceRequestDto requestDto) {
        T result = client.invoke(kongUrl, HttpMethod.POST, (T) requestDto,
                migrationConfig.getKongConfig().getUserName(), migrationConfig.getKongConfig().getPassword(),
                NewServiceReplyDto.class);

        NewServiceReplyDto newServiceReplyDto = NewServiceReplyDto.class.cast(result);

        return newServiceReplyDto;
    }

    private UpdateServiceReplyDto updateKongServices(String kongUrl, UpdateServiceRequestDto requestDto) {
        T result = client.invoke(kongUrl, HttpMethod.PUT, (T) requestDto,
                migrationConfig.getKongConfig().getUserName(), migrationConfig.getKongConfig().getPassword(),
                UpdateServiceReplyDto.class);

        UpdateServiceReplyDto updateServiceReplyDto = UpdateServiceReplyDto.class.cast(result);

        return updateServiceReplyDto;
    }

    private NewRouteReplyDto createKongRoutes(String kongUrl, NewRouteRequestDto requestDto) {
        T result = client.invoke(kongUrl, HttpMethod.POST, (T) requestDto,
                migrationConfig.getKongConfig().getUserName(), migrationConfig.getKongConfig().getPassword(),
                NewRouteReplyDto.class);

        NewRouteReplyDto newRouteReplyDto = NewRouteReplyDto.class.cast(result);

        return newRouteReplyDto;
    }

    public String removeExtension(String fileName) {
        if (fileName.indexOf(".") > 0) {
            return fileName.substring(0, fileName.lastIndexOf("."));
        } else {
            return fileName;
        }
 
    }
}
