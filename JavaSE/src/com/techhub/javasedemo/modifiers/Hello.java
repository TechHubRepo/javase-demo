package com.techhub.javasedemo.modifiers;

public class Hello {
	
	/** The private field */
	private String f1 = "private field";

	/** The default field */
	String f2 = "default field";

	/** The protected field */
	protected String f3 = "protected field";

	/** The public field */
	public String f4 = "public field";

	public Hello() {
		this.testMethod1();
	}

	private void testMethod1() {
		System.out.println("This is Private method -> Hello");
	}

	void testMethod2() {
		System.out.println("This is default method -> Hello");
	}

	protected void testMethod3() {
		System.out.println("This is protected method -> Hello");
	}

	public String getF1() {
		System.out.println("This is public method -> Hello");
		return this.f1;
	}

}
