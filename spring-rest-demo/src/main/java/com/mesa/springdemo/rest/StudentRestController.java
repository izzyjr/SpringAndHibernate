package com.mesa.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mesa.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;
	
	// define @PostConstruct to load the student data...only once
	@PostConstruct
	public void loadData() {
		theStudents = new ArrayList<>();
		theStudents.add(new Student("Juan", "Valdez"));
		theStudents.add(new Student("Simon", "Bolivar"));
		theStudents.add(new Student("El Pibe", "Valderrama"));
	}
	
	// define an endpoint for "/students" - return a list of students
	@GetMapping("/students")
	public List<Student> getStudents() {
		return theStudents;
	}
	
	// define endpoint for "/student/{studentId}" - return student at index
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		// index into the list
		if(studentId >= theStudents.size() || studentId < 0) {
			throw new StudentNotFoundException("Student id not found - " + studentId);
		}
		
		// check student id against list size
		return theStudents.get(studentId);
	}
	
}
