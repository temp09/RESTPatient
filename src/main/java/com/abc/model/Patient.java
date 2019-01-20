package com.abc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int patientId;
	
	private String patientName;
	private String patientAddress;
	private int patientAge;
	private String patientContactNumber;
	private String patientEmail;
	
	public Patient() {	}
	public Patient(int patientId, String patientName, String patientAddress, int patientAge,
			String patientContactNumber, String patientEmail) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.patientAge = patientAge;
		this.patientContactNumber = patientContactNumber;
		this.patientEmail = patientEmail;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientContactNumber() {
		return patientContactNumber;
	}
	public void setPatientContactNumber(String patientContactNumber) {
		this.patientContactNumber = patientContactNumber;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
}
