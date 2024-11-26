package com.techhub.javasedemo.langpackage.thread.synchroniziation;

/**
 * The NumberCountDown resource
 * 
 * @author ramniwash
 *
 */
public class NumberCountDown {

	private byte total = 127;

	public byte getTotal() {
		return this.total;
	}

	public void decrementbyOne() {
		this.total -= 1;
	}
}
