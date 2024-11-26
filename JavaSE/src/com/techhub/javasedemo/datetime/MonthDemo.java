package com.techhub.javasedemo.datetime;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthDemo {

	public static void main(String[] args) {
		
		Month month=Month.JANUARY;
		
		System.out.println("month  : " + month);
		System.out.println("getValue()  : " + month.getValue());
		
		Locale local=Locale.getDefault();
		System.out.println("getDisplayName(TextStyle.FULL, local)  : " + month.getDisplayName(TextStyle.FULL, local));
		System.out.println("getDisplayName(TextStyle.SHORT, local)  : " + month.getDisplayName(TextStyle.SHORT, local));
		System.out.println("getDisplayName(TextStyle.SHORT, local)  : " + month.getDisplayName(TextStyle.NARROW, local));
		
		System.out.println("length(false)  : " +month.length(false));
		System.out.println("length(false)  : " +month.length(true));
		System.out.println("length(false)  : " +Month.FEBRUARY.length(false));
		System.out.println("length(false)  : " +Month.FEBRUARY.length(true));
		
		System.out.println("firstDayOfYear(false)  : " +month.firstDayOfYear(false));
		System.out.println("firstDayOfYear(false)  : " +Month.FEBRUARY.firstDayOfYear(false));
		System.out.println("firstDayOfYear(false)  : " +Month.FEBRUARY.firstDayOfYear(true));
		
		
		System.out.println("firstMonthOfQuarter()  : " +month.firstMonthOfQuarter());
		System.out.println("firstMonthOfQuarter()  : " +Month.FEBRUARY.firstMonthOfQuarter());
		System.out.println("firstMonthOfQuarter()  : " +Month.MAY.firstMonthOfQuarter());
		System.out.println("firstMonthOfQuarter()  : " +Month.SEPTEMBER.firstMonthOfQuarter());
		System.out.println("firstMonthOfQuarter()  : " +Month.DECEMBER.firstMonthOfQuarter());
	}

}
