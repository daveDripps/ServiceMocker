package com.thebelfastcodeforge.servicemocker.controllers;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGoodbyeController {
	
	private final Logger logger = LoggerFactory.getLogger(HelloGoodbyeController.class);
	
	private final UUID uuid = UUID.randomUUID();

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello(@RequestBody String input) {
		String output = "Hello World"+" contents: "+input;
		logger.debug(output);
		return output;
	}
	@RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
	public String helloWorld() {
		String output = "Hello World"+" from "+uuid.toString();
		logger.debug(output);
		return output;
	}
	
	@RequestMapping(value = "/goodbyeWorld", method = RequestMethod.GET)
	public String goodbyeWorld() {
		String output = "Goodbye World"+" from "+uuid.toString();
		logger.debug(output);
		return output;
	}

	
	@RequestMapping(value = "/helloOne", method = RequestMethod.GET)
	public String helloOne() {
		String output = "Hello One"+" from "+uuid.toString();
		logger.debug(output);
		return output;
	}
	
	@RequestMapping(value = "/helloTwo", method = RequestMethod.GET)
	public String helloTwo() {
		String output =  "Hello Two"+" from "+uuid.toString();
		logger.debug(output);
		return output;
	}
	
	@RequestMapping(value = "/helloThree", method = RequestMethod.GET)
	public String helloThree() {
		String output =  "Hello Three"+" from "+uuid.toString();
		logger.debug(output);
		return output;
	}
	
	@RequestMapping(value = "/helloFour", method = RequestMethod.GET)
	public String helloFour() {
		String output =  "Hello Four"+" from "+uuid.toString();
		logger.debug(output);
		return output;
	}
	
	@RequestMapping(value = "/helloFive", method = RequestMethod.GET)
	public String helloFive() {
		String output =  "Hello Five"+" from "+uuid.toString();
		logger.debug(output);
		return output;
	}
	
	@RequestMapping(value = "/goodbyeOne", method = RequestMethod.GET)
	public String goodbyeOne() {
		String output =  "Goodbye One"+" from "+uuid.toString();
		logger.debug(output);
		return output;
	}
	
	@RequestMapping(value = "/goodbyeTwo", method = RequestMethod.GET)
	public String goodbyeTwo() {
		String output =  "Goodbye Two"+" from "+uuid.toString();
		logger.debug(output);
		return output;
	}
	
	@RequestMapping(value = "/goodbyeThree", method = RequestMethod.GET)
	public String goodbyeThree() {
		String output =  "Goodbye Three"+" from "+uuid.toString();
		logger.debug(output);
		return output;
	}
	
	@RequestMapping(value = "/goodbyeFour", method = RequestMethod.GET)
	public String goodbyeFour() {
		String output =  "Goodbye Four"+" from "+uuid.toString();
		logger.debug(output);
		return output;
	}
	
	@RequestMapping(value = "/goodbyeFive", method = RequestMethod.GET)
	public String goodbyeFive() {
		String output =  "Goodbye Five"+" from "+uuid.toString();
		logger.debug(output);
		return output;
	}


}
