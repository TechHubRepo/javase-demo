package com.techhub.javasedemo.datetime;

import java.time.Year;

public class YearDemo {

	public static void main(String[] args) {
		Year year=Year.now();
		
		System.out.println("MAX_VALUE  : " + Year.MAX_VALUE);
		System.out.println("MIN_VALUE  : " + Year.MIN_VALUE);
		
		System.out.println( year);
		System.out.println("getValue()  : " + year.getValue());
		System.out.println("isLeap()  : " + year.isLeap());
	
		
		System.out.println("length()  : " + year.length());
		System.out.println("isAfter()  : " + year.isAfter(Year.of(2020)));
		System.out.println("isAfter()  : " + year.isAfter(Year.of(2022)));
		
		System.out.println("parse()  : " + Year.parse("2020"));
	}
}
