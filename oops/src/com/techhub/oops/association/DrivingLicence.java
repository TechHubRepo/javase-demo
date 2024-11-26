package com.techhub.oops.association;

import java.util.Date;

/**
 * The DrivingLicence
 * 
 * @author ramniwash
 */
public class DrivingLicence {

	private String dlID;
	private Date validUpto;
	private Date issuedOn;
	private VehicleClass vehicleClass;

	public enum VehicleClass {
		MCWG, LMV, TRACTOR;
	}

	public String getDlID() {
		return dlID;
	}

	public void setDlID(String dlID) {
		this.dlID = dlID;
	}

	public Date getValidUpto() {
		return validUpto;
	}

	public void setValidUpto(Date validUpto) {
		this.validUpto = validUpto;
	}

	public Date getIssuedOn() {
		return issuedOn;
	}

	public void setIssuedOn(Date issuedOn) {
		this.issuedOn = issuedOn;
	}

	public VehicleClass getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(VehicleClass vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	@Override
	public String toString() {
		return this.dlID;
	}
}
