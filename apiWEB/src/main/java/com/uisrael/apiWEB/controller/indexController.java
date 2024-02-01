package com.uisrael.apiWEB.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class indexController {

	@GetMapping("/")
	public String abriIndex() {
		
		return "Index";
	}
}
