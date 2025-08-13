package com.Entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;



@Entity
public class Employee {
	@Id
	private String employeeId;
	private String employeeName;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
	
	private List<Account> account;
	public Employee(String employeeId, String employeeName, List<Account> account) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.account = account;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", account=" + account + "]";
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
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

	

	public Employee() {
		super();
	}
	

}
