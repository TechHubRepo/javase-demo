package com.techhub.javasedemo.p1;

import com.techhub.javasedemo.modifiers.Hello;
//import com.techhub.javasedemo.modifiers.TestA;

public class MainClass {

	public static void main(String[] args) {
		
//		TestA testA=new TestA();
		
		Hello hello = new Hello();

		System.out.println(hello.getF1());

		/** The Default and protected variable can't be accessed */
//		System.out.println(hello.f2);
//		System.out.println(hello.f3);
		
		System.out.println(hello.f4);
		
	}
}
