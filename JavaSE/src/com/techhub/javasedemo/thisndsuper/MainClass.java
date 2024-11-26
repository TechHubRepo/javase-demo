package com.techhub.javasedemo.thisndsuper;

public class MainClass {

	public static void main(String[] args) {

		ClassA classA = new ClassA(7, 8);
		System.out.println(classA.getSum());
		System.out.println(classA);
		
		System.out.println("**********************************");
		
		ClassB classB  = new ClassB(7, 8, 9,10);		
		System.out.println(classB.getSum());
		System.out.println(classB);
	}
}
