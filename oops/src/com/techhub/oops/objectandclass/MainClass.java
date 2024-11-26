package com.techhub.oops.objectandclass;

import java.util.Date;

/**
 * The MainClass
 * 
 * @author ramniwash
 *
 */
public class MainClass {

	/**
	 * The starting point of the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating the Person object
		Person person = new Person();

		// Setting the person name to the Person object
		person.setName("Ram Niwash");
		// Setting the date of birth (Current system date) to the Person object
		person.setDateOfBirth(new Date());

		// Creating the Address object
		Address permanentAddress = new Address();

		// Setting the Country name to Address object
		permanentAddress.setCountry("Indian");
		// Setting the Home town name to Address object
		permanentAddress.setHomeTown("Town Park");
		// Setting the Pin code number to Address object
		permanentAddress.setPinCode(254569);
		// Setting the State name to Address object
		permanentAddress.setState("Punjab");
		// Setting the State name to Address object
		permanentAddress.setDistrict("Bathinda");
		// Setting the Thsil name to Address object
		permanentAddress.setThsil("Bathinda");
		// Setting the Village or City name to Address object
		permanentAddress.setVillageOrCity("Xyz");

		// Setting the permanent address to the Person object
		person.setPermanentAddress(permanentAddress);

		System.out.println(person.getName());
		System.out.println(person);
		System.out.println(person.getPermanentAddress());
	}
}
