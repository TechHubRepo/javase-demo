package com.techhub.javasedemo.langpackage;

public class MainClass {

	public static void main(String[] args) {

		Person person1 = new Person("Ram Niwash", (byte) 26, (byte) 75);

		Person person2 = new Person("Kuldeep", (byte) 27, (byte) 70);

		boolean isEquals = person1.equals(person2);
		System.out.println("isEquals : " + isEquals);

		int result = person1.compareTo(person2);
		System.out.println("result : " + result);

		PersonHeightComparator personHeightComparator = new PersonHeightComparator();
		int result2 = personHeightComparator.compare(person1, person2);
		System.out.println("result2 : " + result2);

		Student student1 = new Student("ABCD", (byte) 15, (byte) 40, "10th", 5);
		Student student2 = new Student("XYZ", (byte) 20, (byte) 50, "BA", 10);

		StudentRollNoComparator studentRollNoComparator = new StudentRollNoComparator();

		int result3 = studentRollNoComparator.compare(student1, student2);
		System.out.println("result3 : " + result3);
	}
}
