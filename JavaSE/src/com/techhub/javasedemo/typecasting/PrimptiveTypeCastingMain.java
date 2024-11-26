package com.techhub.javasedemo.typecasting;

public class PrimptiveTypeCastingMain {

	public static void main(String[] args) {
		
		/**Implicit  type Casting */
		byte x=120;
		int y=x;   

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		/** Explicit type Casting */
		int a = 310;
		byte b = (byte) a;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
}
