package com.tut;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class EmDemo {

	public static void main(String[] args) {
	
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Student student1 = new Student();
		student1.setId(102);
		student1.setName("Samir");
		student1.setCity("Kanpur");
		
		Certificate certificate =new Certificate();
		certificate.setCourse("python");
		certificate.setDuration("2 Months");
		
		
		student1.setCerti(certificate);
		

		Student student2 = new Student();
		student2.setId(106);
		student2.setName("Nikita");
		student2.setCity("Virar");
		
		Certificate certificate1 =new Certificate();
		certificate1.setCourse("Java");
		certificate1.setDuration("3 Months");
		
		
		student2.setCerti(certificate1);
		
		Session session = factory.openSession();
		
		org.hibernate.Transaction tx = session.beginTransaction();
		
		// object save 
		
		session.save(student1);
		session.save(student2);
		
		tx.commit();
		
		
		
		session.close();
		
		factory.close();
		

	}

}
