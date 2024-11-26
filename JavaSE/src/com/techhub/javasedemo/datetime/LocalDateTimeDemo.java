package com.techhub.javasedemo.datetime;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
	
	 public static void main( String[] args ){
	        
		 LocalDateTime localDateTime=LocalDateTime.now();
//		 LocalDateTime localDateTime=LocalDateTime.of(1997, 12, 28, 12, 35, 58, 5678);
//		 LocalDateTime localDateTime=LocalDateTime.parse("1997-12-28T12:35:55.5568"); 
//		 LocalDateTime localDateTime=LocalDateTime.parse("1997-12-28t12:35"); 
		 
		 System.out.println("localTime : "+localDateTime);
		 System.out.println("------------------------ Methods ------------------------");
		 System.out.println("plusHours(int) : "+localDateTime.plusHours(4));
		 System.out.println("plusMinutes(int) : "+localDateTime.plusMinutes(27));
		 System.out.println("plusSeconds(int) : "+localDateTime.plusSeconds(7));
		 System.out.println("minusHours(int) : "+localDateTime.minusHours(2));
		 
		 System.out.println("plusDays(int) : "+localDateTime.plusDays(5));
//		 System.out.println("isLeapYear() : "+localDateTime.isLeapYear());
		 System.out.println("withYear(int) : "+localDateTime.withYear(2020));
//		 System.out.println("isAfter(LocalDate) : "+localDateTime.isAfter(LocalDate.parse("1996-06-14"))); 
//		 System.out.println("isBefore(LocalDate) : "+localDateTime.isBefore(LocalDate.parse("1998-06-14"))); 
	 }
}
