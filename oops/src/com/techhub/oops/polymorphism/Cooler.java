package com.techhub.oops.polymorphism;

/**
 * The Cooler class
 * 
 * @author ramniwash
 *
 */
public class Cooler extends Fan {

	/**
	 * Start the Cooler at normal 1200 rpm speed rate
	 */
	@Override
	public void start() {
		System.out.println("****** THE COOLER IS STARTED AT NORMAL 1200 RPM SPEED RATE ******");
		System.out.println("****** THE COOLER WATER PUMP STARTED IF LEFT ON ******");
	}
}
