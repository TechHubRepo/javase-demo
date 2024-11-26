package com.techhub.javasedemo.controlstatements;

public class SwitchStatement2 {

	public static void main(String[] args) {

		int x = 10;

		String weekDayName = switch (x) {
		case 1: {
			System.out.println("Monday");
			yield "Monday";
		}
		case 2: {
			System.out.println("Tuesday");
			yield "Tuesday";
		}
		case 3: {
			System.out.println("Wednesday");
			yield "Wednesday";
		}
		case 4: {
			System.out.println("Thursday");
			yield "Thursday";
		}
		case 5: {
			System.out.println("Friday");
			yield "Friday";
		}
		case 6: {
			System.out.println("Saturday");
			yield "Saturday";
		}
		case 7: {
			System.out.println("Sunday");
			yield "Sunday";
		}
		default:{
			System.out.println("Invalid day of week number");
			yield "Invalid day of week number";
//			throw new IllegalArgumentException("Invalid day of week number: " + x);
//			throw new IllegalStateException("Invalid day of week number: " + x);
		}
		};

		System.out.println("weekDayName : " + weekDayName);

		System.out.println("****************************************");

		boolean isEven = switch (x) {
		case 1, 3, 5, 7: {
			System.out.println("Odd Day");
			yield false;
		}
		case 2, 4, 6: {
			System.out.println("Even Day");
			yield true;
		}
		default: {
			System.out.println("Invalid day of week number");
			if (x % 2 == 0) {
				yield true;
			}
			yield false;
		}
		};
		System.out.println("Is Even : " + isEven);
	}
}