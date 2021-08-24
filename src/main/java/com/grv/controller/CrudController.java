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

import com.grv.model.Institution;
import com.grv.model.Schemes;
import com.grv.model.Student;
import com.grv.service.CrudService;



@RestController
@RequestMapping("/NSPRest/api")
public class CrudController {

	@Autowired
	private CrudService crudService;
	
	//student CRUD
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
	
	@DeleteMapping("/student")
	public boolean deleteStudent(@RequestBody Student student) {
		return crudService.deleteStudent(student);
	}

	//scheme CRUD
	@GetMapping("/schemes")
	public List<Schemes> getAllSchemes() {
		return crudService.getAllSchemes();
	}
	
	@GetMapping("/schemes/{schemeId}")
	public Schemes getScheme(@PathVariable("schemeId") int schemeId) {
		return crudService.getScheme(schemeId);
	}
	
	@PostMapping("/schemes")
	public boolean addSchemes(@RequestBody Schemes scheme) {
		return crudService.addScheme(scheme);
	}
	
	@PutMapping("/schemes")
	public boolean updateSchemes(@RequestBody Schemes scheme) {
		return crudService.updateScheme(scheme);
	}
	
	@DeleteMapping("/schemes")
	public boolean deleteScheme(@RequestBody Schemes scheme) {
		return crudService.deleteSchemes(scheme);
	}
	
	//Institution CRUD
	@GetMapping("/institution")
	public List<Institution> getAllInstitutions() {
		return crudService.getAllInstitutions();
	}
	
	@GetMapping("/institution/{institutionCode}") 
	public Institution getInstitution(@PathVariable("institutionCode") String institutionCode) {
		return crudService.getInstitution(institutionCode);
	}
	
	@PutMapping("/institution")
	public boolean addInstitution(@RequestBody Institution institution) {
		return crudService.addInstitution(institution);
	}
	
	@PostMapping("/institution")
	public boolean updateInstitution(@RequestBody Institution institution) {
		return crudService.updateInstitution(institution);
	}
		
	
	

}
