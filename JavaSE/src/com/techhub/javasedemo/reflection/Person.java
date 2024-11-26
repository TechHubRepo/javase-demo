package com.techhub.javasedemo.reflection;

import com.techhub.javasedemo.annodemo.Column;
import com.techhub.javasedemo.annodemo.Id;
import com.techhub.javasedemo.annodemo.Table;
import com.techhub.javasedemo.langpackage.cloning.Address;

@Table(name = "PERSON")
public class Person {

	@Id
	@Column(name = "pid")
	private String personId;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private transient int age;

	@Column(name = "mobileNo")
	private long mobileNo;

	@Column(name = "email")
	private String email;

	@Column(name = "address")
	private Address address;

	public Person() {
		super();
	}

	public Person(String personId, String name, int age, long mobileNo, String email) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	public Person(String personId, String name, int age, long mobileNo, String email, Address address) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.email = email;
		this.address = address;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + age + ", mobileNo=" + mobileNo
				+ ", email=" + email + ", address=" + address + "]";
	}
}
