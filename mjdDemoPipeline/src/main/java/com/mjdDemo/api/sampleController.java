package com.mjdDemo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class sampleController {
	
	@GetMapping("/hello")
	public String getHello()
	{
		return "Hello World!";
	}

}
