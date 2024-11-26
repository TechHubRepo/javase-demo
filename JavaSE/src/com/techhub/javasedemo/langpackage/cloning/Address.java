package com.techhub.javasedemo.langpackage.cloning;

public class Address implements Cloneable{

	private String homeTown;
	private int pinCode;

	public Address(String homeTown, int pinCode) {
		super();
		this.homeTown = homeTown;
		this.pinCode = pinCode;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [homeTown=" + homeTown + ", pinCode=" + pinCode + "]";
	}

	@Override
	protected Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}
}
