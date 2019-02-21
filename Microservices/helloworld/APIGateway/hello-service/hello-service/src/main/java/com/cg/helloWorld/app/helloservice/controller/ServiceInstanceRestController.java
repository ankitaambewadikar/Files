package com.cg.helloWorld.app.helloservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableDiscoveryClient
@RestController
class ServiceInstanceRestController {

	/*
	 * @Autowired private DiscoveryClient discoveryClient;
	 * 
	 * @RequestMapping("/service-instances/{applicationName}") public
	 * List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable String
	 * applicationName) { return this.discoveryClient.getInstances(applicationName);
	 * }
	 */
	
	@GetMapping
	public String getHello() {
		return "Hello Ankita";
	}
}
