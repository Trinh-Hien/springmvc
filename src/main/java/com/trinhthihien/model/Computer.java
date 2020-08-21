package com.trinhthihien.model;

public class Computer {
	private String computerID;
	private String position;
	private String status;

	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(String computerID, String position, String status) {
		super();
		this.computerID = computerID;
		this.position = position;
		this.status = status;
	}

	public String getComputerID() {
		return computerID;
	}

	public void setComputerID(String computerID) {
		this.computerID = computerID;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Computer [computerID=" + computerID + ", position=" + position + ", status=" + status + "]";
	}

}
