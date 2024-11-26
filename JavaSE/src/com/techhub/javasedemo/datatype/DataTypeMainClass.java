package com.techhub.javasedemo.datatype;

import com.techhub.javasedemo.annodemo.Student;

public class DataTypeMainClass {

	public static void main(String[] args) {

		System.out.println("******************* boolean ***********************");
		boolean booleanVar = true;
		System.out.println("boolean Value : " + booleanVar);

		System.out.println("******************* byte ***********************");
		byte byteVar = 127;
		System.out.println("byte Value : " + byteVar);

		System.out.println("******************* short ***********************");
		short shortVar = 32767;
		System.out.println("short Value : " + shortVar);

		System.out.println("******************* int ***********************");
		int intVar = 2147483647;
		System.out.println("int Value : " + intVar);

		System.out.println("******************* long ***********************");
		long longVar = 9223372036854775807L;
		System.out.println("long Value : " + longVar);

		System.out.println("******************* float ***********************");
		float floatVar = 3.4028235E38f;
		System.out.println("float Value : " + floatVar);

		System.out.println("******************* double ***********************");
		double doubleVar = 1.7976931348623157E308;
		System.out.println("double Value : " + doubleVar);
		
		System.out.println("******************* char ***********************");
//		char charVar = 'K';
		char charVar = '\u0915';
		System.out.println("char Value : " + charVar);

		System.out.println("******************* Student (User Defined) ***********************");
		Student student = new Student(1001, "Ram Niwash", "M Tech");
		System.out.println("Student Value : " + student);

		System.out.println("******************* String (User Defined) ***********************");
//		String countryName = "BHARAT";
		String countryName ="\u092D\u093E\u0930\u0924";
		System.out.println("String Value : " + countryName);
	}
}
