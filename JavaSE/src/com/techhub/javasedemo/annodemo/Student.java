package com.techhub.javasedemo.annodemo;

@Table(name = "STUDENT_TAB")
public class Student {

	@Id
	@Column(name = "STUDENT_ID", length = 100)
	private long studentId;

	@Column(name = "STUDENT_NAME", length = 30)
	private String studentName;

	@Column(name = "STUDENT_COURSE")
	private String studentCourse;

	public Student() {
		super();
	}

	public Student(long studentId, String studentName, String studentCourse) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCourse = studentCourse;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentCourse="
				+ studentCourse + "]";
	}

}
