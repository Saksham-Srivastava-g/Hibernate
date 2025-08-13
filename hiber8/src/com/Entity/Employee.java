package com.Entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Employee {
	@Id
	private String employeeId;
	private String employeeName;
	@OneToOne(cascade = CascadeType.ALL)
	private Account account;
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", account=" + account + "]";
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

	public Employee(String employeeId, String employeeName,Account account) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.account=account;
	}

	public Employee() {
		super();
	}
	

}
