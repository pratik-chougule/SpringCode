package com.springcore.ci;

import java.security.cert.Certificate;

public class Person {
	
	private String name;
	private int personID;
	private Certi certi;
	
	public Person(String nameString, int persomID,Certi certi ){
    	
    	this.name=name;
    	this.personID=personID;
    	this.certi=certi;
    	
    	
    }


	@Override
	public String toString() {
		
		return this.name+" :   "+this.personID+"{"+this.certi.name+"}";
	}
    
    
}
