package com.techhub.oops.association;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.techhub.oops.inheritance.Student;

/**
 * The AssociationMain class
 * 
 * @author ramniwash
 */
public class AggregationMain {

	/**
	 * Starting point of the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Set<Student> students = new HashSet<>();

		Student student1 = new Student();
		student1.setName("Abhimanyu");
		student1.setDateOfBirth(new Date());
		student1.setStudentId("S-0001");
		student1.setCourseName("MCA");
		
		Student student2 = new Student();
		student2.setName("Shivam");
		student2.setDateOfBirth(new Date());
		student2.setStudentId("S-0002");
		student2.setCourseName("MCA");
		
		students.add(student1);
		students.add(student2);
		
		StudentClass studentClass = new StudentClass();
		studentClass.setClassId(1001);
		studentClass.setName("Java Class");
		studentClass.setStudents(students);
				
		System.out.println(studentClass);
	}
}
