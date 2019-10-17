package com.thebelfastcodeforge.servicemocker.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping(value = "/goodbyeWorld", method = RequestMethod.GET)
	public String goodbyeWorld() {
		return "Goodbye World";
	}


}
