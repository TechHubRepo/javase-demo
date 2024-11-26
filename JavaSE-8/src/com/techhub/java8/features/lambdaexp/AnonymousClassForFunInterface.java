package com.techhub.java8.features.lambdaexp;

import java.util.logging.Logger;

public class AnonymousClassForFunInterface {

	/** The LOGGER Constant */
	private static Logger LOGGER = Logger.getLogger(AnonymousClassForFunInterface.class.getSimpleName());

	public static void main(String[] args) {

		FunInterface funInterface = new FunInterface() {
			@Override
			public void absMethod() {
				LOGGER.info("::: AnonymousClass -> public void absMethod() :::");
			}
		};
		
		LOGGER.info(FunInterface.staticMethod());
		LOGGER.info(funInterface.defMethod());
		funInterface.absMethod();
	}
}
