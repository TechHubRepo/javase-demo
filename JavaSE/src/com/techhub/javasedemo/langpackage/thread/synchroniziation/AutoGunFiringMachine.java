package com.techhub.javasedemo.langpackage.thread.synchroniziation;

public class AutoGunFiringMachine extends Thread {

	private GunFiring gunFiring;
	private GunReloading gunReloading;

	public AutoGunFiringMachine(int totalBuiltToFire) {
		Gun gun = new Gun();
		this.gunFiring = new GunFiring(gun, totalBuiltToFire);
		this.gunReloading = new GunReloading(gun, totalBuiltToFire - Gun.MAX_BULLETS);
	}

	@Override
	public void run() {
		this.gunFiring.start();
		this.gunReloading.start();
	}

}
