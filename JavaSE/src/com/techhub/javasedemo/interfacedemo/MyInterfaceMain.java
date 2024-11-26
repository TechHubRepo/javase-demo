package com.techhub.javasedemo.interfacedemo;

public class MyInterfaceMain {

	public static void main(String[] args) {
		
		MyInterface myInterface = new MyClass();

		myInterface.myMethod();
		myInterface.myMethod("Ram Niwash");
		myInterface.myMethod(10);
		myInterface.myMethod("Ram Niwash", 10);
		myInterface.myMethod(10, "Ram Niwash");
		
		
		System.out.println(MyClass.f1);
		System.out.println(MyClass.f2);
		
		System.out.println(MyInterface.f1);
		System.out.println(MyInterface.f2);
	}

}
