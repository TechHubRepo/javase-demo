package com.techhub.oops.objectandclass;

import java.util.Date;
import java.util.Map;

import com.techhub.oops.association.DrivingLicence;

/**
 * The Person Class
 * 
 * @author ramniwash
 *
 */
public class Person {

	/** The name of Person state (fields,data) */
	private String name;

	/** The dateOfBirth of Person state (fields,data) */
	private Date dateOfBirth;

	/** The permanentAddress of Person state (fields,data) */
	private Address permanentAddress;

	/** The otherAddresses of Person state (fields,data) */
	private Map<Address.AddressType, Address> otherAddresses;

	/** The drivingLicence */
	private DrivingLicence drivingLicence;

	/** The get behaviour(Code) for name */
	public String getName() {
		return name;
	}

	/** The set behaviour(Code) for name */
	public void setName(String name) {
		this.name = name;
	}

	/** The get behaviour(Code) for dateOfBirth */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/** The set behaviour(Code) for dateOfBirth */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/** The get behaviour(Code) for permanentAddress */
	public Address getPermanentAddress() {
		return permanentAddress;
	}

	/** The set behaviour(Code) for permanentAddress */
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public DrivingLicence getDrivingLicence() {
		return drivingLicence;
	}

	public void setDrivingLicence(DrivingLicence drivingLicence) {
		this.drivingLicence = drivingLicence;
	}

	public Map<Address.AddressType, Address> getOtherAddresses() {
		return otherAddresses;
	}

	public void setOtherAddresses(Map<Address.AddressType, Address> otherAddresses) {
		this.otherAddresses = otherAddresses;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Person [name=");
		stringBuilder.append(name);
		stringBuilder.append(", dateOfBirth=");
		stringBuilder.append(dateOfBirth);
		stringBuilder.append(", permanentAddress=");
		stringBuilder.append(permanentAddress);
		stringBuilder.append(", otherAddresses=");
		stringBuilder.append(otherAddresses);
		stringBuilder.append(", drivingLicence=");
		stringBuilder.append(drivingLicence);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
}
