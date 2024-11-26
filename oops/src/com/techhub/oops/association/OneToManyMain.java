package com.techhub.oops.association;

import java.util.Map;

import com.techhub.oops.objectandclass.Address;
import com.techhub.oops.objectandclass.Person;

/**
 * The OneToOneMain class
 * 
 * @author ramniwash
 */
public class OneToManyMain {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Ram Niwash");

		Address address1 = new Address();
		address1.setCountry("Indian");
		address1.setHomeTown("Town Park");
		address1.setPinCode(254569);
		address1.setState("Punjab");
		address1.setDistrict("Bathinda");
		address1.setThsil("Bathinda");
		address1.setVillageOrCity("Xyz");

		Address address2 = new Address();
		address2.setCountry("Indian");
		address2.setHomeTown("BTM 1st Stage");
		address2.setPinCode(854895);
		address2.setState("Karnataka");
		address2.setDistrict("Banguluru");
		address2.setThsil("Banguluru");
		address2.setVillageOrCity("Banguluru");

		Map<Address.AddressType, Address> addressMap = Map.of(Address.AddressType.PERMANENT_ADDRESS, address1,
				Address.AddressType.CURRENT_ADDRESS, address2);

		person.setOtherAddresses(addressMap);
		System.out.println(person);

	}
}
