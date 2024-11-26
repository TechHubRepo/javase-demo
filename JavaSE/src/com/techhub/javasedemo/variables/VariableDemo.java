package com.techhub.javasedemo.variables;

import com.techhub.javasedemo.annodemo.Student;
import com.techhub.javasedemo.classandobject.Person;

public class VariableDemo {

	/** Primitive (Static) Variable */
	private static byte maxLength = 20;

	/** Reference (Static) Variable */
	private static Person person = new Person();

	/** Primitive (Instance) Variable */
	private int aVar;
	private int bVar;

	/** Reference (Instance) Variable */
	private Student student = new Student(1001, "Shivam", "M Tech");

	public static byte getMaxLength() {
		return maxLength;
	}

	public static void setMaxLength(byte maxLength) {
		VariableDemo.maxLength = maxLength;
	}

	public static Person getPerson() {
		return person;
	}

	public static void setPerson(Person person) {
		VariableDemo.person = person;
	}

	public int getaVar() {
		return aVar;
	}

	public void setaVar(int aVar) {
		this.aVar = aVar;
	}

	public int getbVar() {
		return bVar;
	}

	public void setbVar(int bVar) {
		this.bVar = bVar;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void swapToAvarAndBvar() {
		/** t is local variable */
		int t = this.aVar;
		this.aVar = this.bVar;
		this.bVar = t;
	}
}
