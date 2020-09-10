package com.reviewapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.reviewapp.data")
@EnableJpaRepositories("com.reviewapp.repositories")
public class ReviewAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewAppApplication.class, args);
	}

}
