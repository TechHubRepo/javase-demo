package com.techhub.javasedemo.langpackage.thread.deadlock;

public class DeadLockMain {

	public static void main(String[] args) {
		
		Resource1 resource1=new Resource1();
		Resource2 resource2=new Resource2();
		
		Thread1 thread1=new Thread1(resource1, resource2);
		Thread2 thread2=new Thread2(resource1, resource2);

		thread1.start();
		thread2.start();
		
	}
}
