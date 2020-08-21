package com.trinhthihien.model;


import java.time.LocalDate;
import java.time.LocalTime;

public class RegisterService {
	private String customerID;
	private String serviceID;
	private LocalDate date;
	private LocalTime time;
	private int quantity;

	public RegisterService() {
		// TODO Auto-generated constructor stub
	}

	public RegisterService(String customerID, String serviceID, LocalDate date, LocalTime time, int quantity) {
		super();
		this.customerID = customerID;
		this.serviceID = serviceID;
		this.date = date;
		this.time = time;
		this.quantity = quantity;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getServiceID() {
		return serviceID;
	}

	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "UseOfTheService [customerID=" + customerID + ", serviceID=" + serviceID + ", date=" + date + ", time="
				+ time + ", quantity=" + quantity + "]";
	}

}
