package com.techhub.java8.features.lambdaexp;

import java.util.logging.Logger;

/**
 * The implementation for FunInterface
 * 
 * @author ramniwash
 */
public class FunInterfaceImpl implements FunInterface {

	/** The LOGGER Constant */
	private static Logger LOGGER = Logger.getLogger(FunInterfaceImpl.class.getSimpleName());

	@Override
	public void absMethod() {
		LOGGER.info("::: FunInterfaceImpl -> public void absMethod() :::");
	}
}
