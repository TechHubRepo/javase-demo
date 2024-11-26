package com.techhub.java8.features.lambdaexp;

import java.util.logging.Logger;

/**
 * The implementation for FunInterface
 * 
 * @author ramniwash
 */
public class FunInterfaceMain {

	/** The LOGGER Constant */
	private static Logger LOGGER = Logger.getLogger(FunInterfaceMain.class.getSimpleName());

	public static void main(String[] args) {

		FunInterface funInterface = new FunInterfaceImpl();

		LOGGER.info(FunInterface.staticMethod());
		LOGGER.info(funInterface.defMethod());
		funInterface.absMethod();
	}
}
