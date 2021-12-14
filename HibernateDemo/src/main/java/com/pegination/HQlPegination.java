package com.pegination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.objectstates.Person;



public class HQlPegination {
	
	public static void main(String [] argdStrings ) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Query query = session.createQuery("from Person");
		
		
		// implementin peginationusing hibernate
		
		query.setFirstResult(2);
		query.setMaxResults(3);
		
		List<Person> list = query.list();
		
		for(Person person : list) {
			
			System.out.println(person.getPersonId()+ " : "+ person.getPname()+" : "+person.getPaddress());
			
		}
		
		
		
		session.close();
		factory.close();
		
	}

}
