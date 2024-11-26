package com.techhub.oops.association;

import java.util.Date;

import com.techhub.oops.objectandclass.Address;
import com.techhub.oops.objectandclass.Person;

/**
 * The UnidirectionalMain class
 * 
 * @author ramniwash
 *
 */
public class UnidirectionalMain {

	/**
	 * Starting point of the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating the Person object
		Person person = new Person();
		person.setName("Ram Niwash");
		person.setDateOfBirth(new Date());

		Address permanentAddress = new Address();
		permanentAddress.setCountry("Indian");
		permanentAddress.setHomeTown("Town Park");
		permanentAddress.setPinCode(254569);
		permanentAddress.setState("Punjab");
		permanentAddress.setDistrict("Bathinda");
		permanentAddress.setThsil("Bathinda");
		permanentAddress.setVillageOrCity("Xyz");

		person.setPermanentAddress(permanentAddress);

		/**
		 * We can get the Address from Person
		 */
		System.out.println(person.getPermanentAddress());

		/**
		 * We can't get the Person from Address
		 */
//				System.out.println(permanentAddress.getPerson());

	}
}
