package com.techhub.demo.java9.newfeautres;

public interface InterfacesPrivateMethod {

	private String getMessage() {
		return "Hello World";
	}
	
	default String showDefaultMessage() {
		return getMessage();
	}
}
