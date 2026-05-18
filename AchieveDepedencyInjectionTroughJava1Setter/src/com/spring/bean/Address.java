package com.spring.bean;

public class Address {

	private int houseno;
	private String city;
	private int pincode;
	
	public Address(int houseno, String city, int pincodeint ) {
		
		this.houseno=houseno;
		this.city=city;
		this.pincode=pincode;
	}

	@Override
	public String toString() {
		return "#"+ houseno + ",  "+ city + ", -"+ pincode;
	}
	
}
