package com.techhub.oops.polymorphism;

/**
 * The Fan
 * 
 * @author ramniwash
 *
 */
public class Fan {

	/**
	 * Start the fan at normal 900 rpm speed rate
	 */
	public void start() {
		System.out.println("****** FAN STARTED AT NORMAL 900 RPM SPEED RATE ******");
	}

	/**
	 * Start the fan at normal specific speed rate
	 */
	public void start(int rpm) {
		System.out.println("****** FAN STARTED AT " + rpm + " RPM  SPEED RATE ******");
	}

}
