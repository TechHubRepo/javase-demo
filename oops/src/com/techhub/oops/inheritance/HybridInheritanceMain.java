package com.techhub.oops.inheritance;

/**
 * The HybridInheritanceMain class
 * 
 * @author ramniwash
 */
public class HybridInheritanceMain {

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

		System.out.println("---------------------------------------------------------------");

		/** Creating Helicopter object */
		Helicopter helicopter = new Helicopter();
		
		/** Helicopter starting */
		helicopter.start();
		
		/** Helicopter fly */
		helicopter.fly();

	}
}
