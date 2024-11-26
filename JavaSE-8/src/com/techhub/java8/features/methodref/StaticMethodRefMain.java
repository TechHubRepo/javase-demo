package com.techhub.java8.features.methodref;

import java.util.logging.Logger;

public class StaticMethodRefMain {
	
	/** The LOGGER Constant */
	private static Logger LOGGER = Logger.getLogger(StaticMethodRefMain.class.getSimpleName());

	public static void main(String[] args) {

		Greetable greetable = Greeting2::greetHello;

		LOGGER.info(greetable.greet());
	}
}
