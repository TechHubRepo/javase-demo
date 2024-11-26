package com.techhub.javasedemo.typecasting;

public class InstanceOfMain {

	public static void main(String[] args) {

		A a = new D();
		System.out.println(a.methodA());
		
		if (a instanceof B) {
			B b = (B) a;
			System.out.println(b.methodB());
		}

		if (a instanceof C) {
			C c = (C) a;
			System.out.println(c.methodC());
		}

		if (a instanceof D) {
			D d = (D) a;
			System.out.println(d.methodD());
		}

		if (a instanceof E) {
			E e = (E) a;
			System.out.println(e.methodE());
		}
		
		boolean flag=a instanceof E;
		System.out.println(flag);
		
	}
}
