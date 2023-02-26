package in.co.ad.apimigration.apimigration.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import in.co.ad.apimigration.apimigration.apigee.dto.ApiProxyDto;
import in.co.ad.apimigration.apimigration.apigee.dto.ApiRevisionDto;
import in.co.ad.apimigration.apimigration.apigee.dto.ApiTargetDto;
import in.co.ad.apimigration.apimigration.apigee.dto.ApiTargetServerDto;
import in.co.ad.apimigration.apimigration.client.RestClient;
import in.co.ad.apimigration.apimigration.config.MigrationConfig;
import in.co.ad.apimigration.apimigration.dto.SourceApiMappingDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewRouteReplyDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewRouteRequestDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewServiceReplyDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewServiceRequestDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewUpstreamReplyDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewUpstreamRequestDto;
import in.co.ad.apimigration.apimigration.kong.dto.ServiceReplyDto;
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
                + migrationConfig.getApigeeConfig().getBaseVersion() + "/organizations/";

        String apigeeUrl = apigeeBaseUrl +  "/apis";
        String apigeeEnvUrl = apigeeBaseUrl +  "/environment";

        List<String> apiList = getApigeeApis(apigeeUrl);

        log.info("Before apply filter: ", apiList.toString());

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
                        .map(server-> server.getName())
                        .collect(Collectors.toList()))
                .flatMap(list-> list.stream())
                .collect(Collectors.toList());


            List<String> environments = getApigeeAllEnv(apigeeEnvUrl);

            environments.stream().forEach(env -> {

                List<String> targetServers = getApigeeAllEnvTargetServer(apigeeEnvUrl + "/" + env + "/targetservers");
                List<ApiTargetServerDto> servers =  targetServers.stream()
                    .filter(server -> serverList.stream().anyMatch(apiServer -> apiServer.equals(server)))
                    .map(server -> getApigeeEnvironmentServer(apigeeEnvUrl + "/" + env + "/targetservers" + "/" + server)).collect(Collectors.toList());
                    
                    apiMappingDto.setTargets(servers.stream().map(apiTarget -> apiTarget.getHost() + ":" + apiTarget.getPort()).collect(Collectors.toList()));
                     
            });

            /* List<ApiTargetServerDto> servers = targetServers.stream()
                .map(server -> getApigeeEnvironmentServer(apigeeEnvUrl + "/" + env + "/targetservers" + "/" + server))
                    .flatMap(list -> list.stream()).collect(Collectors.toList());

            // urlList = urlList.stream().distinct().collect(Collectors.toList());

            if (!CollectionUtils.isEmpty(urlList)) {
                apiMappingDto.setServiceUrl(urlList.get(0));
            } else {
                apiMappingDto.setValidationFailed(true);
                apiMappingDto.setValidationFailedMessage("Service Url is empty.");
                // throw error
            }
 */
            sourceApiMapping.add(apiMappingDto);

        });

        String kongUrl = migrationConfig.getKongConfig().getBaseUrl() + "/services";

        String kongUpstreamUrl = migrationConfig.getKongConfig().getBaseUrl() + "/upstream";

        ServiceReplyDto serviceReplyDto = getKongServices(kongUrl);

        sourceApiMapping.stream()
                .filter(mapping -> mapping.isValidationFailed() == false)
                .forEach(mapping -> {

                    long count = serviceReplyDto.getData().stream()
                            .filter(data -> data.getName().equalsIgnoreCase(mapping.getServiceName() + "_service"))
                            .count();
                    NewServiceReplyDto newServiceReplyDto = null;

                    if (count == 0) {
                        NewServiceRequestDto requestDto = new NewServiceRequestDto();
                        requestDto.setName(mapping.getServiceName());
                        requestDto.setUrl(mapping.getServiceUrl());

                        newServiceReplyDto = createKongServices(kongUrl, requestDto);

                        log.info("Kong new Service: ", newServiceReplyDto);

                    }

                    if (newServiceReplyDto != null) {
                        NewRouteRequestDto requestDto = new NewRouteRequestDto();
                        requestDto.setName(mapping.getRouteName());
                        requestDto.setPaths(mapping.getRoutePaths());
                        String routeKongUrl = kongUrl + "/" + mapping.getServiceName();

                        NewRouteReplyDto replyDto = createKongRoutes(routeKongUrl, requestDto);

                        log.info("Kong new Route: ", replyDto);

                    }
                });

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

    private NewServiceReplyDto createKongServices(String kongUrl, NewServiceRequestDto requestDto) {
        T result = client.invoke(kongUrl, HttpMethod.POST, (T) requestDto,
                migrationConfig.getKongConfig().getUserName(), migrationConfig.getKongConfig().getPassword(),
                NewServiceReplyDto.class);

        NewServiceReplyDto newServiceReplyDto = NewServiceReplyDto.class.cast(result);

        return newServiceReplyDto;
    }

    private NewRouteReplyDto createKongRoutes(String kongUrl, NewRouteRequestDto requestDto) {
        T result = client.invoke(kongUrl, HttpMethod.POST, (T) requestDto,
                migrationConfig.getKongConfig().getUserName(), migrationConfig.getKongConfig().getPassword(),
                NewRouteReplyDto.class);

        NewRouteReplyDto newRouteReplyDto = NewRouteReplyDto.class.cast(result);

        return newRouteReplyDto;
    }

}
