package com.techhub.oops.inheritance;

import com.techhub.oops.objectandclass.Person;

/**
 * The Employee
 * 
 * @author ramniwash
 */
public class Employee extends Person {

	private String employeeId;
	private String designation;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", designation=" + designation + "]";
	}
}
