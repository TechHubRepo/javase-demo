package com.techhub.java8.features.thisinmethodparam;

import java.util.logging.Logger;

public class HelloMain {

	/** The Logger LOGGER */
	private static Logger LOGGER = Logger.getLogger(HelloMain.class.getSimpleName());

	public static void main(String[] args) {

		Hello hello = new Hello("Hello World, Welcome to Java 8 Features.");

		LOGGER.info(hello.toString());
		
		hello.setMessage("Nameste, Java Programming me apka swagat hai |");
		
		LOGGER.info(hello.toString());
		
		hello.setMessage("ABC message");
		
		LOGGER.info(hello.getMessage());
	}
}
