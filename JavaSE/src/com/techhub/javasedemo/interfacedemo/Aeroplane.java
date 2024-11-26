package com.techhub.javasedemo.interfacedemo;

/**
 * The Aeroplane Object
 * 
 * @author ramniwash
 */
public class Aeroplane implements MovingVehicle, FlyingVehicle {

	@Override
	public void start() {
		System.out.println("******* AEROPLANE STARTED... *******");
	}

	@Override
	public void move() {
		System.out.println("******* AEROPLANE MOVING... *******");
	}

	@Override
	public void fly() {
		System.out.println("******* AEROPLANE FLYING... *******");
	}

}
