package com.Entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	private String employeeId;
	private String employeeName;
	@Embedded
	private Company company;
	@Embedded
	private Car car;
	public Employee(String employeeId, String employeeName, Company company, Car car) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.company = company;
		this.car = car;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", company=" + company
				+ ", car=" + car + "]";
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Employee() {
		super();
	}
	

}
