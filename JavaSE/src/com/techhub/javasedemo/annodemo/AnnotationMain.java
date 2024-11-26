package com.techhub.javasedemo.annodemo;

public class AnnotationMain {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		Student student1 = new Student(1001, "Ram Niwash", "MCA");

		Student student2 = new Student(1002, "Suresh Kumar", "B Tech");

		String query1 = EntityAPT.getInsertQuery(student1);
		
		String query2 = EntityAPT.getInsertQuery(student2);
		
		System.out.println(query1);
		
		System.out.println(query2);		
	}
}
