package com.techhub.javasedemo.langpackage.cloning;

import java.util.Arrays;

public class Student implements Cloneable {

	private String name;
	private int rollNo;
	private String course;
	private String[] subjects;
	private Address address;

	public Student(Student student) throws CloneNotSupportedException {

		this.name = student.name;
		this.rollNo = student.rollNo;
		this.course = student.course;

		this.address = student.address.clone();
		String[] newSubects = new String[student.subjects.length];
		System.arraycopy(student.subjects, 0, newSubects, 0, student.subjects.length);
		this.subjects = newSubects;

	}

	public Student(String name, int rollNo, String course) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public Student clone() throws CloneNotSupportedException {

		/** Shallow Cloning */
		Student student = (Student) super.clone();

		/** Deep Cloning */
		student.setAddress(this.address.clone());
		String[] newSubects = new String[this.subjects.length];
		System.arraycopy(this.subjects, 0, newSubects, 0, this.subjects.length);
		student.setSubjects(newSubects);

		return student;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", course=" + course + ", subjects="
				+ Arrays.toString(subjects) + ", address=" + address + "]";
	}

}
