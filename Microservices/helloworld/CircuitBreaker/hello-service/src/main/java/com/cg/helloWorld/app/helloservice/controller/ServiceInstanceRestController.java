package com.cg.helloWorld.app.helloservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ServiceInstanceRestController {

	@GetMapping
	public String getHello() {
		return "Hello Ankita";
	}
}
