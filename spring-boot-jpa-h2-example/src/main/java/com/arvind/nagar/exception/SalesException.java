package com.arvind.nagar.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SalesException extends RuntimeException{

	private String errorCode;
	private String errorMessage;
	
	public SalesException() {
		
	}
	public SalesException(String error, String desc) {
		super(error);
		this.errorCode = error;
		this.errorMessage = desc;
		
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
