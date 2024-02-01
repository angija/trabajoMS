package com.uisrael.apiWEB.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfiguracionMSGestion {

	@Bean("gestionRest")
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}
}
