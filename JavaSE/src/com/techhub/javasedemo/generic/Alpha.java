package com.techhub.javasedemo.generic;

public class Alpha<T extends X & Y & Z> {

	private T type;

	public Alpha(T type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return this.type.getX() + " , " + this.type.getY() + " , " + this.type.getZ();
	}
}