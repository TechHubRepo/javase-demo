package com.techhub.javasedemo.langpackage.thread.deadlock;

public class Resource2 {

	public void useResource() throws InterruptedException {
		Thread thread = Thread.currentThread();
		String tName = thread.getName();
		for (int i = 1; i <= 5; i++) {
			System.out.println(tName + " is using Resource2");
			Thread.sleep(1000);
		}
	}
}
