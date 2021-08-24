package com.grv.model;

import javax.persistence.*;

@Entity
public class Institution {

	@Id
	@Column(name="istitution_code")
	private String institutionCode;
	
	@Column(name="institution_ame")
	private String institutionName;
	
	@Column(name="disc_code")
	private String discCode;
	
	@Column(name="university_state")
	private String universityState;
	
	@Column(name="university_name")
	private String universityName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="institution_certificate")
	private Byte[] institutionCertificate;
	
	@Column(name="university_board_affliation")
	private Byte[] universityBoardAffiliation;
	
	@Column(name="principal_name")
	private String principalName;
	
	@Column(name="principal_phone_no")
	private String principalPhoneNo;
	
	@Column(name="address")
	private String address;

	public String getInstitutionCode() {
		return institutionCode;
	}

	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getDiscCode() {
		return discCode;
	}

	public void setDiscCode(String discCode) {
		this.discCode = discCode;
	}

	public String getUniversityState() {
		return universityState;
	}

	public void setUniversityState(String universityState) {
		this.universityState = universityState;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Byte[] getInstitutionCertificate() {
		return institutionCertificate;
	}

	public void setInstitutionCertificate(Byte[] institutionCertificate) {
		this.institutionCertificate = institutionCertificate;
	}

	public Byte[] getUniversityBoardAffiliation() {
		return universityBoardAffiliation;
	}

	public void setUniversityBoardAffiliation(Byte[] universityBoardAffiliation) {
		this.universityBoardAffiliation = universityBoardAffiliation;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getPrincipalPhoneNo() {
		return principalPhoneNo;
	}

	public void setPrincipalPhoneNo(String principalPhoneNo) {
		this.principalPhoneNo = principalPhoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
