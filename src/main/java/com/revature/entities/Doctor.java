package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class Doctor {
	
	//----------------------------------------
	//Fields

	// Primary Key Column
	@Id
	@Column(updatable = false, name = "")
	@SequenceGenerator(sequenceName = "", name = "DOC_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "DOC_SEQ", strategy = GenerationType.SEQUENCE)
	private int docId;

	// Unique key Column
	@Column(unique = true)
	private String email;

	// Normal Columns
	@Column(name = "")
	private String firstName;
	@Column(name = "")
	private String lastName;
	@Column(name = "")
	private String password;
	@Column(name = "")
	private int yearsInPractice;
	@Column(name = "")
	private String description;
	@Column(name = "")
	private int yearGraduated;

	// Foreign Key Columns
	@OneToOne
	@JoinColumn(name = "")
	private Speciality specalityId;

	@OneToOne
	@JoinColumn(name = "")
	private Practice practiceId;

	@OneToOne
	@JoinColumn(name = "")
	private Insurance insuranceId;

//------------------------------------------------------------------
	// Constructors

	public Doctor() {
		super();
	}
	
	
	public Doctor(int docId, String email, String firstName, String lastName, String password, int yearsInPractice,
			String description, int yearGraduated, Speciality specalityId, Practice practiceId, Insurance insuranceId) {
		super();
		this.docId = docId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.yearsInPractice = yearsInPractice;
		this.description = description;
		this.yearGraduated = yearGraduated;
		this.specalityId = specalityId;
		this.practiceId = practiceId;
		this.insuranceId = insuranceId;
	}


	public Doctor(String email, String firstName, String lastName, String password, int yearsInPractice,
			String description, int yearGraduated, Speciality specalityId, Practice practiceId, Insurance insuranceId) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.yearsInPractice = yearsInPractice;
		this.description = description;
		this.yearGraduated = yearGraduated;
		this.specalityId = specalityId;
		this.practiceId = practiceId;
		this.insuranceId = insuranceId;
	}


	

//--------------------------------------------------------------------------------
	// Getters And Setters
	
	public int getDocId() {
		return docId;
	}


	public void setDocId(int docId) {
		this.docId = docId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getYearsInPractice() {
		return yearsInPractice;
	}


	public void setYearsInPractice(int yearsInPractice) {
		this.yearsInPractice = yearsInPractice;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getYearGraduated() {
		return yearGraduated;
	}


	public void setYearGraduated(int yearGraduated) {
		this.yearGraduated = yearGraduated;
	}


	public Speciality getSpecalityId() {
		return specalityId;
	}


	public void setSpecalityId(Speciality specalityId) {
		this.specalityId = specalityId;
	}


	public Practice getPracticeId() {
		return practiceId;
	}


	public void setPracticeId(Practice practiceId) {
		this.practiceId = practiceId;
	}


	public Insurance getInsuranceId() {
		return insuranceId;
	}


	public void setInsuranceId(Insurance insuranceId) {
		this.insuranceId = insuranceId;
	}



	
//---------------------------------------------------------------------
	//ToString Method
	
	
	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", yearsInPractice=" + yearsInPractice + ", description=" + description
				+ ", yearGraduated=" + yearGraduated + ", specalityId=" + specalityId + ", practiceId=" + practiceId
				+ ", insuranceId=" + insuranceId + "]";
	}
	
	
	

}
