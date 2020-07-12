/**
 * 
 */
package com.arvind.nagar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Scorpio
 *
 */
@RestController
public class RequestHandler {

	@RequestMapping(name="sayhello", method=RequestMethod.GET)
	public String sayHello() {
		return "Hello friends";
	}
}
