package com.techhub.javasedemo.interfacedemo;

public interface MyInterface {

	public static String f1 = "Hi";

	public String f2 = "Hello";

	public abstract void myMethod();

	public abstract void myMethod(String name);

	public void myMethod(int num);

	public void myMethod(String name, int num);

	public void myMethod(int num, String name);

	public default void method2() {
		System.out.println("**************** Default method of My Interface ****************");
	}
}
