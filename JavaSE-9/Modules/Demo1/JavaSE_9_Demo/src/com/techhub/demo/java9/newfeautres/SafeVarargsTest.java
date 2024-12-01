package com.techhub.demo.java9.newfeautres;

import java.util.List;

public class SafeVarargsTest {

	public static void main(String[] args) {

		varargsExample(List.of("A", "B"), List.of("C", "D"),List.of("Hello"));

	}

	@SafeVarargs
	private static void varargsExample(List<String>... strList) {
		Object[] list = strList;
		list[0] = List.of(1, 2, 3);

		String str = strList[0].get(0);
		System.out.println(str);
	}
}
