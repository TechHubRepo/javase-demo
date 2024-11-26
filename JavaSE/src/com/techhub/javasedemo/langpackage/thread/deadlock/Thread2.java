package com.techhub.javasedemo.langpackage.thread.deadlock;

public class Thread2 extends Thread {
	private Resource1 resource1;
	private Resource2 resource2;

	public Thread2(Resource1 resource1, Resource2 resource2) {
		this.resource1 = resource1;
		this.resource2 = resource2;
	}

	@Override
	public void run() {
		try {
			synchronized (resource2) {
				resource2.useResource();
				/**
				 * This will create dead-lock situation
				 */
				synchronized (resource1) {
					resource1.useResource();
				}
			}
			// Place here the dead-lock creating situation otherwise change the locking order of object in one any one thread.
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}