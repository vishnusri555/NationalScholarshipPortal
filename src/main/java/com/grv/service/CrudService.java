package com.grv.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grv.dao.CrudDao;
import com.grv.model.Student;

@Service
public class CrudService {

	@Autowired
	CrudDao crudDao;
	
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
}
