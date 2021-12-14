package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating question
  
		Question q1 = new Question();
		q1.setQuestionId(108);
		q1.setQuestion("What is java");

		// creating answer
		Answer answer = new Answer();
		answer.setAnswerId(14);
		answer.setAnswer("java is programming language");
		answer.setQuestion(q1);
		
		
		Answer answer1 = new Answer();
		answer1.setAnswerId(45);
		answer1.setAnswer("java is programming language, with the help of java we can build softwares");
		answer1.setQuestion(q1);
		

		Answer answer2 = new Answer();
		answer2.setAnswerId(21);
		answer2.setAnswer("java is programming language , has different types of framework");
		answer2.setQuestion(q1);
		
	List<Answer> list = new ArrayList<Answer>();
	   list.add(answer);
	   list.add(answer1);
	   list.add(answer2);
	   q1.setAnswers(list);
	   
          
		
		 //creating 2 question
		  /*
		  Question q2 = new Question();
		  q2.setQuestionId(109);
		  q2.setQuestion("what is collection framework");
		  
		  // creating answer 
		  Answer answer1 = new Answer(); 
		  answer1.setAnswerId(9);
		  answer1.setAnswer("is API to work with group of objects");
		  answer1.setQuestion(q2);
		  q2.setAnswer(answer1);
		  */
		 

		// session
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		// save

		s.save(q1);
		//s.save(q2);
		
		s.save(answer);
		s.save(answer1);
		s.save(answer2);
		
		Question question =  s.get(Question.class, 108);
		System.out.println(q1.getQuestionId());
		System.out.println(q1.getQuestion());
		System.out.println(q1.getAnswers().size());
		
		

		tx.commit();
     
		s.close();
		factory.close();

	}
}
