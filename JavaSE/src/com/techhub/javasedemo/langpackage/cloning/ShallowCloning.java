package com.techhub.javasedemo.langpackage.cloning;

public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Car car1 = new Car("Maruti", "PB-31 5254", 2020);
//		Car car2 = car1;
		Car car2 = car1.clone();

		System.out.println("car1 : " + car1);
		System.out.println("car2 : " + car2);

		System.out.println("****************");

		car2.setName("Maruti 800");
		car2.setNumber("HR-24 6525");
		car2.setModel(2021);

		System.out.println("car1 : " + car1);
		System.out.println("car2 : " + car2);
	}
}
