package in.co.ad.apimigration.apimigration.apigee.config;
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
}

