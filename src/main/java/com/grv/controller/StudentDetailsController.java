package com.grv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grv.model.EducationDetails;
import com.grv.service.StudentDetailService;

@RestController
@RequestMapping("/NSPRest/api")
public class StudentDetailsController {

	@Autowired
	private StudentDetailService studentDetailService;
	
	@GetMapping("/getalleducationdetailsofallstudents")
	public List<EducationDetails> getAllStudentsEducationDetails(){
		return studentDetailService.getAllStudentsEducationDetails();
	}
	
	@PostMapping("/addeducationdetailsofthestudent")
	public void addEEducationDetailsOfStudent(@RequestBody EducationDetails educationDetail) {
		studentDetailService.addEEducationDetailsOfStudent(educationDetail);
	}
	
	@PutMapping("/updateEducationdetailsofstudent")
	public void updateEducationDetailsOfStudent(@RequestBody EducationDetails educationDetail) {
		studentDetailService.updateEducationDetailsOfStudent(educationDetail);
	}
	
	@DeleteMapping("/deleteeducationdetails")
	public void deletestudentById(@RequestBody EducationDetails educationDetail) {
		studentDetailService.deletestudentById(educationDetail.getStudentId());
	}
	
	@GetMapping("/geteducationdetailsbyid/{id}")
	public EducationDetails getEducationDetailsById(@PathVariable("id") int id) {
		System.out.println("path "+id);
		return studentDetailService.getEducationDetailsById(id);
	}
}
