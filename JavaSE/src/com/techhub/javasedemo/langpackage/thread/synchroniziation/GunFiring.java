package com.techhub.javasedemo.langpackage.thread.synchroniziation;

public class GunFiring extends Thread {

	private Gun gun;
	private int bulletsToBeFired;

	public GunFiring(Gun gun, int bulletsToBeFired) {
		super();
		this.gun = gun;
		this.bulletsToBeFired = bulletsToBeFired;
	}

	@Override
	public void run() {
		this.gun.fire(bulletsToBeFired);
	}
}
