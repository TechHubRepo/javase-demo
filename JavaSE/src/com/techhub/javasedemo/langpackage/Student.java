package com.techhub.javasedemo.langpackage;

public class Student extends Person {

	private String course;
	private int rollNo;

	public Student() {
		super();
	}

	public Student(String studentName, byte age, byte height, String course, int rollNo) {
		super(studentName, age, height);
		this.course = course;
		this.rollNo = rollNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", rollNo=" + rollNo + "]";
	}

}
