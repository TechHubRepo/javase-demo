package com.techhub.oops.inheritance;

/**
 * The Helicopter class
 * 
 * @author ramniwash
 */
public class Helicopter implements FlyingVehicle {

	@Override
	public void start() {
		System.out.println("******* HELICOPTER STARTED... *******");

	}

	@Override
	public void fly() {
		System.out.println("******* HELICOPTER FLYING... *******");
	}

}
