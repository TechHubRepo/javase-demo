package com.techhub.javasedemo.util.stream;

import java.util.List;

import com.techhub.javasedemo.langpackage.Student;

import java.util.ArrayList;

public class StreamDemo {
	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student("Ram Niwash", (byte) 22, (byte) 75, "BCA", 21));
		students.add(new Student("Kuldeep Singh", (byte) 24, (byte) 73, "BCA", 25));
		students.add(new Student("Sajjan Kumar", (byte) 23, (byte) 74, "BCA", 31));
		students.add(new Student("Purshtom Dass", (byte) 25, (byte) 78, "MCA", 21));
		students.add(new Student("Naresh Kumar", (byte) 23, (byte) 79, "MCA", 25));
		students.add(new Student("Sumit Kumar", (byte) 24, (byte) 76, "MCA", 23));
		students.add(new Student("Prem Kumar", (byte) 25, (byte) 73, "B TECH", 27));
		students.add(new Student("Diwaker", (byte) 22, (byte) 74, "B TECH", 26));
		students.add(new Student("Naveen Kumar", (byte) 23, (byte) 75, "B TECH", 25));

		//Get the sum of height of students whose course is MCA
	     int sumOfHeight = students.stream()
	                      .filter(s -> s.getCourse().equals("MCA"))
	                      .mapToInt(s -> s.getHeight())
	                      .sum();
	     
		System.out.println("sumOfHeight : " + sumOfHeight);
		
	}
}
