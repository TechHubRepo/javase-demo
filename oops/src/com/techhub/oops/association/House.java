package com.techhub.oops.association;

import java.util.ArrayList;
import java.util.List;

public class House {

	private int houseNumber;
	private String houseName;
	private List<Room> rooms = new ArrayList<>();

	public House(int houseNumber, String houseName) {
		super();
		this.houseNumber = houseNumber;
		this.houseName = houseName;
	}

	private class Room {

		private int width;
		private int length;
		private int hight;

		public Room(int width, int length, int hight) {
			super();
			this.width = width;
			this.length = length;
			this.hight = hight;
		}

		@Override
		public String toString() {
			return "Room [width=" + width + ", length=" + length + ", hight=" + hight + "]";
		}
	}

	/**
	 * Creating a new room for house with specific size
	 * 
	 * @param width  integer representing the with of room
	 * @param length integer representing the length of room
	 * @param hight  integer representing the hight of room
	 */
	public void createRoom(int width, int length, int hight) {
		Room room = new Room(width, length, hight);
		rooms.add(room);
	}

	@Override
	public String toString() {
		return "House [houseNumber=" + houseNumber + ", houseName=" + houseName + ", rooms=" + rooms + "]";
	}

}
