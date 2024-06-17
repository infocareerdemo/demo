package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
		
	}
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
		
	}
	

	@GetMapping("/student")
	public String student() {
		return "student";
		
	}

}
