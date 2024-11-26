package com.techhub.java8.features.functionalProg;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class MainClass {

	/** The Logger LOGGER */
	private static Logger LOGGER = Logger.getLogger(MainClass.class.getSimpleName());

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Ram Niwash", "Java", 62));
		students.add(new Student("Kuldeep Singh", "HTML", 70));
		students.add(new Student("Purshtom Dass", "Java", 80));
		students.add(new Student("Prem Kumar", "Data Structure", 64));
		students.add(new Student("Naresh Kumar", "Java", 88));
		students.add(new Student("Sumit Kumar", "Data Structure", 55));
		students.add(new Student("Diwak Gupta", "HTML", 50));
		students.add(new Student("Sandeep Kumar", "Data Structure", 45));

		for (Student student : students) {
			LOGGER.info(student.toString());
		}

		System.out.println("******  Filtered Students *********");

		MinMarkPredicate markPredicate = new MinMarkPredicate(70);

		List<Student> filteredStudent = filter(students, markPredicate);

		for (Student student : filteredStudent) {
			LOGGER.info(student.toString());
		}
	}

	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> filteredList = new ArrayList<>();
		for (T type : list) {
			if (predicate.test(type)) {
				filteredList.add(type);
			}
		}
		return filteredList;
	}
}
