package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
     
	private int rollno;
	private String name;
	//Use @Autowired Annotation
	@Autowired
	private Address address;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
	
	
	public void display() {
		System.out.println("rollno :"+ rollno);
		System.out.println("name :"+ name);
		System.out.println("address :"+ address);
	}
}
