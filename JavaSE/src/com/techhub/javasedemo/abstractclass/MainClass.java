package com.techhub.javasedemo.abstractclass;

public class MainClass {

	public static void main(String[] args) {
		

		Graphics2D graphics2d=new Circle(10, 10);
		
		graphics2d.draw();
		
		graphics2d.moveTo(20,20);
		
		graphics2d.resize();
		
		graphics2d.draw();
		
	}

}
