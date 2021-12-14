package com.selenium.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.selenium.sm.api.Student;
import com.selenium.sm.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/showStudent")
	public String showStudentList(Model model) {

		// call the service to get the data

		List<Student> studentList = studentService.loadStudents();

		model.addAttribute("students", studentList);

		return "student-list";
	}

	@GetMapping("/showAddStudent")
	public String addStudent(Model model) {

		Student student = new Student();

		model.addAttribute("student", student);

		return "add-student";
	}

	@PostMapping("/save-student")
	public String saveStudent(Student student) {

		System.out.println(student);

		// do a condition check
		// if the user does not have the id do a insert
		if (student.getId() == 0) {
			// insert a new record
			studentService.saveStudent(student);
		}

		else {
			// do an update

			studentService.update(student);
		}

		return "redirect:/showStudent";
	}

	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId") int id, Model model) {

		// @ModelAttribute("student") Student student)

		// we should give the user object who clicked the update

		System.out.println("looking data for the student having id :" + id);

		Student thestudent = studentService.getStudent(id);

		System.out.println(thestudent);

		model.addAttribute("student", thestudent);

		/*
		 * //we are setting student information student.setId(thestudent.getId());
		 * student.setName(thestudent.getName());
		 * student.setMobile(thestudent.getMobile());
		 * student.setCountry(thestudent.getCountry());
		 */

		return "add-student";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userId") int id) {
		
		//capture id of the student whom are trying to delete 
		//once captured the id,do a service call to delete the student 
		
		studentService.deleteStudent(id);
		
		return "redirect:/showStudent";
	}

	@ResponseBody
	@GetMapping("/thankyou")
	public String thankYou() {
		return "Thank you .. Your recotd has added to the database";
	}
}
