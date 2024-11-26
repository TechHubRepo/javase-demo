package com.techhub.javasedemo.classandobject;

/**
 * The MainClass
 * 
 * @author ramniwash
 *
 */
public class ClassAMainClass {
	/**
	 * Starting point of program
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		System.out.println("************** Creating object for ClassA **************");

		ClassA classA = new ClassA();
		System.out.println(classA);
		System.out.println(ClassA.getF1());

		System.out.println("************** Creating the object for static inner class **************");
		ClassA.InnerClassA innerClassA = new ClassA.InnerClassA("Hi");
		System.out.println(innerClassA);

		System.out.println("************** Creating the object for non-static inner class **************");
		ClassA.InnerClassB innerClassB = classA.new InnerClassB("Hello");
//		ClassA.InnerClassB innerClassB= new ClassA().new InnerClassB("Hello");
		System.out.println(innerClassB);

		System.out.println("************** Creating Anonymous class and object for MyInterface of ClassA **************");

		ClassA.MyInterface myInterface = new ClassA.MyInterface() {

			@Override
			public void method1() {
				System.out.println("method1 of MyInterface");
			}
		};
		
		myInterface.method1();

		System.out.println("************** Accessing the Enum of ClassA **************");
		
		ClassA.ALPHABETS alphabetA= ClassA.ALPHABETS.A;
		
		System.out.println(alphabetA);
	}
}
