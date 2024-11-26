package com.techhub.javasedemo.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodDemo {

	public static void main(String[] args) {

		LocalDateTime dobDateTime = LocalDateTime.of(1997, 12, 28, 12, 35, 58, 5678);
		LocalDateTime dateTimeNow = LocalDateTime.now();

		Duration duration = Duration.between(dobDateTime, dateTimeNow);
		System.out.println("duration.toDays() : " + duration.toDays());
		
		LocalDate dobDateTime2 = LocalDate.of(1997, 12, 28);
		LocalDate dateTimeNow2 = LocalDate.now();

		Period period = Period.between(dobDateTime2, dateTimeNow2);
		long days = ChronoUnit.DAYS.between(dobDateTime2, dateTimeNow2);

		System.out.println("You are " + period.getYears() + " years, " + period.getMonths() + " months, and "
				+ period.getDays() + " days old. (" + days + " total days)");
	}
}
