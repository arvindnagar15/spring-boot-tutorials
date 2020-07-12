package com.developers.choice.manager;

import org.springframework.stereotype.Component;

@Component
public class ServiceManager {

	public String getMessage(String name) {
		return "Hello Friends!!! My name is "+name;
	}
	
}
