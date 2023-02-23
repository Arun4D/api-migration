package in.co.ad.apimigration.apimigration.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

import in.co.ad.apimigration.apimigration.apigee.config.ApigeeConfigProperties;
import in.co.ad.apimigration.apimigration.kong.config.KongConfigProperties;

@Configuration
@Import({ApigeeConfigProperties.class, KongConfigProperties.class})
public class AppConfig {
  
    
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
