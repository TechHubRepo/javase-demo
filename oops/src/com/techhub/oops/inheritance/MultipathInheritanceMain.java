package com.techhub.oops.inheritance;

/**
 * The MultipathInheritanceMain
 * 
 * @author ramniwash
 */
public class MultipathInheritanceMain {

	/**
	 * The Starting point of application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/** Creating Aeroplane object */
		Aeroplane aeroplane = new Aeroplane();

		/** Aeroplane starting */
		aeroplane.start();

		/** Aeroplane moving */
		aeroplane.move();

		/** Aeroplane fly */
		aeroplane.fly();
	}
}