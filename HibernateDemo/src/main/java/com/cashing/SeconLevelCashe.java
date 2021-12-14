package com.cashing;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.objectstates.Person;

public class SeconLevelCashe {

	public static void main(String[] args) {
		

		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		//first
		
		Person person1 = session.get(Person.class, 102);
		System.out.println(person1);
		
		
		session.close();
		
		
		
		
		Session session2 = factory.openSession();
		
		
		Person person2 = session.get(Person.class, 102);
		System.out.println(person2);
		
		session2.close();

	}

}
