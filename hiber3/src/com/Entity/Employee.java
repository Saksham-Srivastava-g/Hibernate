package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eid;
	
	private String name;
	private String eaddress;
	private int esalary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public Employee() {
		super();
	}
	public Employee(int eid, String name, String eaddress, int esalary) {
		super();
		this.eid = eid;
		this.name = name;
		this.eaddress = eaddress;
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", eaddress=" + eaddress + ", esalary=" + esalary + "]";
	}
	

}
