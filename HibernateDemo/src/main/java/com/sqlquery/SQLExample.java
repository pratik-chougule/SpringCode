package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.objectstates.Person;

public class SQLExample {

	public static void main(String[] args) {
		
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		
		Session session =factory.openSession();
		
		
		//SQL query 
		String q = "select * from person";
  
		NativeQuery nq = session.createSQLQuery(q);
		
		List<Object[]> list =nq.list();
		
		
		for(Object[] p : list) {
			
			System.out.println(p[1]+ " : "+p[2]);
		}
	}

}
