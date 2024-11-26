package com.techhub.oops.association;

import java.util.Set;

import com.techhub.oops.inheritance.Student;

/**
 * The StudentClass
 * 
 * @author ramniwash
 *
 */
public class StudentClass {

	private int classId;
	private String name;
	private Set<Student> students;

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "StudentClass [classId=" + classId + ", name=" + name + ", students=" + students + "]";
	}
}
