package com.chocoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ChocoappRegistryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChocoappRegistryMsApiApplication.class, args);
	}

}
