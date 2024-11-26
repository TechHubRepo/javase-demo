package com.techhub.javasedemo.datetime;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeekDemo {

	public static void main(String[] args) {

		DayOfWeek dayOfWeekSunday = DayOfWeek.SUNDAY;

		System.out.println("dayOfWeek  : " + dayOfWeekSunday);
		System.out.println("getValue()  : " + dayOfWeekSunday.getValue());

		Locale locale = Locale.getDefault();
		System.out.println(
				"getDisplayName(TextStyle.FULL,Locale)  : " + dayOfWeekSunday.getDisplayName(TextStyle.FULL, locale));
		System.out.println(
				"getDisplayName(SHORT.SHORT,Locale)  : " + dayOfWeekSunday.getDisplayName(TextStyle.SHORT, locale));
		System.out.println(
				"getDisplayName(SHORT.NARROW,Locale)  : " + dayOfWeekSunday.getDisplayName(TextStyle.NARROW, locale));
		System.out.println("getDisplayName(SHORT.NARROW_STANDALONE,Locale)  : "
				+ dayOfWeekSunday.getDisplayName(TextStyle.NARROW_STANDALONE, locale));

		DayOfWeek dayOfWeekMonday = DayOfWeek.MONDAY;

		System.out.println("compareTo  : " + dayOfWeekSunday.compareTo(dayOfWeekMonday));
		System.out.println("compareTo  : " + dayOfWeekMonday.compareTo(dayOfWeekSunday));
		
		System.out.println("plus(2)  : " + dayOfWeekSunday.plus(2));
		System.out.println("minus(2) : " + dayOfWeekSunday.minus(2));
		
	}
}
