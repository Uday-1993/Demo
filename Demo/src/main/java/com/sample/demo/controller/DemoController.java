package com.sample.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping(value = "/healthCheck")
	public String healthCheck() 
	{
		return "Up....!";
	}
	
	@GetMapping(value = "/hello")
	public String hello() 
	{
		return "hello....!";
	}

}
