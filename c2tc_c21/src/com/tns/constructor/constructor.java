package com.tns.constructor;
//display constructor
public class constructor {
private String name;
private int customerId;
private String CustomerCity;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
@Override
public String toString() {
	return "constructor [name=" + name + ", customerId=" + customerId + ", CustomerCity=" + CustomerCity + "]";
}
public String getCustomerCity() {
	return CustomerCity;
}
public void setCustomerCity(String customerCity) {
	CustomerCity = customerCity;
}
public constructor() {

System.out.println("default");
}
public constructor(String name,int customerId,String CustomerCity) {
	this();//to call default constructor
  this.name=name;
  this.customerId=customerId;
  this.CustomerCity=CustomerCity;

}
}