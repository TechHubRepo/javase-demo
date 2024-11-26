package com.techhub.javasedemo.datetime;

import java.time.YearMonth;

public class YearMonthDemo {

	public static void main(String[] args) {
		YearMonth yearMonth=YearMonth.now();
		
		System.out.println("yearMonth  : " + yearMonth);
		System.out.println("getMonthValue()  : " + yearMonth.getMonthValue());
		System.out.println("getYear()  : " + yearMonth.getYear());

	}
}
