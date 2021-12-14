package com.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		
	   Configuration cfg = new Configuration();
	   cfg.configure("hibernate.cfg.xml");
	   SessionFactory factory = cfg.buildSessionFactory();
	   
	   
	   Student s1 = new Student();
	   s1.setRollnumber(101);
	   s1.setName("pratik");
	   
	   
	   
	   Laptop laptop = new Laptop();
	   laptop.setLid(201);
	   laptop.setLmodel("HP");
	   laptop.setLmodel("Dell");
	  //laptop.setStudent(s1);
	  // s1.setLaptop(laptop);
	 
	   
	   
	   Session session = factory.openSession();
	   Transaction tx = session.beginTransaction();
	   
	   
	   session.save(s1);
	   session.save(laptop);
	   
	   
	   
	   tx.commit();
	   
	   
	   
	   session.close();
	   
	    factory.close();

	}

}
