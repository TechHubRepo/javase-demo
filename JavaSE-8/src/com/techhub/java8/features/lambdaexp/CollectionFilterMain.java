package com.techhub.java8.features.lambdaexp;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CollectionFilterMain {

	/** The LOGGER Constant */
	private static Logger LOGGER = Logger.getLogger(CollectionFilterMain.class.getSimpleName());

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		persons.add(new Person(1, "Ram Niwash", 24));
		persons.add(new Person(2, "Kuldeep Chahal", 26));
		persons.add(new Person(3, "Purshtom Dass", 30));
		persons.add(new Person(4, "Prem Kumar", 18));
		persons.add(new Person(5, "Naresh Kumar", 27));
		persons.add(new Person(6, "Sumit Kumar", 15));
		persons.add(new Person(7, "Sajjam Kumar", 9));
		persons.add(new Person(8, "Diwakr Gupta", 35));
		persons.add(new Person(9, "Naveen Kumar", 40));

		persons.stream().filter(person -> person.getpAge() >= 35).forEach(person -> {
			LOGGER.info(person.toString());
		});
	}
}
