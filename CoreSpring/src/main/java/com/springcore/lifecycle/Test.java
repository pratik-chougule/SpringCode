package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle.xml");
  
		context.registerShutdownHook();
		
		/*
		//Demo d1=(Demo)context.getBean("d1");
		//System.out.println(d1);
		
		
		//registering shutdown hook
		
		
		
		System.out.println("---------------------------------");
		Demo1 p1=(Demo1)context.getBean("p1");
		System.out.println(p1);
		*/
		
		Example example= (Example)context.getBean("example");
		System.out.println(example);
	}


}
