package com.grv.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grv.model.Student;
import com.grv.service.CrudService;



@RestController
@RequestMapping("/NSPRest/api")
public class CrudController {

	@Autowired
	private CrudService crudService;
	
	@GetMapping("/student")
	public List<Student> getAllStudents() {
		return crudService.getAllStudents();
	}
	
	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable("studentId") int studentId) {
		return crudService.getStudent(studentId);
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return crudService.addStudent(student);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return crudService.updateStudent(student);
	}
	
//	@DeleteMapping("/student")
//	public Student deleteStudent(@RequestBody Student student) {
//		return crudService.
//	}

	
}
