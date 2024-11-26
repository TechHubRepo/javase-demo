package com.techhub.javasedemo.classandobject;

public class Person {

	static {
		System.out.println("Static Block -> Person");
	}

	{
		System.out.println("Instance Block -> Person");
	}
}
