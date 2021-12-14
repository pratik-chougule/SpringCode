package com.springcore.autowired;

public class Emp {
	
	private Address  address;

	

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		
		
		this.address = address;
		
	}
	

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside costructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	
	
}
