package com.grv.model;

import javax.persistence.*;

@Entity
public class Schemes {
	@Id
	@Column(name="scheme_id")
	private int schemeId;
	
	@Column(name="scheme_name")
	private String schemeName;
	
	@Column(name="scheme_description")
	private String schemeDescription;
	
	@Column(name="applicant_age")
	private int applicantAge;
	
	@Column(name = "applicant_sslc")
	private int applicantSslc;
	
	@Column(name = "applicant_hsc")
	private int applicantHsc;
	
	@Column(name = "applicant_ntse")
	private int applicantNtse;
	
	@Column(name = "community_allowed")
	private String communityAllowed;

	public int getSchemeId() {
		return schemeId;
	}

	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getSchemeDescription() {
		return schemeDescription;
	}

	public void setSchemeDescription(String schemeDescription) {
		this.schemeDescription = schemeDescription;
	}

	public int getApplicantAge() {
		return applicantAge;
	}

	public void setApplicantAge(int applicantAge) {
		this.applicantAge = applicantAge;
	}

	public int getApplicantSslc() {
		return applicantSslc;
	}

	public void setApplicantSslc(int applicantSslc) {
		this.applicantSslc = applicantSslc;
	}

	public int getApplicantHsc() {
		return applicantHsc;
	}

	public void setApplicantHsc(int applicantHsc) {
		this.applicantHsc = applicantHsc;
	}

	public int getApplicantNtse() {
		return applicantNtse;
	}

	public void setApplicantNtse(int applicantNtse) {
		this.applicantNtse = applicantNtse;
	}

	public String getCommunityAllowed() {
		return communityAllowed;
	}

	public void setCommunityAllowed(String communityAllowed) {
		this.communityAllowed = communityAllowed;
	}
	
	
}
