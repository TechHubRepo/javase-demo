package com.techhub.javasedemo.interfacedemo;

public class MyFunctionInterfaceMain {

	public static void main(String[] args) {

		MyFunctionInterface functionInterface = (name,number) -> {
			System.out.println("myFunction() -> MyFunctionInterface");
			System.out.println(name);
			System.out.println(number);
		};

		functionInterface.myFunction("Ram Niwash",100);
	}

}
