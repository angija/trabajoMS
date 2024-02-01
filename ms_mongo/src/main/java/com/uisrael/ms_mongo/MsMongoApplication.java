package com.uisrael.ms_mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMongoApplication.class, args);
	}

}
