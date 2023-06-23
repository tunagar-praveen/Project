package com.nt.model;

public class Address {
	private String city;
	private String state;
	private String street;
	private int pincode;
	
	public Address(String city, String state, String street, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.street = street;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


}
