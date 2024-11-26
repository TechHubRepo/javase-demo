package com.techhub.javasedemo.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5524654654567L;
	
	private transient String name;
	private byte age;
	private char gender=' ';
	private long mobileNumber;
	private boolean verified;

	public Person() {
		super();
	}

	public Person(String name, byte age, char gender, long mobileNumber, boolean verified) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.verified = verified;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	@Override
	public String toString() {
		StringBuilder string=new StringBuilder();
		string.append("[name : ");
		string.append(this.name);
		string.append(", age : ");
		string.append(this.age);
		string.append(", gender : ");
		string.append(this.gender);
		string.append(", mobileNumber : ");
		string.append(this.mobileNumber);
		string.append(", verified : ");
		string.append(this.verified);
		string.append("]");
		return string.toString();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeByte(age);
		out.writeBoolean(verified);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.name=(String)in.readObject();
		this.age=in.readByte();
		this.verified=in.readBoolean();
	}
}
