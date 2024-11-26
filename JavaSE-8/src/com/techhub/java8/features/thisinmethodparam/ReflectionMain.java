package com.techhub.java8.features.thisinmethodparam;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.logging.Logger;

public class ReflectionMain {
	
	/** The Logger LOGGER */
	private static Logger LOGGER = Logger.getLogger(HelloMain.class.getSimpleName());

	public static void main(String[] args) throws Exception {

		Class<Hello> helloClass = Hello.class;

		Method methods = helloClass.getMethod("setMessage",String.class);

		Parameter parameters[] = methods.getParameters();
		for (Parameter parameter : parameters) {
			LOGGER.info("TYPE : "+parameter.getType().getSimpleName());
			LOGGER.info("TYPE : "+parameter.getName());
		}
	}
}
