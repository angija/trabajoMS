package com.uisrael.msclienteMongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsclienteMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsclienteMongoApplication.class, args);
	}

}
