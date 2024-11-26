package com.techhub.javasedemo.datetime;

import java.time.*;

public class LocalTimeDemo {
	
	 public static void main( String[] args ){
	        
//		 LocalTime localTime=LocalTime.now();
//		 LocalTime localTime=LocalTime.now(ZoneId.systemDefault());
//		 LocalTime localTime=LocalTime.of(12,35,55,5568);
		 LocalTime localTime=LocalTime.parse("12:35:55.5568"); 
	
		 
		 
		 System.out.println("localTime : "+localTime);
		 System.out.println("------------------------ Methods ------------------------");
		 System.out.println("getHour() : "+localTime.getHour());
		 System.out.println("getMinute() : "+localTime.getMinute());
		 System.out.println("getSecond() : "+localTime.getSecond());
		 System.out.println("getNano() : "+localTime.getNano());
		 
		 System.out.println("plusHours(int) : "+localTime.plusHours(4));
		 System.out.println("plusMinutes(int) : "+localTime.plusMinutes(27));
		 System.out.println("plusSeconds(int) : "+localTime.plusSeconds(7));
		 System.out.println("minusHours(int) : "+localTime.minusHours(2));
		 
		 
		 System.out.println("minusHours(int) : "+localTime.withHour(5));
		 System.out.println("minusHours(int) : "+localTime.withMinute(55));
		 System.out.println("minusHours(int) : "+localTime.withSecond(22));
		  
	 }
}
