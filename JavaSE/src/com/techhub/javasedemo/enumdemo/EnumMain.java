package com.techhub.javasedemo.enumdemo;

public class EnumMain {

	public static void main(String[] args) {

		Direction directionEast = Direction.EAST;
		Direction directionWest = Direction.WEST;
		Direction directionNorth = Direction.NORTH;
		Direction directionSouth = Direction.SOUTH;

		System.out.println("********** Direction.EAST  **********");
		System.out.println(directionEast);
		System.out.println(directionEast.name());
		System.out.println(directionEast.getAngle());

		System.out.println("********** Direction.WEST  **********");
		System.out.println(directionWest);
		System.out.println(directionWest.name());
		System.out.println(directionWest.getAngle());

		System.out.println("********** Direction.NORTH  **********");
		System.out.println(directionNorth);
		System.out.println(directionNorth.name());
		System.out.println(directionNorth.getAngle());

		System.out.println("********** Direction.SOUTH  **********");
		System.out.println(directionSouth);
		System.out.println(directionSouth.name());
		System.out.println(directionSouth.getAngle());

		System.out.println("********** User Switch statement for Enum **********");
		
		switch (directionEast) {
		case EAST:
			System.out.println("This is EAST");
			break;
		case WEST:
			System.out.println("This is WEST");
			break;
		case NORTH:
			System.out.println("This is NORTH");
			break;
		case SOUTH:
			System.out.println("This is SOUTH");
		}
	}
}
