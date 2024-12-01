package com.techhub.demo.java9.newfeautres;

public class DeprecatedAnnotationDemo {

	public static void main(String[] args) {

		Hello hello = new Hello();

		System.out.println("M1 : " + hello.getMessage());
		System.out.println("M1 : " + hello.message());

	}

}

class Hello {

	@Deprecated(forRemoval = true, since = "9")
	public String getMessage() {
		return "Hello";
	}

	public String message() {
		return "Hello World";
	}
}
