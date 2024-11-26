package com.techhub.javasedemo.langpackage.cloning;

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student student1 = new Student("Ram Niwash", 6, "M Tech");
		student1.setSubjects(new String[] { "Java", "HTML", "CSS", "C", "C++" });
		student1.setAddress(new Address("Near Govt. School", 652356));

//		Student student2 = student1.clone();
		Student student2 = new Student(student1);
		
		System.out.println("student1 : " + student1);
		System.out.println("student2 : " + student2);

		System.out.println("****************");

		student2.setName("Purshotam Dass");
		student2.setRollNo(52);
		student2.setCourse("MCA");
		student2.getAddress().setHomeTown("Near Bus Stop");
		student2.getAddress().setPinCode(542542);
		student2.getSubjects()[0] = "PHP";
		student2.getSubjects()[1] = "R";
		student2.getSubjects()[2] = "Python";
		student2.getSubjects()[3] = "Networking";
		student2.getSubjects()[4] = "Ruby";

		System.out.println("student1 : " + student1);
		System.out.println("student2 : " + student2);
	}
}
