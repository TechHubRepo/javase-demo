package com.techhub.javasedemo.reflection;

import java.lang.reflect.Field;

public class ReflectionModifyClassDemo {

	public static void main(String[] args) throws Exception {

		Person person = new Person("P0001", "Ram Niwash", 26, 987654321, "hello@abc.com");
		System.out.println(person);

//		person.setName("Kuldeep");
		Class<Person> personClass = Person.class;
		Field nameField = personClass.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(person, "Abcd");
		
		System.out.println(person);
	}
}
