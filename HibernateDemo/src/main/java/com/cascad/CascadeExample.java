package com.cascad;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Answer;
import com.hibernate.Question;

public class CascadeExample {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Question q1 = new Question();
		q1.setQuestionId(315);
		q1.setQuestion("What is cascading....");
		
		
		Answer a5 = new Answer(129,"In hibernate its an imp concept");
		Answer a6 = new Answer(270, "Second answer");
		Answer a7 = new Answer(45, "third answer");
		
		
		List<Answer> list = new ArrayList<>();
		list.add(a5);
		list.add(a5);
		list.add(a7);
		
		q1.setAnswers(list);
		
		Transaction tx = session.beginTransaction();
		session.save(q1);
		
	// if u use Cascading concept ,dont want to save answers seperatly one by one
		// it will happen automatically
		//session.save(a5);
		//session.save(a6);
		//session.save(a7);
		
		
		
		tx.commit();
		session.close();
		factory.close();
	}
}
