package com.techhub.javasedemo.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class InstantDemo {

	public static void main(String[] args) {

		System.out.println("Instant.MIN : " + Instant.MIN);
		System.out.println("Instant.MIN : " + Instant.MAX);
		System.out.println("Instant.EPOCH : " + Instant.EPOCH);

		Instant instant = Instant.now();
		System.out.println("instant : " + instant);
		System.out.println("instant.minus(. .) : " + instant.minus(2,ChronoUnit.DAYS));
		System.out.println("instant.minus(. .) : " + instant.minus(2,ChronoUnit.HOURS));
		System.out.println("instant.minus(. .) : " + instant.minus(2,ChronoUnit.MINUTES));
		System.out.println("instant.minus(. .) : " + instant.minus(2,ChronoUnit.MILLIS));
		System.out.println("instant.getEpochSecond() : " + instant.getEpochSecond());
		
		long secondsFromEpoch=Instant.ofEpochSecond(0).until(instant,ChronoUnit.SECONDS);
		System.out.println("secondsFromEpoch : " + secondsFromEpoch);
		System.out.println("instant : " + Instant.ofEpochSecond(secondsFromEpoch));
		
		long millisFromEpoch=Instant.ofEpochSecond(0).until(instant,ChronoUnit.MILLIS);
		System.out.println("millisFromEpoch : " + millisFromEpoch);
		System.out.println("instant : " + Instant.ofEpochSecond(millisFromEpoch));
		
		Date date=new Date();
		System.out.println("date : " + date);
		System.out.println("date.getTime() : " + date.getTime());
		
		System.out.println("instant : " + instant);
		LocalDateTime  localDateTime= LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		System.out.println("localDateTime : " + localDateTime);
		
		LocalDateTime  localDateTime2= LocalDateTime.ofInstant(instant, ZoneId.of("UTC"));
		System.out.println("localDateTime2 : " + localDateTime2);
	}
}
