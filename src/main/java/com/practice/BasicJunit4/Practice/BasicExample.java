package com.practice.BasicJunit4.Practice;

public class BasicExample {
	
	
	private String message;
	
	public BasicExample(String message) {
		this.message=message;
	}
	public String printMessage() {
		System.out.println(message);
		return message;
	}
}	
