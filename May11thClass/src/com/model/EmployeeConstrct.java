package com.model;

public class EmployeeConstrct {
	private int empId;
	private String empName;
	private float empSalary;
	private String empContact;
	
	public EmployeeConstrct() {
		empName= "Stgian";
		empSalary= 29500f;
		empContact= "0000000000";
	}
	
	public EmployeeConstrct(int empId, String empName, float empSalary, String empContact) {
		this.empId= empId;
		this.empName= empName;
		this.empSalary= empSalary;
		this.empContact= empContact;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpContact() {
		return empContact;
	}

	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}
	
	
}
