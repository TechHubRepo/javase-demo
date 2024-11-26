package com.techhub.javasedemo.operators;

public class LogicalOperators {

	public static void main(String[] args) {

		int x = 5, y = 2, z = 4;

		System.out.println("********** Greatest **********");

		if (x > y && x > z) {
			System.out.println(x);
		}

		if (y > x && y > z) {
			System.out.println(y);
		}

		if (z > x && z > y) {
			System.out.println(z);
		}

		System.out.println("----------------------------------------------");
		
		boolean a = true, b = true;
		
		System.out.println("a : "+a);
		System.out.println("a : "+!a);
		
		if(a || b) {
			System.out.println("either a or b is true");
		}
		
		if(a && b) {
			System.out.println("a and b are true");
		}
	}
}
