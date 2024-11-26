package com.techhub.javasedemo.langpackage;

public class Person implements Comparable<Person>, Cloneable {

	private String personName;
	private byte age;
	private byte height;

	public Person() {
	}

	public Person(String personName, byte age, byte height) {
		super();
		this.personName = personName;
		this.age = age;
		this.height = height;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String studentName) {
		this.personName = studentName;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public byte getHeight() {
		return height;
	}

	public void setHeight(byte height) {
		this.height = height;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + height;
		result = prime * result + ((personName == null) ? 0 : personName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (height != other.height)
			return false;
		if (personName == null) {
			if (other.personName != null)
				return false;
		} else if (!personName.equals(other.personName))
			return false;
		return true;
	}

	public Person clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}

	@Override
	public String toString() {
		return "Person [studentName=" + personName + ", age=" + age + ", height=" + height + "]";
	}

	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
}
