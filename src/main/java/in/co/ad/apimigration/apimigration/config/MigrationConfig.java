package in.co.ad.apimigration.apimigration.config;

import org.springframework.context.annotation.Configuration;

import in.co.ad.apimigration.apimigration.apigee.config.ApigeeConfigProperties;
import in.co.ad.apimigration.apimigration.kong.config.KongConfigProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Configuration
@RequiredArgsConstructor
@Getter
@Setter
public class MigrationConfig {
    private final ApigeeConfigProperties apigeeConfig;
    private final KongConfigProperties kongConfig;
}
