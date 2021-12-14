package com.objectstates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		// creating person object
		
		Person person = new Person();
		person.setPersonId(11);
		person.setPname("Kajal");
		person.setPaddress("Kolhapur");
		
		Person person1 = new Person();
		person1.setPersonId(12);
		person1.setPname("Komal");
		person1.setPaddress("Sangali");
		
		Person person2 = new Person();
		person2.setPersonId(13);
		person2.setPname("Sagarika");
		person2.setPaddress("Satara");
		//person.setbike(new Bike(101, "Pulsar", "Bajaj"));
		// person :transient
		
		Bike bike = new Bike();
		bike.setBikeId(201);
		bike.setBname("pulsar");
		bike.setCname("Bajaja");
		person.setBike(bike);
		
		Bike bike1 = new Bike();
		bike1.setBikeId(202);
		bike1.setBname("Hunk");
		bike1.setCname("Yamaha");
		person1.setBike(bike1);
		
		Bike bike2 = new Bike();
		bike2.setBikeId(203);
		bike2.setBname("Pleasure");
		bike2.setCname("Hero");
		person.setBike(bike2);
		
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		session.save(person);
		session.save(person1);
		session.save(person2);
		
		session.save(bike);
		session.save(bike1);
		session.save(bike2);
		
		//person:Persistent ->session, database
		
		
		tx.commit();
		session.close();
		factory.close();

	}

}
