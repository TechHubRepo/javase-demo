package com.techhub.javasedemo.operators;

public class IncrementDecrementOperators {

	public static void main(String[] args) {

		int x = 4, y = 2;

//		x++;
//		y++;
		
		/**
		 * 4 + 3 + 5= 
		 */
		int sum=x++ + ++y + x +y;
		System.out.println("Sum : "+sum);
		
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}

}
