package com.techhub.javasedemo.classandobject;

public class Student extends Person {

	static {
		System.out.println("Static Block -> Student");
		System.out.println("sfV1 : "+Student.sfV1);
	}

	{
		System.out.println("Instance Block -> Student");
		System.out.println("ifV1 : "+this.ifV1);
	}
	
	public static String sfV1="Hello";
	
	public String ifV1="Hi";

	@Override
	public String toString() {
		return "Student [ifV1=" + ifV1 + "]";
	}
	
	

}
