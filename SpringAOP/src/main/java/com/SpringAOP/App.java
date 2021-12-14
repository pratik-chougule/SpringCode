package com.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringAOP.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringAOP/aop.xml");
        
        PaymentService paymentObject=context.getBean("payment", PaymentService.class);
        
        //\
        
        paymentObject.makePayment();
    }
}
