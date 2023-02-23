package in.co.ad.apimigration.apimigration.kong.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix="api.migration.target.kong")
@Getter
@Setter
public class KongConfigProperties {
    private String baseUrl;
    private String baseVersion;
    private String userName;
    private String password; 
}
