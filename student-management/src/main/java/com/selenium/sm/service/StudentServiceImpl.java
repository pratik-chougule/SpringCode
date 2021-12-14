package com.selenium.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selenium.sm.DAO.StudentDAO;
import com.selenium.sm.api.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO studentDAO;
	
	
	@Override
	public List<Student>loadStudents() {
		
		List<Student> studentList = studentDAO.loadStudents();
		
		return  studentList;
	}


	@Override
	public void saveStudent(Student student) {
		
		
		studentDAO.saveStudent(student);
		
	}


	@Override
	public Student getStudent(int id) {
		
		
		
		
		
		return studentDAO.getStudent(id);
	}


	@Override
	public void update(Student student) {
		studentDAO.update(student);
		
	}


	@Override
	public void deleteStudent(int id) {
		
		
		studentDAO.deleteStudent(id);
		
	}

}
