package com.techhub.javasedemo.classandobject;

/**
 * The ClassA description here
 * 
 * @author ramniwash
 * @since 1.0.0
 */
public class ClassA {

	/* The static field f1 */
	private static byte f1;

	/* The instance field f2 */
	private byte f2;

	/** Static Block */
	static {
		System.out.println("Before Loading ClassA : Static block of ClassA");
		System.out.println("f1 : " + f1);
		f1 = 50;
	}
	
	/** Instance Block	 */
	{
		System.out.println("Before Creating Object of ClassA : Instance block of ClassA");
		System.out.println("f2 : " + f2);
		f2 = 60;
	}

	/**
	 * Default Constructor
	 */
	public ClassA() {
		super();
	}

	/**
	 * Constructor to initialize the f2 filed
	 * 
	 * @param f2 byte value to initialize f2
	 */
	public ClassA(byte f2) {
		super();
		this.f2 = f2;
	}

	/** The Inner Enum */
	public enum ALPHABETS {
		A, B, C, D
	}

	/** The Inner interface */
	public interface MyInterface {
		public void method1();
	}

	/** The static Inner Class */
	public static class InnerClassA {
		private String icAf1;

		public InnerClassA(String icAf1) {
			this.icAf1 = icAf1;
		}

		@Override
		public String toString() {
			return icAf1;
		}
	}

	/** The non-static Inner Class */
	public class InnerClassB {
		private String if1;

		public InnerClassB(String if1) {
			super();
			this.if1 = if1;
		}

		@Override
		public String toString() {
			return if1;
		}
	}

	public static byte getF1() {
		return f1;
	}

	public static void setF1(byte f1) {
		ClassA.f1 = f1;
	}

	public byte getF2() {
		return f2;
	}

	public void setF2(byte f2) {
		this.f2 = f2;
	}

	@Override
	public String toString() {
		return "ClassA [f2=" + f2 + "]";
	}

}
