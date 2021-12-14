package com.springJDBC.SpringJDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springJDBC.SpringJDBC.Dao.StudentDao;
import com.springJDBC.SpringJDBC.Dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.springJDBC.SpringJDBC.Dao"})
public class JDBCConfig {
	
	@Bean("ds")
	 public DriverManagerDataSource getDataSource() 
	 {
		 
		 DriverManagerDataSource ds = new DriverManagerDataSource();
		 ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		 ds.setUsername("root");
		 ds.setPassword("root");
		 
		 return ds;
	 }
  
	@Bean("jdbcTemplate")
	public JdbcTemplate geTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	/*
	@Bean("studentDao")
	public StudentDao getStudentDao() {
		
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		studentDaoImpl.setJdbcTemplate(geTemplate());
		
		return studentDaoImpl;
		
	}
	*/
}
