package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {

		// get , load

		// SessionFactory session = new
		// Configuration().configure().buildSessionFactory();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Student student=(Student)session.load(Student.class,102);
	    System.out.println(student.getName());

//		Address address = (Address) session.get(Address.class, 2);
//		System.out.println(address);
//		System.out.println(address.getCity() + " : " + address.getStreet());
		
//		Address address1 = (Address) session.get(Address.class, 2);
//		System.out.println(address1);
//		System.out.println(address1.getCity() + " : " + address1.getStreet());
  
	    
		session.close();
		factory.close();

	}

}
