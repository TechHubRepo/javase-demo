package com.techhub.javasedemo.abstractclass;

public abstract class Graphics2D {

	protected int x, y;

	public Graphics2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void moveTo(int newX, int newY) {
		this.x = newX;
		this.y = newY;
		System.out.println("Object Moved to new coordinate x : " + this.x + ", y : " + this.y);
	}

	public abstract void draw();

	public abstract void resize();
}
