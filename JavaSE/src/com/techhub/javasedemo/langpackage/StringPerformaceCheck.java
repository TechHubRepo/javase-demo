package com.techhub.javasedemo.langpackage;

public class StringPerformaceCheck {

	public static void main(String[] args) {
		long sTime = System.nanoTime();
		
		
		String s = "Hello";
		s = s + " "+ "friends"+ " "+ "welcome"+ " "+ "to"+ " "+ "the"+ " "+ "Java"+ " "+ "World";
		System.out.println(s);
		
		
		System.out.println("ms :" + (System.nanoTime() - sTime));
	}

}
