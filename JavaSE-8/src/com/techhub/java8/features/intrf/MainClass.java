package com.techhub.java8.features.intrf;

import java.util.logging.Logger;

public class MainClass {

	private static Logger LOGGER = Logger.getLogger(MainClass.class.getSimpleName());

	public static void main(String[] args) {
		
		MyInterface myInterface = new MyInterfaceImpl();
		
		myInterface.show();
		myInterface.display();
		
		LOGGER.info(myInterface.printName());
		LOGGER.info(MyInterface.getMessage());
	}
}
