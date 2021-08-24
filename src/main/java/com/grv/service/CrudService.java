package com.grv.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grv.dao.CrudDao;
import com.grv.model.Institution;
import com.grv.model.Schemes;
import com.grv.model.Student;

@Service
public class CrudService {

	@Autowired
	CrudDao crudDao;
	
	//student CRUD
	public List<Student> getAllStudents() {
		return crudDao.getAllStudents();
	}
	
	public Student getStudent(int studentId) {
		return crudDao.getStudent(studentId);
	}
	
	public Student addStudent(Student student) {
		return crudDao.addStudent(student);		
	}
	
	public Student updateStudent(Student student) {
		return crudDao.updateStudent(student);
	}
	
	public boolean deleteStudent(Student student) {
		return crudDao.deleteStudent(student);
	}
	
	//Scheme CRUD
	public List<Schemes> getAllSchemes() {
		return crudDao.getAllSchemes();
	}
	
	public Schemes getScheme(int schemeId) {
		return crudDao.getSchemes(schemeId);
	}
	
	public boolean addScheme(Schemes scheme) {
		return crudDao.addScheme(scheme) != null;
	}
	
	public boolean updateScheme(Schemes scheme) {
		return crudDao.updateScheme(scheme) != null;
	}
	
	public boolean deleteSchemes(Schemes scheme) {
		return crudDao.deleteScheme(scheme);
	}
	
	//Institution CRUD
	public List<Institution> getAllInstitutions() {
		return crudDao.getAllInstitutions();
	}
	
	public Institution getInstitution(String institutionCode) {
		return crudDao.getInstitution(institutionCode);
	}
	
	public boolean addInstitution(Institution institution) {
		return crudDao.addInstitution(institution);
	}
	
	public boolean updateInstitution(Institution institution) {
		return crudDao.updateInstitution(institution);
	}
	
	public boolean deleteInstitution(Institution institution) {
		return crudDao.deleteInstitution(institution);
	}
}
