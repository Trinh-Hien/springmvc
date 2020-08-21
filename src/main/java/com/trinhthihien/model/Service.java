package com.trinhthihien.model;

public class Service {
	private String serviceID;
	private String serviceName;
	private String unit;
	private int price;

	public Service() {
		// TODO Auto-generated constructor stub
	}

	public Service(String serviceID, String serviceName, String unit, int price) {
		super();
		this.serviceID = serviceID;
		this.serviceName = serviceName;
		this.unit = unit;
		this.price = price;
	}

	public String getServiceID() {
		return serviceID;
	}

	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Service [serviceID=" + serviceID + ", serviceName=" + serviceName + ", unit=" + unit + ", price="
				+ price + "]";
	}

}
