package com.Entity;

import java.time.LocalDateTime;

import javax.persistence.Embeddable;
@Embeddable
public class Car {
  private String carNo;
  private String carModel;
  private LocalDateTime localDatetime;
  private double price;
  public Car() {
	super();
  }
  public Car(String carNo, String carModel, LocalDateTime localDatetime, double price) {
	super();
	this.carNo = carNo;
	this.carModel = carModel;
	this.localDatetime = localDatetime;
	this.price = price;
  }
  public String getCarNo() {
	return carNo;
  }
  public void setCarNo(String carNo) {
	this.carNo = carNo;
  }
  public String getCarModel() {
	return carModel;
  }
  public void setCarModel(String carModel) {
	this.carModel = carModel;
  }
  public LocalDateTime getLocalDatetime() {
	return localDatetime;
  }
  public void setLocalDatetime(LocalDateTime localDatetime) {
	this.localDatetime = localDatetime;
  }
  public double getPrice() {
	return price;
  }
  public void setPrice(double price) {
	this.price = price;
  }
  
  
  
}
