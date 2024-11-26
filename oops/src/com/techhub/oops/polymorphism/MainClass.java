package com.techhub.oops.polymorphism;

/**
 * The MainClass
 * 
 * @author ramniwash
 *
 */
public class MainClass {

	/**
	 * Starting point of the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/** Creating the Fan object */
		Fan fan = new Fan();

		/** Start the fan at normal speed 900 rpm rate */
		fan.start();

		/** Start the fan at specific speed rate */
		fan.start(1100);
		
		System.out.println("---------------------------------------------------------------");
		
		/** Creating the Cooler object */
		Fan cooler = new Cooler();

		/** Start the Cooler at normal speed 1200 rpm rate */
		cooler.start();

		/** Start the fan at specific rate */
		cooler.start(1500);
		
	}
}
