package com.techhub.javasedemo.langpackage.thread.synchroniziation;

public class NumberCountDownThread extends Thread {

	private NumberCountDown numberCountDown;

	public NumberCountDownThread(NumberCountDown numberCountDown) {
		super();
		this.numberCountDown = numberCountDown;
	}

	@Override
	public void run() {

		while (this.numberCountDown.getTotal() > 0) {
			synchronized (numberCountDown) {
				System.out.println(this.getName() + " decrementing number  " + this.numberCountDown.getTotal());
				this.numberCountDown.decrementbyOne();
			}
		}
	}

}
