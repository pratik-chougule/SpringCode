package com.springJDBC.SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.SpringJDBC.Dao.StudentDao;
import com.springJDBC.SpringJDBC.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("My program started....");
        
        // spring jdbc= jdbcTemplate
        
        // use below if we use xml configuratin
        //ApplicationContext context = new ClassPathXmlApplicationContext("com/springJDBC/SpringJDBC/config.xml");
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfig.class);
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        /*
       // JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        // insert query
        String query ="insert into student(id, name,city) values(?,?,?)";
        // fire the query
        
        int result= template.update(query,212,"Manish Mishara","Kolhapur");
        
        System.out.println("number of record inserted..." +result);
        */
        
        //Insert opertion
        
        Student student = new Student();
        
        student.setId(322);
        student.setName("Rajesh Mishar");
        student.setCity("Kalyan");
        
        int result = studentDao.insert(student);
        
        System.out.println("student added  "+ result);
        
        
        
        // update operation
        /*
        Student student = new Student();
        student.setId(212);
        student.setName("Avadhut Patil");
        student.setCity("Kanpur");
        
        int result = studentDao.change(student);
        
        System.out.println("data changed "+result);
        
        */
        /*
        //deleting operation
       int result = studentDao.delete(212);
       
       System.out.println("deleted "+result);
       */
      //  Student student=studentDao.getStudent(301);
        
       //System.out.println(student);
        
        List<Student> Students = studentDao.getAllStudents();
        
        for(Student s: Students)
        {
        	System.out.println(s);
        }
        
        
        
    }
}
