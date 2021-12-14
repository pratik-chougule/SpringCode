package com.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Student {
	
	@Id
	private int rollnumber;
	private String name;
	
	@OneToMany
	private List<Laptop>laptops;
	
	
	
	
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<Laptop> getLaptops() {
		return laptops;
	}
	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}
	
	
	public Student(int rollnumber, String name, List<Laptop> laptops) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.laptops = laptops;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", laptops=" + laptops + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
