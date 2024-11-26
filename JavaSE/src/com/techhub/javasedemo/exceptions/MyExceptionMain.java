package com.techhub.javasedemo.exceptions;

import com.techhub.javasedemo.langpackage.Person;

public class MyExceptionMain {

	public static void main(String[] args) throws PersonException {

		Person person = getPerson(-7);
		
		System.out.println(person);
	}

	public static Person getPerson(int x) throws PersonException{

		if (x >= 0) {
			return new Person("Abcd", (byte) 26, (byte) 78);
		} else {
			throw new PersonException("perosn not foudn with -ve value");
		}

	}
}
