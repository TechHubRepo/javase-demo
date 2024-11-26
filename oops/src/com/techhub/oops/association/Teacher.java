package com.techhub.oops.association;

import java.util.List;

import com.techhub.oops.inheritance.Student;
import com.techhub.oops.objectandclass.Person;

/**
 * The Teacher class
 * 
 * @author ramniwash
 */
public class Teacher extends Person {

	private String teacherId;

	private List<Student> students;

	public Teacher() {
	}

	public Teacher(String teacherId, List<Student> students) {
		super();
		this.teacherId = teacherId;
		this.students = students;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return this.teacherId;
	}

}
