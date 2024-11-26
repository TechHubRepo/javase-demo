package com.techhub.java8.features.intrf;

import java.util.logging.Logger;

public class MyInterfaceImpl implements MyInterface {

	private Logger LOGGER = Logger.getLogger(MyInterfaceImpl.class.getSimpleName());

	@Override
	public void show() {
		LOGGER.info("::::: MyInterfaceImpl -> show() :::::");
	}

	@Override
	public void display() {
		LOGGER.info("::::: MyInterfaceImpl -> display() :::::");
	}
	
	@Override
	public String printName() {
		return MyInterfaceImpl.class.getSimpleName();
	}
	
}
