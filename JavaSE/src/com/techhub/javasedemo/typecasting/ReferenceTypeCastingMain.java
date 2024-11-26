package com.techhub.javasedemo.typecasting;

public class ReferenceTypeCastingMain {

	public static void main(String[] args) {

		D d = new D();

		System.out.println(d.methodA());
		System.out.println(d.methodB());
		System.out.println(d.methodC());
		System.out.println(d.methodD());

		/** Implicit type Casting */
		A a = d;

		System.out.println(a.methodA());

		/** Implicit type Casting */
		C c = d;

		System.out.println(c.methodA());
		System.out.println(c.methodB());
		System.out.println(c.methodC());
//		System.out.println(c.methodD());
		
		/** Explicit type Casting */
		B b=(B)a;
		System.out.println(b.methodA());
		System.out.println(b.methodB());
//		System.out.println(b.methodC());
		
		/** ClassCastException */
//		E e = (E) d;

	}

}
