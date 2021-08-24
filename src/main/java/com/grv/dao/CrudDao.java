package com.grv.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grv.model.Schemes;
import com.grv.model.Student;
import com.grv.repository.SchemesRepo;
import com.grv.repository.StudentRepo;

@Component
public class CrudDao {

	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	SchemesRepo schemesRepo;
	
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}
	
	public Student getStudent(int studentId) {
		return studentRepo.getById(studentId);
	}
	
	public Student addStudent(Student student) {
		return studentRepo.save(student);	
	}
	
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public void deleteStudent(Student student) {
		studentRepo.delete(student);
	}
	
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
	
//	public Schemes deleteScheme(Scheme scheme) {
//		
//	}
}
