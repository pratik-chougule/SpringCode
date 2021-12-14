package com.springcore.expressionlang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+11}")
	private int x;
	
	@Value("#{20+10+33-12}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(144)}")
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	@Value("#{new java.lang.String('Pratik Chougule')}")
	private String name;
	
	@Value("#{ 8-5>3 }")
	private boolean isActive;
	
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	

}
