package com.techhub.javasedemo.langpackage;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hello";
//		String s3 = "Hai";

		String s4 = new String("Hello");
		String s5 = new String("Hello");
		String s6 = new String("World");

		String s7 = s6;
		String s8 = s6.intern();

		System.out.println("( s1==s2 ) : " + (s1 == s2));
		System.out.println("( s4==s5 ) : " + (s4 == s5));
		
		System.out.println("( s6==s7 ) : " + (s6 == s7));
		System.out.println("( s6==s6 ) : " + (s6 == s8));
		
		
	}
}
