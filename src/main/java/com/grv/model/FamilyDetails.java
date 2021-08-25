package com.grv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="family_details")
public class FamilyDetails{

	@Id
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="father_name")
	private String fatherName;
	
	@Column(name="mother_name")
	private String motherName;
	
	@Column(name="annual_income")
	private double annualIncome;
	
	@Column(name="religion")
	private String religion;
	
	@Column(name="aadhar_no")
	private String aadharNo;
	
	@Column(name="type_of_disability")
	private boolean typeOfDisability;
	
	@Column(name="marital_status")
	private String maritalStatus;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public boolean isTypeOfDisability() {
		return typeOfDisability;
	}

	public void setTypeOfDisability(boolean typeOfDisability) {
		this.typeOfDisability = typeOfDisability;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	
	
	
}
