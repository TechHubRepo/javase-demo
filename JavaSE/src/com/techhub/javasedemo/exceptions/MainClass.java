package com.techhub.javasedemo.exceptions;

public class MainClass {

	static {
//		SystemUtil.changeErr();
//		SystemUtil.changeOut();
	}

	public static void main(String[] args) {
		System.out.println("************ Program Started ************");
		
		char arr[] = { 'A', 'B', 'C', 'D' };
		/** IndexOutOfBoundException */
		System.out.println(arr[5]);

		/** NegativeArraySizeException */
//		String arr2[]=new String[0];

		/** ArithmeticException */
//		int result = 5 / 0;
//		System.out.println("result : " + result);

//		Person person = null;
		/** NullPointerException */
//		System.out.println(person.getPersonName());

//		recursiveTest(10);

		System.out.println("************ Program Ended ************");
	}

	public static void recursiveTest(int x) {
		/** OutOfMemoryError */
//		String[] arr = new String[1000112021];
		System.out.println(x);
		/** Recursive method invocation [ StackOverflowError ] */
		recursiveTest(x);
	}
}
