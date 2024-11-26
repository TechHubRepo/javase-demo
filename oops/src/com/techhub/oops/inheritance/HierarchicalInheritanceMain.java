package com.techhub.oops.inheritance;

import java.util.Date;

import com.techhub.oops.objectandclass.Person;

/**
 * The HierarchicalInheritanceMain class
 * 
 * @author ramniwash
 */
public class HierarchicalInheritanceMain {

	/**
	 * The Starting point of application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/** The Student Object */
		Student student = new Student();
		student.setName("Abhimanyu");
		student.setDateOfBirth(new Date());
		student.setStudentId("S-0001");
		student.setCourseName("MCA");

		/* Type Casting to Person object */
		Person personStudent = (Person) student;

		System.out.println(personStudent.getName());
		System.out.println(personStudent.getDateOfBirth());
		System.out.println(student);

		System.out.println("------------------------------------------------------");

		/** The Employee Object */
		Employee employee = new Employee();

		employee.setName("Ram Niwash");
		employee.setDateOfBirth(new Date());
		employee.setEmployeeId("E-0001");
		employee.setDesignation("Developer");

		/** Type Casting to Person */
		Person personEmployee = (Person) employee;

		System.out.println(personEmployee.getName());
		System.out.println(personEmployee.getDateOfBirth());
		System.out.println(employee);
	}
}
