package com.techhub.java8.features.methodref;

import java.util.logging.Logger;

public class ConstructorRefMain2 {

	/** The LOGGER Constant */
	private static Logger LOGGER = Logger.getLogger(ConstructorRefMain2.class.getSimpleName());

	public static void main(String[] args) {

		MyInterface myInterface = Student::new;

		Student student = myInterface.getStudent();
		
		LOGGER.info(student.getName());
		LOGGER.info(student.getCourseName());
		LOGGER.info(String.valueOf(student.getRollNo()));
		LOGGER.info(String.valueOf(student.toString()));
	}
}

/**
 * The MyInterface
 * 
 * @author ramniwash
 */
@FunctionalInterface
interface MyInterface {
	public Student getStudent();
}

/**
 * The Student class
 * 
 * @author ramniwash
 */
class Student {

	private String name;
	private String courseName;
	private short rollNo;

	public Student() {
		super();
		this.name = "Syam";
		this.courseName = "MCA";
		this.rollNo = 6;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public short getRollNo() {
		return rollNo;
	}

	public void setRollNo(short rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", courseName=" + courseName + ", rollNo=" + rollNo + "]";
	}
}