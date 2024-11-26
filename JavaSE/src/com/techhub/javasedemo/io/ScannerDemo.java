package com.techhub.javasedemo.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner("Hello\nWorld");
		

		System.out.println("Line : " + scanner.next());
		System.out.println("Line : " + scanner.next());

		scanner.close();
	}
}
