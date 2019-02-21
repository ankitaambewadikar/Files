package com.cg.websit.website.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@EnableCircuitBreaker
@Controller
public class WebsiteResource {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/hello")
	public String hello() {
		return "hello";

	}

	@HystrixCommand(fallbackMethod="fallback")
	@RequestMapping("/output")
	public String home(Model model) {
		String output = restTemplate
				.exchange("http://localhost:9090", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
				}).getBody();
		model.addAttribute("output", output);
		return "hello";

	}

	public String fallback(Model model) {
		String output = "Good Morning";
		model.addAttribute("output", output);
		return "hello";

	}
}