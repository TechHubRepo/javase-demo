package com.techhub.java8.features.intrf;

public interface MyInterface {

	/**
	 * abstract method 
	 */
	public abstract void show();

	public abstract void display();

	public default String printName() {
		return MyInterface.class.getSimpleName();
	}

	public static String getMessage() {
		return "Hello Word, Welcome to Java 8 Features demo";
	}
}
