package com.peradone.auth.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceService {

	@GetMapping("/home")
	public String homeEndpoint() {
		return "Hello !";
	}
	
}
