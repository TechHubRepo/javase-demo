package com.techhub.javasedemo.langpackage.thread.synchroniziation;

public class NumberCountDownMain {
	public static void main(String[] args) {
		
		/** The Resource */
		NumberCountDown numberCountDown = new NumberCountDown();

		/** The Thread X */
		NumberCountDownThread countDownThread = new NumberCountDownThread(numberCountDown);
		countDownThread.setName("X");
		/** The Thread  Y */
		NumberCountDownThread countDownThread2 = new NumberCountDownThread(numberCountDown);
		countDownThread2.setName("Y");
		
		countDownThread.start();
		countDownThread2.start();
	}

}
