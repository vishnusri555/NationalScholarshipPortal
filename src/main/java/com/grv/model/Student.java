package com.grv.model;

import javax.persistence.*;

@Entity
public class Student {

	@Id
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private int age;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="institution_code")
	private String institutionCode;
	
	@Column(name="password")
	private String password;
	
	@Column(name="scheme_id")
	private int schemeId;
	
	public Student() {
		super();
	}
	public Student(int studentId, String studentName, String gender, int age, String emailId, String institutionCode,
			String password, int schemeId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.gender = gender;
		this.age = age;
		this.emailId = emailId;
		this.institutionCode = institutionCode;
		this.password = password;
		this.schemeId = schemeId;
	}
	
	

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getInstitutionCode() {
		return institutionCode;
	}
	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}
	
}
