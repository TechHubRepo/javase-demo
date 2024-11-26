package com.techhub.oops.association;

import java.time.LocalDate;
import java.util.Date;

import com.techhub.oops.objectandclass.Person;

/**
 * The OneToOneMain class
 * 
 * @author ramniwash
 */
public class OneToOneMain {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Ram Niwash");
		person.setDateOfBirth(new Date());

		DrivingLicence drivingLicence = new DrivingLicence();
		drivingLicence.setDlID("DL-687889-f798");
		drivingLicence.setIssuedOn(new Date(LocalDate.parse("2020-01-20").toEpochDay()));
		drivingLicence.setValidUpto(new Date(LocalDate.parse("2028-01-20").toEpochDay()));
		drivingLicence.setVehicleClass(DrivingLicence.VehicleClass.LMV);
		
		person.setDrivingLicence(drivingLicence);
		
		System.out.println(person);
		System.out.println(person.getDrivingLicence());
	}
}
