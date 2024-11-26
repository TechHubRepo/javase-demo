package com.techhub.javasedemo.datetime;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		
		System.out.println("--------------- Available Zone Ids ---------------");
		Set<String> zoneIds=ZoneId.getAvailableZoneIds();
		for(String zoneId:zoneIds) {
			System.out.println(zoneId);
		}
		
		System.out.println("--------------- zoneOffset  ---------------");
		ZoneOffset zoneOffset=ZoneOffset.ofHours(5);
		System.out.println("zoneOffset  : " + zoneOffset);
		
		// Current UTC + Zone name
		System.out.println("--------------- ZonedDateTime  ---------------");
		ZonedDateTime zonedDateTime=ZonedDateTime.now();
		System.out.println("zonedDateTime  : " + zonedDateTime);
	}
}
