package com.selenium.sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.selenium.sm.api.Student;
import com.selenium.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudents() {
	
		
		
		
		String sql = "select * from students";
		
		List<Student> theListOfStudent = jdbcTemplate.query(sql,new  StudentRowMapper());
		
		
		
		return theListOfStudent;
	}

	@Override
	public void saveStudent(Student student) {
		
		Object[] sqlParameters={student.getName(),student.getMobile(),student.getCountry()};
		
		String sql = "insert into students(name,mobile,country) values(?,?,?)";
		
		
		jdbcTemplate.update(sql,sqlParameters);
		
		System.out.println("one record updated");
	}

	@Override
	public Student getStudent(int id) {

		String sql = "select * from students where ID=?";
		
		
        Student student = jdbcTemplate.queryForObject(sql,new StudentRowMapper(),id);
		
		
		
		return student;
	}

	@Override
	public void update(Student student) {


		String sql = "update students set name=?,mobile=?,country=? where id=?";
		
		
		jdbcTemplate.update(sql, student.getName(),student.getMobile(),student.getCountry(),student.getId());
		
		System.out.println("one record updated...");
		
	}

	@Override
	public void deleteStudent(int id) {

		String sql = "delete from students where id=?";

		jdbcTemplate.update(sql, id);
		
		//String sql1 = " select Distinct (salary) from employee ordered by salary DESC LIMIT 0,1";
		
	}

}












