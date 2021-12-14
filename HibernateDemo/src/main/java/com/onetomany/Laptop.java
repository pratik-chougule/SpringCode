package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Laptop {
	
	@Id
	private int lid;
	private String lmodel;
	
	@ManyToOne
	private Student student;
	
	
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLmodel() {
		return lmodel;
	}
	public void setLmodel(String lmodel) {
		this.lmodel = lmodel;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lmodel=" + lmodel + ", student=" + student + "]";
	
	}

}
