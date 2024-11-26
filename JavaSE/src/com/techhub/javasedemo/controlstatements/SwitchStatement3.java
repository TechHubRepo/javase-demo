package com.techhub.javasedemo.controlstatements;

public class SwitchStatement3 {

	public static void main(String[] args) {

		int x = 1;

		String weekDayName = switch (x) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "Invalid day of week number";
		};

		System.out.println("weekDayName : " + weekDayName);
	}
}