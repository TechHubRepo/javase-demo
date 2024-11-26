package com.techhub.javasedemo.util.collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();

		vector.add("Z");
		vector.add("B");
		vector.add("X");
		vector.add("P");
		vector.add("A");
		vector.add("R");

		vector.insertElementAt("Ram Niwash", 2);

//		Enumeration<String> enumeration = vector.elements();
//		while (enumeration.hasMoreElements()) {
//			System.out.println(enumeration.nextElement());
//		}

		System.out.println("***************** Vector  Print *******************");
		System.out.println(vector);
		System.out.println("-----------------------------------------------------------------------");
		for (String element : vector) {
			System.out.println(element);
		}
	}
}
