package com.techhub.javasedemo.enumdemo;

public enum Direction {
	EAST(0), WEST(180), NORTH(90), SOUTH(270);

	private int angle;
	
//	static{
//		System.out.println("Enum Static Block");
//	}
//	
//	{
//		System.out.println("Enum Instance Block");
//	}

	private Direction(int angle) {
		this.angle = angle;
	}

	public int getAngle() {
		return this.angle;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(this.name());
		string.append("-");
		string.append(this.angle);
		return string.toString();
	}
}
