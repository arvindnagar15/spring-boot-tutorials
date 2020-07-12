package com.developers.choice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developers.choice.manager.ServiceManager;

@RestController
public class MyController {
	
	@Autowired
	ServiceManager serviceManager;
	
	@Bean
	public ServiceManager getServiceManager() {
		return new ServiceManager();
	}
	
	@GetMapping(name="/sayHello")
	public String getData() {
		return serviceManager.getMessage("Arvind");
	}

}
