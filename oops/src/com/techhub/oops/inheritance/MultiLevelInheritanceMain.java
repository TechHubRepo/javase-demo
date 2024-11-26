package com.techhub.oops.inheritance;

/**
 * The MultiLevelInheritanceMain class
 * 
 * @author ramniwash
 */
public class MultiLevelInheritanceMain {

	/**
	 * The Starting point of application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Car car = new Car();
		System.out.println(car);

		Car maruti = new Maruti();
		System.out.println(maruti);

		Car maruti800 = new Maruti800();
		System.out.println(maruti800);
	}
}
