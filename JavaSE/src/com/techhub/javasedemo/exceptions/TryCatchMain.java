package com.techhub.javasedemo.exceptions;

public class TryCatchMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("************ Program Started ************");

		char arr[] = { 'A', 'B', 'C', 'D' };
		
		int divResult = 0;

		try {
			System.out.println("(try block started)");
			divResult = 5 / 2;
			char c = arr[2];
			System.out.println("(try block ended)");
			return;
		} catch (Exception e) {
			System.out.println("(Catch block started)");
			System.out.println(e.getMessage());
			System.out.println("(Catch block ended)");
			return;
		} finally {
			System.out.println("Hello");
		}

//		System.out.println("divResult : " + divResult);
//		System.out.println("************ Program Ended ************");
	}

}
