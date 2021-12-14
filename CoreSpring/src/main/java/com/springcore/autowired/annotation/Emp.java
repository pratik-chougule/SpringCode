package com.springcore.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	 @Autowired
	@Qualifier("temp")
	private Address  address;

	

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	// @Atuwired
	public void setAddress(Address address) {
		
		
		this.address = address;
		
	}
	

	//@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside costructor");
	}

	
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	
	
}
