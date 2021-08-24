package com.grv.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grv.model.EducationDetails;
import com.grv.repository.EducationDetailsRepo;
import com.grv.repository.FamilyDetailsRepo;
import com.grv.repository.StudentDocumentRepo;

@Component
public class StudentDetailDAO {

	@Autowired
	private EducationDetailsRepo educationDetailsRepo;
	
	@Autowired
	private FamilyDetailsRepo familyDetailsRepo;
	
	@Autowired
	private StudentDocumentRepo studentDocumentRepo;

	public List<EducationDetails> getAllStudentsEducationDetails() {
		return educationDetailsRepo.findAll();
	}

	public void addEEducationDetailsOfStudent(EducationDetails educationDetail) {
		educationDetailsRepo.save(educationDetail);
	}

	public void updateEducationDetailsOfStudent(EducationDetails educationDetail) {
		educationDetailsRepo.save(educationDetail);
	}

	public void deletestudentById(int studentId) {
		if(educationDetailsRepo.existsById(studentId)) {
			educationDetailsRepo.deleteById(studentId);
		}
	}

	public EducationDetails getEducationDetailsById(int id) {
		 EducationDetails byId = educationDetailsRepo.getById(id);
		 System.out.println(byId.getStudentId() +" asdasdasdd");
		 return byId;
	}
	
	
	
	
}
