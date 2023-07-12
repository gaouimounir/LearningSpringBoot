package com.roadtocda.demo.model;

public class HelloWorld {
	
	private String message = "HelloWorld";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
	
	

}
