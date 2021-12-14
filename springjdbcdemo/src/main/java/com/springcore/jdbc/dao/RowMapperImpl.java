package com.springcore.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springcore.jdbc.entities.Sportmans;

public class RowMapperImpl implements RowMapper<Sportmans> {

	@Override
	public Sportmans mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		 Sportmans sportmans = new Sportmans();
		 
		 sportmans.setId(rs.getInt(1)); sportmans.setName(rs.getString(2));
		 sportmans.setCity(rs.getString(3));
		
		  return sportmans;
		 
		
	}
	
	
	
	

}
