package com.techhub.javasedemo.datetime;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

//		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
//		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");

		// Current System time
		Date date = new Date();
//		Date date = new Date("2007/02/28 12:32:45");
//		Date date = new Date(2007, 02, 28,12,32,45);
//		Date date = new Date(92445854);
//		Date date = new Date(Date.parse("2007/02/28 12:32:45"));
//		Date date=new Date(Date.UTC(2007, 02, 28, 12, 32, 45));
//		Date date = Date.from(Instant.parse("2007-02-28T12:32:45.852Z"));

		System.out.println(date);
		System.out.println("getDate : " + date.getDate());
		System.out.println("getDay : " + date.getDay());
		System.out.println("getMonth : " + date.getMonth());
		System.out.println("getYear : " + date.getYear());
		System.out.println("getHours : " + date.getHours());
		
		System.out.println("****************   Formatting the date with  SimpleDateFormat ****************");
		System.out.println(dateFormat.format(date));
	}
}