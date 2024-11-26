package com.techhub.javasedemo.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderDemo {

	public static void main(String[] args) {

		Calendar calendar = new GregorianCalendar();
//		Calendar calendar = new GregorianCalendar(2007, 02, 28);
//		Calendar calendar = new GregorianCalendar(2007, 02, 28,12,32);
//		Calendar calendar = new GregorianCalendar(2007, 02, 28,12,32,45);

		System.out.println("calendar : " + calendar);

		System.out.println("getWeekYear : " + calendar.getWeekYear());

		System.out.println("getFirstDayOfWeek : " + calendar.getFirstDayOfWeek());

		System.out.println("getTime : " + calendar.getTime());

		System.out.println("getTimeZone : " + calendar.getTimeZone());

		for (int i = 0; i <= 16; i++) {
			System.out.println("get("+i+") : " + calendar.get(i));
		}

		
	}
}