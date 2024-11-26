package com.techhub.oops.objectandclass;

/**
 * The Address class
 * 
 * @author ramniwash
 *
 */
public class Address {

	/** The homeTown of Address state (fields,data) */
	private String homeTown;

	/** The villageOrCity of Address state (fields,data) */
	private String villageOrCity;

	/** The thsil state of Address state (fields,data) */
	private String thsil;

	/** The district state of Address state (fields,data) */
	private String district;

	/** The state of Address state (fields,data) */
	private String state;

	/** The country of Address state (fields,data) */
	private String country;

	/** The pinCode of Address state (fields,data) */
	private int pinCode;

	/** The get behaviour(Code) for homeTown */
	public String getHomeTown() {
		return homeTown;
	}

	/** The set behaviour(Code) for homeTown */
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	/** The get behaviour(Code) for homeTown */
	public String getVillageOrCity() {
		return villageOrCity;
	}

	/** The set behaviour(Code) for homeTown */
	public void setVillageOrCity(String villageOrCity) {
		this.villageOrCity = villageOrCity;
	}

	/** The get behaviour(Code) for homeTown */
	public String getThsil() {
		return thsil;
	}

	/** The set behaviour(Code) for homeTown */
	public void setThsil(String thsil) {
		this.thsil = thsil;
	}

	/** The get behaviour(Code) for homeTown */
	public String getDistrict() {
		return district;
	}

	/** The set behaviour(Code) for homeTown */
	public void setDistrict(String district) {
		this.district = district;
	}

	/** The get behaviour(Code) for homeTown */
	public String getState() {
		return state;
	}

	/** The set behaviour(Code) for homeTown */
	public void setState(String state) {
		this.state = state;
	}

	/** The get behaviour(Code) for homeTown */
	public String getCountry() {
		return country;
	}

	/** The set behaviour(Code) for homeTown */
	public void setCountry(String country) {
		this.country = country;
	}

	/** The get behaviour(Code) for homeTown */
	public int getPinCode() {
		return pinCode;
	}

	/** The set behaviour(Code) for pinCode */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public enum AddressType {
		CURRENT_ADDRESS, PERMANENT_ADDRESS, TEMPORARY_ADDRESS
	}

	@Override
	public String toString() {
		return "Address [homeTown=" + homeTown + ", villageOrCity=" + villageOrCity + ", thsil=" + thsil + ", district="
				+ district + ", state=" + state + ", country=" + country + ", pinCode=" + pinCode + "]";
	}

}
