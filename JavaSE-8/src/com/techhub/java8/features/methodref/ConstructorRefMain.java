package com.techhub.java8.features.methodref;

import java.util.logging.Logger;

public class ConstructorRefMain {

	/** The LOGGER Constant */
	private static Logger LOGGER = Logger.getLogger(ConstructorRefMain.class.getSimpleName());

	public static void main(String[] args) {

		Greetable greetable = String::new;

		LOGGER.info(greetable.greet());
	}
}
