package com.cashing;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.objectstates.Person;

public class FirstLevelCashe {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// by default enabled in hibernate 
		Person person= session.get(Person.class, 102);
		System.out.println(person);
		
		System.out.println("Working something....");
		
		Person person2 = session.get(Person.class, 102);
		System.out.println(person2);
		
		
		
		
		session.close();

	}

}
