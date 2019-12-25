package com.basaveshinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserReviewMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserReviewMicroserviceApplication.class, args);
	}

}
