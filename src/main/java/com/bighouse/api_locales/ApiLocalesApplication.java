package com.bighouse.api_locales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ApiLocalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiLocalesApplication.class, args);
	}

}
