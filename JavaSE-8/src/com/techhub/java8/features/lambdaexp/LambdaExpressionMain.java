package com.techhub.java8.features.lambdaexp;

import java.util.logging.Logger;

public class LambdaExpressionMain {

	/** The LOGGER Constant */
	private static Logger LOGGER = Logger.getLogger(LambdaExpressionMain.class.getSimpleName());

	public static void main(String[] args) {

		FunInterface funInterface = () -> {
			LOGGER.info("::: LambdaExpression -> public void absMethod() :::");
		};
		
		LOGGER.info(FunInterface.staticMethod());
		LOGGER.info(funInterface.defMethod());
		funInterface.absMethod();
	}
}
