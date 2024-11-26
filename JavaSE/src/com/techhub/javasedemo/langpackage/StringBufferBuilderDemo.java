package com.techhub.javasedemo.langpackage;

public class StringBufferBuilderDemo {

	public static void main(String[] args) {
		long sTime = System.nanoTime();
		
//		StringBuffer string = new StringBuffer();
		StringBuilder string = new StringBuilder();
		string.append("Hello");
		string.append(" ");
		string.append("friends");
		string.append(" ");
		string.append("welcome");
		string.append(" ");
		string.append("to");
		string.append(" ");
		string.append("the");
		string.append(" ");
		string.append("Java");
		string.append(" ");
		string.append("World");

		System.out.println(string);
		
		System.out.println("Time nano s :" + (System.nanoTime() - sTime));
	}
}
