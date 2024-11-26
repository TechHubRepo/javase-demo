package com.techhub.javasedemo.langpackage.thread.synchroniziation;

public class GunReloading extends Thread {

	private Gun gun;
	private int totalBuiltToReload;

	public GunReloading(Gun gun, int totalBuiltToReload) {
		super();
		this.gun = gun;
		this.totalBuiltToReload = totalBuiltToReload;
	}

	@Override
	public void run() {
		while (totalBuiltToReload > 0) {
			if (totalBuiltToReload < Gun.MAX_BULLETS) {
				this.gun.reload(totalBuiltToReload);
				totalBuiltToReload = 0;
			} else {
				totalBuiltToReload -= Gun.MAX_BULLETS;
				this.gun.reload(Gun.MAX_BULLETS);
			}
		}
	}
}
