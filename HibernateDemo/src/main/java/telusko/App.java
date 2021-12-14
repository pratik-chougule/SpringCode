package telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        
        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLname("Dell");
       
        Student student = new Student();
        student.setRollno(1);
        student.setName("Pratik");
        student.setMarks(50);
        student.setLaptop(laptop);
        
        
        
        
        
        
        Session session = factory.openSession();
        Transaction tx= session.beginTransaction();
        
        session.save(laptop);
        session.save(student);
        
        tx.commit();
        
        session.close();
        factory.close();
        

	}

}
