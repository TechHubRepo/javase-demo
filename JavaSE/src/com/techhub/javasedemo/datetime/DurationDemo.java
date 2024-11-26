package com.techhub.javasedemo.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationDemo {

	public static void main(String[] args) {

		LocalTime localTime=LocalTime.of(12, 35, 45,4515);
		LocalTime localTime2=LocalTime.of(15, 35, 45,4515);
		Duration duration = Duration.between(localTime,localTime2);  
//		Duration duration = Duration.ofDays(1);

		System.out.println(duration);
		System.out.println("------------------------ Methods ------------------------");
		System.out.println("toHours : " + duration.toHours());
		System.out.println("toMinutes : " + duration.toMinutes());
		System.out.println("toSeconds : " + duration.toSeconds());
		System.out.println("toNanos : " + duration.toNanos());
		
		Instant t1=Instant.now();
		Instant t2=Instant.parse("2021-11-08T22:35:45.545645Z");
		long days=ChronoUnit.DAYS.between(t2, t1);
		System.out.println("days : " + days);
		
		long hours=ChronoUnit.HOURS.between(t2, t1);
		System.out.println("hours : " + hours);
		
	}
}
