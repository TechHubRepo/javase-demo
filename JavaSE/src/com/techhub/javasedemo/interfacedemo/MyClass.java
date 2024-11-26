package com.techhub.javasedemo.interfacedemo;

public class MyClass implements MyInterface {

	@Override
	public void myMethod() {
		System.out.println("**************** myMethod() ->  MyClass ****************");
	}

	@Override
	public void myMethod(String name) {
		System.out.println("**************** myMethod(String) ->  MyClass ****************");
		System.out.println("Name : " + name);
	}

	@Override
	public void myMethod(int num) {
		System.out.println("**************** myMethod(int) ->  MyClass ****************");
		System.out.println("Num : " + num);
	}
	
	@Override
	public void myMethod(String name, int num) {
		System.out.println("**************** myMethod(String,int) ->  MyClass ****************");
		System.out.println("Name : " + name);
		System.out.println("Num : " + num);
	}

	@Override
	public void myMethod(int num, String name) {
		System.out.println("**************** myMethod(int,String) ->  MyClass ****************");
		System.out.println("Num : " + num);
		System.out.println("Name : " + name);
	}

}
