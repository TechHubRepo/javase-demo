package com.techhub.java8.features.methodref;

import java.util.logging.Logger;

public class MethodRefMain {
	
	/** The LOGGER Constant */
	private static Logger LOGGER = Logger.getLogger(MethodRefMain.class.getSimpleName());

	public static void main(String[] args) {
		
		Greeting greeting = new Greeting();

		Greetable greetable = greeting::greetNameste;

		LOGGER.info(greetable.greet());
	}
}
