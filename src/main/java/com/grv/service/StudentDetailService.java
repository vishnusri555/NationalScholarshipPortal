package com.grv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grv.dao.StudentDetailDAO;
import com.grv.model.EducationDetails;


@Service
public class StudentDetailService {


	@Autowired
	private StudentDetailDAO studentDetailsDAO;
	
	public List<EducationDetails> getAllStudentsEducationDetails() {
		return studentDetailsDAO.getAllStudentsEducationDetails();
	}

	public void addEEducationDetailsOfStudent(EducationDetails educationDetail) {
		
		studentDetailsDAO.addEEducationDetailsOfStudent(educationDetail);
	}

	public void updateEducationDetailsOfStudent(EducationDetails educationDetail) {
		studentDetailsDAO.updateEducationDetailsOfStudent(educationDetail);
	}

	public void deletestudentById(int studentId) {
		studentDetailsDAO.deletestudentById(studentId);
		
	}

	public EducationDetails getEducationDetailsById(int id) {
		return studentDetailsDAO.getEducationDetailsById(id);
	}
}
