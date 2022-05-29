package com.springboot.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class AlgoDomainProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgoDomainProjectApplication.class, args);
	}

}
