package hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.objectstates.Person;
import com.onetomany.Student;

public class HQLExample {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		//HQl
		//syntax:
		
		String query = "from Person  where paddress='Kolhapur'";
		Query q = session.createQuery(query);
		
		//Single  - unique
		//multiple - list
		
		List<Person> list = q.list();
		
		for (Person  person : list) {
			
			System.out.println(person.getPname());
			
		}
		
		System.out.println("-----------------------------------");
		
		Transaction tx = session.beginTransaction();
		
		
		// delete query 
		/*
		Query q2 = session.createQuery("delete from Person s where s.paddress=:c");
		q2.setParameter("c", "Kolhapur");
		int r =q2.executeUpdate();
		
		System.out.println("Deleted : ");
		System.out.println(r);
		*/
		// update query
		/*
		Query q3 =session.createQuery("update Person set paddress=:c where pname=:n");
		q3.setParameter("c", "Mumbai");
		q3.setParameter("n", "Komal");
		int r1 =q3.executeUpdate();
		
		System.out.println("Updated  : ");
		System.out.println(r1);
		*/
		
		
		Query q4 = session.createQuery("select p.persoId, p.pname,b.bname from Person as p INNER JOIN p.bike as  b");
		List<Object[]> list1 =q4.getResultList();
		
		for(Object [] arr : list1) {
			System.out.println(Arrays.toString(arr));
		}
		
		tx.commit();
		session.close();
		factory.close();

	}

}
