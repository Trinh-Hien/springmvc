package com.trinhthihien.model;

public class Customer {
	private String customerID;
	private String customerName;
	private String address;
	private String phoneNumber;
	private String email;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerID, String customerName, String address, String phoneNumber, String email) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", address=" + address
				+ ", phoneNumer=" + phoneNumber + ", email=" + email + "]";
	}

}
