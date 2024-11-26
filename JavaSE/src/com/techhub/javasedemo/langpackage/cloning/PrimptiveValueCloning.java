package com.techhub.javasedemo.langpackage.cloning;

public class PrimptiveValueCloning {

	public static void main(String[] args) {
		byte b1 = 100;
		byte b2 = b1;

		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);

		System.out.println("****************");
		b2 = 120;

		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
	}
}
