package com.techhub.javasedemo.operators;

public class BitwiseOperator {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;

		System.out.println("Bitwise NOT : " + (~x));

		System.out.println("Bitwise AND : " + (x & y));

		System.out.println("Bitwise OR : " + (x | y));

		System.out.println("Bitwise XOR : " + (x ^ y));
		
		System.out.println("Left Shift << : " + (x<<1));
		
		System.out.println("Right Shift >> : " + (x>>1));

	}

}
