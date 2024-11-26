package com.techhub.javasedemo.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterClass {

	public static void main(String[] args) {
		
		/**
		 * d = Represents the day of month
		 * M = Represent the month of the year [MM = 09,12 etc | MMM = Apr, May etc | MMMM = April, June etc.]
		 * y = Represent the year of calendar [yy= 19,20,21 etc | yyyy 2019,2020 etc]
		 * H = Represent the hour of the day
		 * m = Represent the minutes of the hour
		 * s = Represent the seconds of the minutes
		 * S = Represent the neno seconds seconds of the seconds
		 * E = Represent the name of day [E,EE,EEE = Sun,Mon etc | EEEE = Sunday, Monday etc]
		 * a = am/pm 
		 */
		
//		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSSSSS a");
//		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm a");
//		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm a");
//		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("a dd-MMM-yy HH:mm:ss.SSSSSS");
//		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSSSSS a");
//		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MMMM/yy HH:mm:ss.SSSSSS a");
//		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("EEEE dd/MMMM/yy HH:mm:ss.SSSSSS a");
//		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("EEEE dd-MMMM-yy HH:mm:ss.SSSSSS a");
//		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("EEEE dd-MMMM-yy HH:mm:ss a");
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MMMM/yy HH:mm:ss.SSSSSS EEEE a");
		
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime);
		
		System.out.println("************ LocalDateTime with Formatter ************");
		System.out.println(dateTimeFormatter.format(localDateTime));
		System.out.println(localDateTime.format(dateTimeFormatter));
		
		System.out.println("************ LocalDate with Formatter ************");
		DateTimeFormatter dateTimeFormatter2=DateTimeFormatter.ofPattern("dd/MMMM/yyyy"); 
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		System.out.println(dateTimeFormatter2.format(localDate));
		
		System.out.println("************ LocalTime with Formatter ************");
		DateTimeFormatter dateTimeFormatter3=DateTimeFormatter.ofPattern("HH:mm:ss"); 
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		System.out.println(dateTimeFormatter3.format(localTime));
		
	}
}
