package com.techhub.java8.features.lambdaexp;

@FunctionalInterface
public interface FunInterface {

	/** Abstract method */
	public abstract void absMethod();

	/** Static Method */
	public static String staticMethod() {
		return "::: FunInterface -> public static String staticMethod() :::";
	}

	/** Default Method */
	public default String defMethod() {
		return "::: FunInterface -> public default String defMethod()  :::";
	}
}
