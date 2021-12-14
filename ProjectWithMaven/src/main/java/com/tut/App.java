package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("project started...!");

		// SessionFactory is a interface

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		// second way of creating object
		/*
		 * Configuration cfg= new Configuration(); cfg.configure(); SessionFactory
		 * factory =cfg.buildSessionFactory();
		 * 
		 */

		// creating student

		Student student = new Student();
		student.setId(103);
		student.setName("Pratik");
		student.setCity("Delhi");

		// Creating object of address class

		Address address = new Address();
		address.setStreet("street3");
		address.setCity("Lucknow");
		address.setOpen(true);
		address.setAddedDate((java.util.Date) new Date());
		address.setX(123);
		
		// Reading image 
		
		FileInputStream fis = new FileInputStream("src/main/java/PRATIK_jpg(1).JPEG");
		byte[] data= new byte[fis.available()];
		fis.read(data);
		address.setImage(data);
		// System.out.println(student);

		Session session = factory.openSession();

		//

		session.beginTransaction();
		session.save(student);
		session.save(address);
		session.getTransaction().commit();

		// Transaction tx = session.beginTransaction();
		// session.save(student);

		// tx.commit();

		session.close();
		System.out.println("Done");

	}
}
