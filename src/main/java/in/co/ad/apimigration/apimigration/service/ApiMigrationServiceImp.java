package in.co.ad.apimigration.apimigration.service;

import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import in.co.ad.apimigration.apimigration.apigee.dto.ApiRevisionDto;
import in.co.ad.apimigration.apimigration.client.RestClient;
import in.co.ad.apimigration.apimigration.config.MigrationConfig;
import in.co.ad.apimigration.apimigration.kong.dto.NewServiceReplyDto;
import in.co.ad.apimigration.apimigration.kong.dto.NewServiceRequestDto;
import in.co.ad.apimigration.apimigration.kong.dto.ServiceReplyDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApiMigrationServiceImp<T> implements ApiMigrationService{

    private final MigrationConfig migrationConfig;
    private final RestClient<T> client;

    @Override
    public void migrate() {
        
        String apigeeUrl = migrationConfig.getApigeeConfig().getBaseUrl() + "/" + migrationConfig.getApigeeConfig().getBaseVersion()+"/organizations/"+migrationConfig.getApigeeConfig().getOrganizationsName() + "/apis";

        List<String> apiList = getApigeeApis(apigeeUrl);

        log.info(apiList.toString());

        ApiRevisionDto getRevisions = getRevisions(apigeeUrl +"/Weather-API/revisions/10");
        log.info(getRevisions.toString());

        String kongUrl = migrationConfig.getKongConfig().getBaseUrl() + "/services";

        ServiceReplyDto serviceReplyDto = getKongServices(kongUrl);
        long count = serviceReplyDto.getData().stream().filter(data -> data.getName().equalsIgnoreCase("Weather-API")).count();
        if (count == 0) {
            kongUrl = kongUrl + "/Weather-API";
            createKongServices(kongUrl, getRevisions.getName(), getRevisions.getBasepaths().get(0));
        }    
    }

    private List<String> getApigeeApis(String apigeeUrl) {
        T result =   client.invoke(apigeeUrl, HttpMethod.GET, (T)"body", migrationConfig.getApigeeConfig().getUserName(), migrationConfig.getApigeeConfig().getPassword(), String[].class);
        
        String[] apis = String[].class.cast(result);

        List<String> apiList = List.of(apis);
        return apiList;
    }

    private ApiRevisionDto getRevisions(String apigeeUrl) {

        T result =   client.invoke(apigeeUrl, HttpMethod.GET, (T)"body", migrationConfig.getApigeeConfig().getUserName(), migrationConfig.getApigeeConfig().getPassword(), ApiRevisionDto.class);
        
        ApiRevisionDto revisions = ApiRevisionDto.class.cast(result);

        return revisions;
    }

    private ServiceReplyDto getKongServices(String kongUrl) {
        T result =   client.invoke(kongUrl, HttpMethod.GET, (T)"body",migrationConfig.getKongConfig().getUserName(), migrationConfig.getKongConfig().getPassword(), ServiceReplyDto.class);
        
        ServiceReplyDto serviceReplyDto = ServiceReplyDto.class.cast(result);

        return serviceReplyDto;
    }

    private NewServiceReplyDto createKongServices(String kongUrl, String name, String url) {
        NewServiceRequestDto newServiceRequestDto = new NewServiceRequestDto();
        newServiceRequestDto.setName(name);
        newServiceRequestDto.setUrl(url);
        T result =   client.invoke(kongUrl, HttpMethod.POST, (T) newServiceRequestDto,migrationConfig.getKongConfig().getUserName(), migrationConfig.getKongConfig().getPassword(), NewServiceReplyDto.class);
        
        NewServiceReplyDto newServiceReplyDto = NewServiceReplyDto.class.cast(result);

        return newServiceReplyDto;
    }
}
