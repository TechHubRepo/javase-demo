package com.techhub.javasedemo.datetime;

import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class OffsetTimeDemo {

	public static void main(String[] args) {
		
		System.out.println("------------------------ OffsetTime -------------------------");
		OffsetTime offsetTime=OffsetTime.now();
		System.out.println("offsetTime  : " + offsetTime);
		System.out.println("getHour()  : " + offsetTime.getHour());
		System.out.println("getMinute()  : " + offsetTime.getMinute());
		System.out.println("getSecond()  : " + offsetTime.getSecond());
		System.out.println("getNano()  : " + offsetTime.getNano());		
		
		//Current UTC (Universal Time Coordinated), Time Zone
		System.out.println("getOffset()  : " + offsetTime.getOffset());
		
		System.out.println("------------------------ OffsetDateTime -------------------------");
		OffsetDateTime offsetDateTime=OffsetDateTime.now(); 
		System.out.println("offsetDateTime  : " + offsetDateTime);		
		System.out.println("getYear()  : " + offsetDateTime.getYear());
		System.out.println("getMonth()  : " + offsetDateTime.getMonth());		
		System.out.println("getDayOfWeek()  : " + offsetDateTime.getDayOfWeek());		
	}

}
