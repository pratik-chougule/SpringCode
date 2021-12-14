package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Pratik")
	private String studedentName;
	@Value("Kolhapur")
	private String City;
	
	@Value("#{temp}")
	private List<String> address;
	
	
	public String getStudedentName() {
		return studedentName;
	}
	public void setStudedentName(String studedentName) {
		this.studedentName = studedentName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studedentName=" + studedentName + ", City=" + City + "]";
	}
	
	

}
