package com.grv.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Embeddable
public class EducationDetails {
	


	@Column(name="sslc_rollno")
	private String sslcRollNo;
	
	@Column(name="hsc_rollno")
	private String hscRollNo;
	
	@Column(name="sslc_board_name")
	private String sslcBoardName;
	
	@Column(name="sslc_passing_year")
	private Date sslcPassingYear;
	
	@Column(name="hsc_passing_year")
	private Date hscPassingYear;
	
	@Column(name="sslc_percentage")
	private int sslcPercentage;
	
	@Column(name="hsc_percentage")
	private int hscPercentage;
	
	@Column(name="institute_name")
	private String instituteName;
	
	@Column(name="present_year")
	private Date presentYear;
	
	@Column(name="present_course")
	private String presentCourse;
	
	@Column(name="university_name")
	private String universityName;
	
	@Column(name="class_start_date")
	private Date classStartDate;
	
	@Column(name="passing_year")
	private Date passingYear;

	

	public String getSslcRollNo() {
		return sslcRollNo;
	}

	public void setSslcRollNo(String sslcRollNo) {
		this.sslcRollNo = sslcRollNo;
	}

	public String getHscRollNo() {
		return hscRollNo;
	}

	public void setHscRollNo(String hscRollNo) {
		this.hscRollNo = hscRollNo;
	}

	public String getSslcBoardName() {
		return sslcBoardName;
	}

	public void setSslcBoardName(String sslcBoardName) {
		this.sslcBoardName = sslcBoardName;
	}

	public Date getSslcPassingYear() {
		return sslcPassingYear;
	}

	public void setSslcPassingYear(Date sslcPassingYear) {
		this.sslcPassingYear = sslcPassingYear;
	}

	public Date getHscPassingYear() {
		return hscPassingYear;
	}

	public void setHscPassingYear(Date hscPassingYear) {
		this.hscPassingYear = hscPassingYear;
	}

	public int getSslcPercentage() {
		return sslcPercentage;
	}

	public void setSslcPercentage(int sslcPercentage) {
		this.sslcPercentage = sslcPercentage;
	}

	public int getHscPercentage() {
		return hscPercentage;
	}

	public void setHscPercentage(int hscPercentage) {
		this.hscPercentage = hscPercentage;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public Date getPresentYear() {
		return presentYear;
	}

	public void setPresentYear(Date presentYear) {
		this.presentYear = presentYear;
	}

	public String getPresentCourse() {
		return presentCourse;
	}

	public void setPresentCourse(String presentCourse) {
		this.presentCourse = presentCourse;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public Date getClassStartDate() {
		return classStartDate;
	}

	public void setClassStartDate(Date classStartDate) {
		this.classStartDate = classStartDate;
	}

	public Date getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(Date passingYear) {
		this.passingYear = passingYear;
	}
	
	
	
}
