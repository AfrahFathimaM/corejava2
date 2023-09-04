package com.tns.inheritance;

public class Student extends citizzen {
	private int rollNo;
	private String collageName;
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collageName=" + collageName + ", getName()=" + getName()
				+ ", getAadhar()=" + getAadhar() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}
	public Student(String name, long aadhar, String address, long phone, int rollNo, String collageName) {
		super(name, aadhar, address, phone);
		this.rollNo = rollNo;
		this.collageName = collageName;
	}
}
