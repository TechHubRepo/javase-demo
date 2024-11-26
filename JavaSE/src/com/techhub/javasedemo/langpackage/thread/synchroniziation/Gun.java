package com.techhub.javasedemo.langpackage.thread.synchroniziation;

public class Gun {

	public static final byte MAX_BULLETS = 50;
	private int totalBullets = 50;

	public synchronized void fire(int bulletsToBeFired) {
		for (int i = 1; i <= bulletsToBeFired; i++) {
			System.out.println("Firing bullets number :  " + i);
			if (totalBullets == 0) {
				System.out.println(i - 1 + " bullets fired and " + totalBullets + " remains");
				try {
					this.wait();
					this.notify();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Continuing the fire after reloading");
			}
			totalBullets--;
		}
		System.out.println("The firing process is complete");
		this.notify();
	}

	public synchronized void reload(int bulletsToBeReloaded) {
		System.out.println("Reloading the Gun ... .. ." + bulletsToBeReloaded);
		if (bulletsToBeReloaded <= MAX_BULLETS) {
			totalBullets += bulletsToBeReloaded;
			this.notify();
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return;
		}
		throw new RuntimeException("Max limit is " + MAX_BULLETS + " can be loaded [invalue] " + bulletsToBeReloaded);
	}
}
