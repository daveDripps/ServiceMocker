package com.thebelfastcodeforge.servicemocker.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGoodbyeController {
	
	@RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping(value = "/goodbyeWorld", method = RequestMethod.GET)
	public String goodbyeWorld() {
		return "Goodbye World";
	}

	
	@RequestMapping(value = "/helloOne", method = RequestMethod.GET)
	public String helloOne() {
		return "Hello One";
	}
	
	@RequestMapping(value = "/helloTwo", method = RequestMethod.GET)
	public String helloTwo() {
		return "Hello Two";
	}
	
	@RequestMapping(value = "/helloThree", method = RequestMethod.GET)
	public String helloThree() {
		return "Hello Three";
	}
	
	@RequestMapping(value = "/helloFour", method = RequestMethod.GET)
	public String helloFour() {
		return "Hello Four";
	}
	
	@RequestMapping(value = "/helloFive", method = RequestMethod.GET)
	public String helloFive() {
		return "Hello Five";
	}
	
	@RequestMapping(value = "/goodbyeOne", method = RequestMethod.GET)
	public String goodbyeOne() {
		return "Goodbye One";
	}
	
	@RequestMapping(value = "/goodbyeTwo", method = RequestMethod.GET)
	public String goodbyeTwo() {
		return "Goodbye Two";
	}
	
	@RequestMapping(value = "/goodbyeThree", method = RequestMethod.GET)
	public String goodbyeThree() {
		return "Goodbye Three";
	}
	
	@RequestMapping(value = "/goodbyeFour", method = RequestMethod.GET)
	public String goodbyeFour() {
		return "Goodbye Four";
	}
	
	@RequestMapping(value = "/goodbyeFive", method = RequestMethod.GET)
	public String goodbyeFive() {
		return "Goodbye Five";
	}


}
