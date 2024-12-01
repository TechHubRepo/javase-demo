package com.techhub.demo.java9.newfeautres;

import java.util.Comparator;

public class AnonymousClassDemo {
	public static void main(String[] args) {

		Comparator<String> comparator = new Comparator<>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};

		int result = comparator.compare("ABC", "CDEF");
		System.out.println("Result : "+result);
	}
}
