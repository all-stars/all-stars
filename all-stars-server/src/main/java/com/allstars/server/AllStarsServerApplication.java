package com.allstars.server;

import com.allstars.server.config.AllStarsProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({LiquibaseProperties.class, AllStarsProperties.class})
public class AllStarsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllStarsServerApplication.class, args);
	}
}
