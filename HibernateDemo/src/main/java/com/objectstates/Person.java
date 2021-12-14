package com.objectstates;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Person {
	
	@Id
	private int personId;
	private String pname;
	private String paddress;
	
	@OneToOne
	private Bike bike;
	
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int personId, String pname, String paddress, Bike bike) {
		super();
		this.personId = personId;
		this.pname = pname;
		this.paddress = paddress;
		this.bike = bike;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", pname=" + pname + ", paddress=" + paddress + ", bike=" + bike + "]";
	}
	
	
	
	

}
