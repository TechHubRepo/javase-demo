package com.techhub.javasedemo.langpackage;

public class StringMethodsDemo {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Welcome";
		String s3 = "  ";
		String s4 = "  This is JavaSE course.   ";

		System.out.println("length() : [" + s1 + "] : " + s1.length());
		System.out.println("isEmpty() : [" + s3 + "] : " + s3.isEmpty());
		System.out.println("charAt(3) : [" + s2 + "] : " + s2.charAt(3));
		System.out.println("codePointAt(3) : [" + s2 + "] : " + s2.codePointAt(3));
		System.out.println("indexOf('m') : [" + s2 + "] : " + s2.indexOf('m'));
		System.out.println("indexOf(com) : [" + s2 + "] : " + s2.indexOf("com"));
		System.out.println("substring(3) : [" + s2 + "] : " + s2.substring(2,5));
		System.out.println("replace('l','1') : [" + s1 + "] : " + s1.replace('l','1'));
		System.out.println("contains(1) : [" + s1 + "] : " + s1.contains("l"));
		System.out.println("matches([a-zA-Z]*) : [" + s1 + "] : " + s1.matches("[a-zA-Z]*"));
		
		System.out.println("split([ ]*,2) : [" + s4 + "] : ");
		String[] arr=s4.split("[ ]",1);
		for(String s:arr) {
			System.out.print(s+",");
		}

		System.out.println("\ntrim() : [" + s4 + "] : " + s4.trim());
		System.out.println("strip() : [" + s4 + "] : " + s4.strip());
		
		System.out.println("isEmpty() : [" + s3 + "] : " + s3.isEmpty());
		System.out.println("isBlank() : [" + s3 + "] : " + s3.isBlank());
		
		System.out.println("compareTo(We) : [" + s2 + "] : " + s2.compareTo("Welcoma"));
	}
}
