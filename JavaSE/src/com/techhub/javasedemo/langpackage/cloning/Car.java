package com.techhub.javasedemo.langpackage.cloning;

public class Car implements Cloneable {

	private String name;
	private String number;
	private int model;

	public Car(String name, String number, int model) {
		super();
		this.name = name;
		this.number = number;
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	@Override
	public Car clone() throws CloneNotSupportedException {
		return (Car) super.clone();
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", number=" + number + ", model=" + model + "]";
	}
}
