package com.grv.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grv.model.Institution;
import com.grv.model.Schemes;
import com.grv.model.Student;
import com.grv.repository.InstitutionRepo;
import com.grv.repository.SchemesRepo;
import com.grv.repository.StudentRepo;

@Component
public class CrudDao {

	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	SchemesRepo schemesRepo;
	
	@Autowired
	InstitutionRepo institutionRepo;
	
	//Student CRUD
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}
	
	public Student getStudent(int studentId) {
		return studentRepo.getById(studentId) != null?studentRepo.getById(studentId):null;	
	}
	
	public Student addStudent(Student student) {
		return studentRepo.save(student);	
	}
	
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public boolean deleteStudent(Student student) {
		int id = student.getStudentId();
		if(studentRepo.getById(id)!=null) {
			studentRepo.delete(student);
			return true;
		}
		else 
			return false;
		
	}
	
	//Schemes CRUD
	public List<Schemes> getAllSchemes() {
		return schemesRepo.findAll();
	}
	
	public Schemes getSchemes(int schemeId) {
		return schemesRepo.getById(schemeId);
	}
	
	public Schemes addScheme(Schemes scheme) {
		return schemesRepo.save(scheme);
	}
	
	public Schemes updateScheme(Schemes scheme) {
		return schemesRepo.save(scheme);
	}
	
	public boolean deleteScheme(Schemes scheme) {
		int id = scheme.getSchemeId();
		if(schemesRepo.getById(id)!=null ) {
			schemesRepo.delete(scheme);
			return true;
		}
		else return false;		
	}
	
	//Institution CRUD
	public List<Institution> getAllInstitutions() {
		return institutionRepo.findAll();
	}
	
	public Institution getInstitution(String institutionCode) {
		return institutionRepo.getById(institutionCode);
	}
	
	public boolean addInstitution(Institution institution) {
		return institutionRepo.save(institution) != null;
	}
	
	public boolean updateInstitution(Institution institution) {
		return institutionRepo.save(institution) != null;
	}
	
	public boolean deleteInstitution(Institution institution) {
		String id = institution.getInstitutionCode();
		if(institutionRepo.getById(id) != null) 
		{
			institutionRepo.delete(institution);
			return true;
		}
		else 
			return false;
	}
}
