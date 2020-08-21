package com.trinhthihien.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class RegisterComputer {
	private String customerID;
	private String computerID;
	private LocalDate date;
	private LocalTime time;
	private int periodOfTime;

	public RegisterComputer() {
		// TODO Auto-generated constructor stub
	}

	public RegisterComputer(String customerID, String computerID, LocalDate date, LocalTime time, int periodOfTime) {
		super();
		this.customerID = customerID;
		this.computerID = computerID;
		this.date = date;
		this.time = time;
		this.periodOfTime = periodOfTime;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getComputerID() {
		return computerID;
	}

	public void setComputerID(String computerID) {
		this.computerID = computerID;
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

	public int getPeriodOfTime() {
		return periodOfTime;
	}

	public void setPeriodOfTime(int periodOfTime) {
		this.periodOfTime = periodOfTime;
	}

	@Override
	public String toString() {
		return "UseOfTheComputer [customerID=" + customerID + ", computerID=" + computerID + ", date=" + date
				+ ", time=" + time + ", periodOfTime=" + periodOfTime + "]";
	}

}
