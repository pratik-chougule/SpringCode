package com.springJDBC.SpringJDBC.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springJDBC.SpringJDBC.entities.Student;

@Component("studentDao")

public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public int insert(Student student) {

		// insert query
		String query = "insert into student(id,name,city) values(?,?,?)";

		int result = this.JdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}

	@Override
	public int change(Student student) {
		// updating data

		String query = "update student set name=?, city=? where id=?";

		int result = this.JdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());

		return result;

	}

	@Override
	public int delete(int studentId) {
		// delete opertaion

		String query = "delete from student where id=?";

		int result = this.JdbcTemplate.update(query, studentId);
		return result;
	}

	@Override
	public Student getStudent(int studentId) {

		// selecting single student data

		String query = "select * from student where id=?";

		RowMapper<Student> rowMapper = new RowMapperImpl();

		Student student = this.JdbcTemplate.queryForObject(query, rowMapper, studentId);

		return student;

	}

	@Override
	public List<Student> getAllStudents() {
		// selecting muliple student
		String query ="select * from student";
		List<Student> students = this.JdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

	// by using annonymous class
	/*
	 * Student student=this.JdbcTemplate.queryForObject(query, new RowMapper() {
	 * 
	 * @Override public Object mapRow(ResultSet rs, int rowNum) throws SQLException
	 * {
	 * 
	 * Student student= new Student(); student.setId(rs.getInt(1));
	 * student.setName(rs.getString(2)); student.setCity(rs.getString(3)); return
	 * student;
	 * 
	 * }
	 * 
	 * },studentId);
	 */

	public JdbcTemplate getJdbcTemplate() {
		return JdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		JdbcTemplate = jdbcTemplate;
	}

}
