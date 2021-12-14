package com.objectstates;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	
	@Id
	private int bikeId;
	private String bname;
	
	private String cname;

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(int bikeId, String bname, String cname) {
		super();
		this.bikeId = bikeId;
		this.bname = bname;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", bname=" + bname + ", cname=" + cname + "]";
	}
	
	

}
