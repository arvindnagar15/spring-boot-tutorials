package com.example.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(RequestHandler.class);
	@RequestMapping(name="hello", method=RequestMethod.GET)
	public String sayHello(@RequestParam String name) {
		LOGGER.info("Entering into sayHello zone with name222 - : "+name);
		return "Hello "+name;
	}
	
}
