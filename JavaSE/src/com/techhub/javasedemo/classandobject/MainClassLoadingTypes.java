package com.techhub.javasedemo.classandobject;

public class MainClassLoadingTypes {

	public static void main(String[] args) throws ClassNotFoundException {
		
//		Student student=new Student();
		
//		String sfV1Value=Student.sfV1;
//		System.out.print(sfV1Value);
		
//		Student.sfV1=null;

//		Class.forName("com.techhub.javasedemo.Student") ;
		
		
		Student student=new Student();
		
		System.out.println("sfV1 : "+Student.sfV1);
		System.out.println("ifV1 :  "+student.ifV1);

	}

}
