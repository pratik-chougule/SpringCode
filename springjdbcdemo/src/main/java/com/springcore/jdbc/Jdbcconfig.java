package com.springcore.jdbc;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springcore.jdbc.dao.SportmansDao;
import com.springcore.jdbc.dao.SportmansImpl;
import com.springcore.jdbc.entities.Sportmans;
import com.sun.tools.javac.resources.compiler;

@Configuration
@ComponentScan(basePackages = "com.springcore.jdbc.dao")
public class Jdbcconfig {

	@Bean("ds")
	public DriverManagerDataSource getDataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}

	@Bean("Jdbctemplate")
	public JdbcTemplate getTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		jdbcTemplate.setDataSource(getDataSource());

		return jdbcTemplate;

	}

	/*
	 * @Bean("sportmansDao") public SportmansDao getSportmansDao() { SportmansImpl
	 * sportmansDao = new SportmansImpl();
	 * 
	 * 
	 * sportmansDao.setJdbcTemplate(getTemplate()); return sportmansDao; }
	 */
	 

}
