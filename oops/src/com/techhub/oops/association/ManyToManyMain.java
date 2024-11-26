package com.techhub.oops.association;

import java.util.List;

import com.techhub.oops.inheritance.Student;

/**
 * The OneToOneMain class
 * 
 * @author ramniwash
 */
public class ManyToManyMain {

	public static void main(String[] args) {
		/**
		 * Creating two Teacher object and setting name for them
		 */
		Teacher teacher1 = new Teacher();
		Teacher teacher2 = new Teacher();
		teacher1.setName("Pardeep Kumar");
		teacher2.setName("Raghuvinder Singh");

		/**
		 * Creating two Student object and setting name and course for them
		 */
		Student student1 = new Student();
		Student student2 = new Student();
		student1.setName("Abhishek Kumar");
		student1.setCourseName("MCA");
		student2.setName("Sivam Kumar");
		student2.setCourseName("MCA");

		/**
		 * Adding Students to Teacher object
		 */
		teacher1.setStudents(List.of(student1, student2));
		teacher2.setStudents(List.of(student1, student2));

		/**
		 * Adding Teachers to Student object
		 */
		student1.setTeachers(List.of(teacher1, teacher2));
		student2.setTeachers(List.of(teacher1, teacher2));

		System.out.println(teacher1.getStudents().get(0).getName());
		System.out.println(teacher1.getStudents().get(0).getTeachers().get(0).getName());

		System.out.println(student1.getTeachers().get(0).getName());
		System.out.println(student1.getTeachers().get(0).getStudents().get(0).getName());
	}
}


