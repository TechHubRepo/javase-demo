package com.techhub.javasedemo.array;

public class AnonymousArray {

	public static void main(String[] args) {

		printArray(new byte[] { 5,8,3,4,7,2,9,65,6,7,5, });

	}

	public static void printArray(byte arr[]) {
		for (byte b : arr) {
			System.out.print(b);
			System.out.print(",");
		}
	}

}
