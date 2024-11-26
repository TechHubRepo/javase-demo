package com.techhub.oops.association;

/**
 * The CompositionMain
 * 
 * @author ramniwash
 *
 */
public class CompositionMain {

	/**
	 * The Starting point of the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		House house=new House(1008, "Arya House");
		house.createRoom(442, 552, 522);
		house.createRoom(867, 859, 879);
		System.out.println(house);
	}
}
