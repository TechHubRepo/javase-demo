package com.techhub.javasedemo.datetime;

import java.time.LocalDate;

public class LocalDateDemo {
	
	 public static void main( String[] args ){
	        
//		 LocalDate localDate = LocalDate.now();
//		 LocalDate localDate=LocalDate.of(1997, 9, 28);
		 LocalDate localDate=LocalDate.parse("1997-09-28"); 
//		 LocalDate localDate=LocalDate.parse("1997/09/28"); 
		 
		 System.out.println("localDate : "+localDate);
		 System.out.println("------------------------ Methods ------------------------");
		 System.out.println("plusDays(int) : "+localDate.plusDays(5));
		 System.out.println("isLeapYear() : "+localDate.isLeapYear());
		 System.out.println("withYear(int) : "+localDate.withYear(2020));
		 System.out.println("withMonth(int) : "+localDate.withMonth(8));
		 System.out.println("isAfter(LocalDate) : "+localDate.isAfter(LocalDate.parse("1996-06-14"))); 
		 System.out.println("isBefore(LocalDate) : "+localDate.isBefore(LocalDate.parse("1998-06-14"))); 
	 }
}
