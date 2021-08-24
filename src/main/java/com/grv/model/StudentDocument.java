package com.grv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students_document")
public class StudentDocument {

	@Id
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="student_photo")
	private byte[] studentPhoto;
	
	@Column(name="student_sign")
	private byte[] studentSign;
	
	@Column(name="student_idcard")
	private byte[] studentIdCard;
	
	@Column(name="income_certificate")
	private byte[] incomeCertificate;
	
	@Column(name="aadhar_card")
	private byte[] aadharCard;
	
	@Column(name="bank_passbook")
	private byte[] bankPassBook;
	
	@Column(name="sslc_marksheet")
	private byte[] sslcMarkSheet;
	
	@Column(name="hsc_marksheet")
	private byte[] hscMarkSheet;
	
	@Column(name="ntse_marksheet")
	private byte[] ntseMarkSheet;
	
	@Column(name="fees_receipt")
	private byte[] FeesRecipet;

	public byte[] getStudentPhoto() {
		return studentPhoto;
	}

	public void setStudentPhoto(byte[] studentPhoto) {
		this.studentPhoto = studentPhoto;
	}

	public byte[] getStudentSign() {
		return studentSign;
	}

	public void setStudentSign(byte[] studentSign) {
		this.studentSign = studentSign;
	}

	public byte[] getStudentIdCard() {
		return studentIdCard;
	}

	public void setStudentIdCard(byte[] studentIdCard) {
		this.studentIdCard = studentIdCard;
	}

	public byte[] getIncomeCertificate() {
		return incomeCertificate;
	}

	public void setIncomeCertificate(byte[] incomeCertificate) {
		this.incomeCertificate = incomeCertificate;
	}

	public byte[] getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(byte[] aadharCard) {
		this.aadharCard = aadharCard;
	}

	public byte[] getBankPassBook() {
		return bankPassBook;
	}

	public void setBankPassBook(byte[] bankPassBook) {
		this.bankPassBook = bankPassBook;
	}

	public byte[] getSslcMarkSheet() {
		return sslcMarkSheet;
	}

	public void setSslcMarkSheet(byte[] sslcMarkSheet) {
		this.sslcMarkSheet = sslcMarkSheet;
	}

	public byte[] getHscMarkSheet() {
		return hscMarkSheet;
	}

	public void setHscMarkSheet(byte[] hscMarkSheet) {
		this.hscMarkSheet = hscMarkSheet;
	}

	public byte[] getNtseMarkSheet() {
		return ntseMarkSheet;
	}

	public void setNtseMarkSheet(byte[] ntseMarkSheet) {
		this.ntseMarkSheet = ntseMarkSheet;
	}

	public byte[] getFeesRecipet() {
		return FeesRecipet;
	}

	public void setFeesRecipet(byte[] feesRecipet) {
		FeesRecipet = feesRecipet;
	}
	
    
}
