package com.mesa.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mesa.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	// define an endpoint for "/students" - return a list of students
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		List<Student> theStudents = new ArrayList<>();
		
		theStudents.add(new Student("Juan", "Valdez"));
		theStudents.add(new Student("Simon", "Bolivar"));
		theStudents.add(new Student("Juan", "Valdez"));
		
		return theStudents;
	}
	
	
	

}
