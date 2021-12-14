package com.spring.CoreSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/CoreSpring/conf.xml");
    	Student student1=(Student) context.getBean("student1");
    	Student student2=(Student) context.getBean("student2");
    	Student student3=(Student) context.getBean("student3");
    	
    	System.out.println(student1);
    	
     }
}
