package com.techhub.javasedemo.datetime;

import java.time.MonthDay;

public class MonthDayDemo {
	public static void main(String[] args) {
		MonthDay monthDay = MonthDay.now();

		System.out.println("monthDay  : " + monthDay);
		System.out.println("monthDay.of(12,20)  : " + MonthDay.of(12, 20));

		System.out.println("getMonthValue()  : " + monthDay.getMonthValue());
		System.out.println("getDayOfMonth()  : " + monthDay.getDayOfMonth());

		System.out.println("getDayOfMonth()  : " + monthDay.isValidYear(2020));

	}
}
