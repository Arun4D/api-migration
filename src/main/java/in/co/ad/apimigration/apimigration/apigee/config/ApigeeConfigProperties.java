package in.co.ad.apimigration.apimigration.apigee.config;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix="api.migration.source.apigee")
@RequiredArgsConstructor
@Getter
@Setter
public class ApigeeConfigProperties {
    
    private String baseUrl;
    private String baseVersion;
    private String organizationsName;
    private String userName;
    private String password; 
    //@Value("#{'${includeApiList}'.split(',')}")
    private List<String> includeApiList; 
    //@Value("#{'${excludeApiList}'.split(',')}")
    private List<String>  excludeApiList; 
    private String authToken; 
    private String tokenLoginBaseUrl; 
    private String openApiDownloadPath; 
}

