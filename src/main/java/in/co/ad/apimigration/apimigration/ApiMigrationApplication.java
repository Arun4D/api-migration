package in.co.ad.apimigration.apimigration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.co.ad.apimigration.apimigration.service.ApiMigrationService;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ApiMigrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiMigrationApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ApiMigrationService apiMigrationService) throws Exception {
		return args -> {
			apiMigrationService.migrate();
			log.info("Completed");
		};
	}

}
