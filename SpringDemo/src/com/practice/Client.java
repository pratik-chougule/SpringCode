package com.practice;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Client {

	public static void main(String[] args)  {
		
		//Object Construction Traditional way
		
		Employee e = new Employee();
		e.setEid(101);
		e.setEname("Pratik ");
		e.setEaddress("Kolhapur");
		
		
		System.out.println("Employee details :  " +e);
		
   
		// Spring way 1 IOC(inversion of control)
		
		
		Resource resource = new ClassPathResource("employeebean.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		
		
		Employee e1 = (Employee)factory.getBean("emp1");
		Employee e2 = factory.getBean("emp2",Employee.class);
		
		
		System.out.println("Employee1 details : "+e1);
		
		System.out.println("Employee2 details : "+e2);
		
	}

}
