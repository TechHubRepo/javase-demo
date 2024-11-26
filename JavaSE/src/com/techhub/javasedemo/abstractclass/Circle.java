package com.techhub.javasedemo.abstractclass;

public class Circle extends Graphics2D{

	public Circle(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw() {
		System.out.println("******* Circle drawn *******");
		System.out.println("At : x : "+x+ ", y : "+y);
	}

	@Override
	public void resize() {
		System.out.println("******* Circle resized *******");
		System.out.println("by : x : "+x+ ", y : "+y);
	}
}
