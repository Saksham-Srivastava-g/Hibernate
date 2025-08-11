package com.Entity;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Company {
   private String registrationNo;
   private String CompanyName;
   private String policy;
   @Embedded
   private Account account;
   public Company(String registrationNo, String companyName, String policy, Account account) {
	super();
	this.registrationNo = registrationNo;
	CompanyName = companyName;
	this.policy = policy;
	this.account = account;
   }
   @Override
   public String toString() {
	return "Company [registrationNo=" + registrationNo + ", CompanyName=" + CompanyName + ", policy=" + policy
			+ ", account=" + account + "]";
   }
   public String getRegistrationNo() {
	return registrationNo;
   }
   public void setRegistrationNo(String registrationNo) {
	this.registrationNo = registrationNo;
   }
   public String getCompanyName() {
	return CompanyName;
   }
   public void setCompanyName(String companyName) {
	CompanyName = companyName;
   }
   public String getPolicy() {
	return policy;
   }
   public void setPolicy(String policy) {
	this.policy = policy;
   }
   public Account getAccount() {
	return account;
   }
   public void setAccount(Account account) {
	this.account = account;
   }
   public Company() {
	super();
   }
   
}
