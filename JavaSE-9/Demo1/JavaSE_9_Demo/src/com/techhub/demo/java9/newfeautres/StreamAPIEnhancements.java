package com.techhub.demo.java9.newfeautres;

import java.util.List;
import java.util.stream.Stream;

public class StreamAPIEnhancements {

	public static void main(String[] args) {
		
		List<Person> personList = List.of(new Person("Ram", (byte) 28), new Person("Sayam", (byte) 30),
				new Person("Mohan", (byte) 20), new Person("Sohan", (byte) 35),new Person("Prem", (byte) 25));

//		 This method is used to get a stream of the elements before the element that does not satisfy the given Predicate
//		Stream<Person> result1 = personList.stream().takeWhile(person -> person.getAge() < 30);
//		Stream<Person> result1 = personList.stream().takeWhile(person -> person.getAge() <= 30);
//
//		System.out.println("************Person Name************");
//		result1.forEach(person -> {
//			System.out.println(person.getName());
//		});

		// The dropWhile() method works exactly opposite of the takeWhile() method, as shown in the code below
//		Stream<Person> result2 = personList.stream().dropWhile(person -> person.getAge() < 30);
//
//		System.out.println("************Person Name************");
//		result2.forEach(person -> {
//			System.out.println(person.getName());
//		});
		
		
//		Stream<Integer> integerStream = Stream.iterate(1, i->i+1);
//		Stream<Integer> integerStream = Stream.iterate(1, i->i+1).limit(100);
		Stream<Integer> integerStream = Stream.iterate(1, i->i<101, i->i+2);
	
		System.out.println("************ Numbers ************");
		integerStream.forEach(num -> {
			System.out.println(num);
		});
	}
}

class Person {
	private String name;
	private byte age;

	public Person(String name, byte age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name;
	}
}