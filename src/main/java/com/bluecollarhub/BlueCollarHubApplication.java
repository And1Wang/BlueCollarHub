package com.bluecollarhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableJpaRepositories("com.bluecollarhub.repository")
public class BlueCollarHubApplication {

	private static final Logger logger = LoggerFactory.getLogger(BlueCollarHubApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BlueCollarHubApplication.class, args);
        logger.info("BlueCollarHub Application started successfully!");
	}

}
