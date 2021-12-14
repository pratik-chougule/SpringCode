package com.springcore.jdbc;


import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.dao.SportmansDao;
import com.springcore.jdbc.entities.Sportmans;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	System.out.println("My program started...");
    	
    	//ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/jdbc/config.xml");
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(Jdbcconfig.class);
    	
    	SportmansDao sportmansDao = context.getBean("sportmansDao",SportmansDao.class);
    	
		/*
		 * Sportmans sportmans = new Sportmans(); sportmans.setId(124);
		 * sportmans.setName("Nikita Kurade"); sportmans.setCity("Mumbai");
		 * 
		 * 
		 * int insert = sportmansDao.insert(sportmans);
		 * 
		 * System.out.println("sportman added  "+insert);
		 */
    	
    	
		/*
		 * Sportmans sportmans = new Sportmans(); sportmans.setId(122);
		 * sportmans.setName("Mangesh Powar"); sportmans.setCity("Ratnagiri");
		 * 
		 * 
		 * int change = sportmansDao.change(sportmans);
		 * 
		 * System.out.println("data changed ..."+change);
		 */
    	
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int delete = sportmansDao.delete(124);
		 * 
		 * System.out.println("deleted...." +delete);
		 */
    	
		/*
		 * Sportmans sportman = sportmansDao.getSportmans(123);
		 * System.out.println(sportman);
		 */
    	
    	List<Sportmans> allSportmans = sportmansDao.getAllSportmans();
    	
    	for(Sportmans s: allSportmans) {
    		
    		System.out.println(s);
    	}
    }
}
