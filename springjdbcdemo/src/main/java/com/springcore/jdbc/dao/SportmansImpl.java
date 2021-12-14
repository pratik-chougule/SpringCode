package com.springcore.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springcore.jdbc.entities.Sportmans;

@Component("sportmansDao")
public class SportmansImpl  implements SportmansDao{

	@Autowired
	private JdbcTemplate JdbcTemplate;
	
	
	
	@Override
	public int insert(Sportmans sportmans) {
		
		
		String query=" insert into sportmans(id,name,city) values(?,?,?)";
		int result = this.JdbcTemplate.update(query,sportmans.getId(),sportmans.getName(),sportmans.getCity());
		
		return result;
	}
	
	//updating data
	@Override
	public int change(Sportmans sportmans) {
		
		String query = "update sportmans set name=?, city=? where id=? ";
		
		int update = this.JdbcTemplate.update(query,sportmans.getName(),sportmans.getCity(),sportmans.getId());
		
		return update;
	}
	@Override
	public int delete(int id) {

String query= "delete from sportmans where id=?";
		
		int delete = this.JdbcTemplate.update(query,id);
		
		
		return delete;
	}
	@Override
	public Sportmans getSportmans(int id) {
		
		// selecting single sportman data
		String query = "select * from sportmans where id=?";
		
		Sportmans sportmans = this.JdbcTemplate.queryForObject(query, new RowMapper<Sportmans>() {

			@Override
			public Sportmans mapRow(ResultSet rs, int rowNum) throws SQLException {
				Sportmans sportmans = new Sportmans();
				
				sportmans.setId(rs.getInt(1));
				sportmans.setName(rs.getString(2));
				sportmans.setCity(rs.getString(3));
				return sportmans;
			}
		} , id);
		
		return sportmans;
	}
	
	@Override
	public List<Sportmans> getAllSportmans() {
		String query = "select * from sportmans";
		
		
		List<Sportmans> sportmans = this.JdbcTemplate.query(query, new RowMapperImpl());
		return sportmans;
	}

	public JdbcTemplate getJdbcTemplate() {
		return JdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		JdbcTemplate = jdbcTemplate;
	}

	
	
	

}
