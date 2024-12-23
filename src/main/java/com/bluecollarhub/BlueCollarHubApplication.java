package com.bluecollarhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.bluecollarhub.repository")
public class BlueCollarHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueCollarHubApplication.class, args);
		System.out.println("Hello World");
	}

}
