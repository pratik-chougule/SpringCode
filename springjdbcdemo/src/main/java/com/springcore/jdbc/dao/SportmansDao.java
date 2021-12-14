package com.springcore.jdbc.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springcore.jdbc.entities.Sportmans;


public interface SportmansDao {
	
	public int insert(Sportmans sportmans);
	
	public int change(Sportmans sportmans);
	public int delete(int id);
	public Sportmans getSportmans(int id);
	public List<Sportmans> getAllSportmans();
		
	
	

}
