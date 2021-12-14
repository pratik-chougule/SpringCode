package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo1 implements InitializingBean,DisposableBean {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Demo1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Demo1 [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Taking Pepsi : init");
		
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("Going to put bottle back to shop :destroy");
		
	}
	
	

}
