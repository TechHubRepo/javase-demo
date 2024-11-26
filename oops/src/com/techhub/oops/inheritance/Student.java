package com.techhub.oops.inheritance;

import java.util.List;

import com.techhub.oops.association.Teacher;
import com.techhub.oops.objectandclass.Person;

/**
 * The Student class
 * 
 * @author ramniwash
 */
public class Student extends Person {

	private String studentId;
	private String courseName;
	private List<Teacher> teachers;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return this.studentId;
	}
}
