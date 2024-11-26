package com.techhub.oops.inheritance;

import java.util.Date;

import com.techhub.oops.objectandclass.Person;

/**
 * The SingleInheritanceMain
 * 
 * @author ramniwash
 */
public class SingleInheritanceMain {

	/**
	 * The Starting point of application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/** Creating the Employee Object */
		Employee employee = new Employee();

		/** Setting the employee name*/
		employee.setName("Ram Niwash");
		
		/** Setting the Date of birth */
		employee.setDateOfBirth(new Date());
		
		/** Setting the employee id*/
		employee.setEmployeeId("E-0001");
		
		/** Setting the employee designation*/
		employee.setDesignation("Developer");

		/** Type Casting */
		Person person = (Person) employee;
		
		System.out.println(person.getName());
		System.out.println(person.getDateOfBirth());
		System.out.println(employee);
	}
}
