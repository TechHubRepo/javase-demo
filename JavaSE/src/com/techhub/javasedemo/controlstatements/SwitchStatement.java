package com.techhub.javasedemo.controlstatements;

public class SwitchStatement {

	public static void main(String[] args) {

		int x = 3;

		switch (x) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		case 4: {
			System.out.println("Thursday");
			break;
		}
		case 5: {
			System.out.println("Friday");
			break;
		}
		case 6: {
			System.out.println("Saturday");
			break;
		}
		case 7: {
			System.out.println("Sunday");
			break;
		}
		default: {
			System.out.println("Invalid day of week number");
//			throw new IllegalArgumentException("Invalid day of week number: " + x);
//			throw new IllegalStateException("Invalid day of week number: " + x);
		}
		}

		System.out.println("****************************************");

		switch (x) {
		case 1, 3, 5, 7: {
			System.out.println("Odd Day");
			break;
		}
		case 2, 4, 6: {
			System.out.println("Even Day");
			break;
		}
		}

	}
}