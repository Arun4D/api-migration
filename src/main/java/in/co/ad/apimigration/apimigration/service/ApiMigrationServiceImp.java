package in.co.ad.apimigration.apimigration.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.co.ad.apimigration.apimigration.apigee.dto.ApiRevisionDto;
import in.co.ad.apimigration.apimigration.client.RestClient;
import in.co.ad.apimigration.apimigration.config.MigrationConfig;
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
    }

    private List<String> getApigeeApis(String apigeeUrl) {
        T result =   client.invoke(apigeeUrl, migrationConfig.getApigeeConfig().getUserName(), migrationConfig.getApigeeConfig().getPassword(), String[].class);
        
        String[] apis = String[].class.cast(result);

        List<String> apiList = List.of(apis);
        return apiList;
    }

     private ApiRevisionDto getRevisions(String apigeeUrl) {
        T result =   client.invoke(apigeeUrl, migrationConfig.getApigeeConfig().getUserName(), migrationConfig.getApigeeConfig().getPassword(), ApiRevisionDto.class);
        
        ApiRevisionDto revisions = ApiRevisionDto.class.cast(result);

        return revisions;
    }
}
