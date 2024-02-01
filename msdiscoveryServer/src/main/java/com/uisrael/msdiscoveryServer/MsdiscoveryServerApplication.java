package com.uisrael.msdiscoveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsdiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsdiscoveryServerApplication.class, args);
	}

}
