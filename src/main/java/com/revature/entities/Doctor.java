package com.revature.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="doctors")
public class Doctor {
	
	//----------------------------------------
	//Fields

	// Primary Key Column
	@Id
	@Column(updatable = false, name = "doctor_id")
	@SequenceGenerator(sequenceName = "USER_ID_SEQ", name = "USER_ID_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "USER_ID_SEQ", strategy = GenerationType.SEQUENCE)
	private int docId;

	// Unique key Column
	@Column(unique = true, name = "email")
	private String email;

	// Normal Columns
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "password")
	private String password;
	@Column(name = "years_in_practice")
	private int yearsInPractice;
	@Column(name = "description")
	private String description;
	@Column(name = "med_school")
	private String medSchool;

	// Foreign Key Columns
	@OneToOne
	@JoinColumn(name = "specialty_id")

	private Specialty specialtyId;

	@OneToOne
	@JoinColumn(name = "practice_id")
	private Practice practiceId;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "doctors_insurance_accepted",
			joinColumns = @JoinColumn(name = "doc_id"),
			inverseJoinColumns = @JoinColumn(name = "insurance_id"))
	private List<Insurance> insAccepted;

//------------------------------------------------------------------
	// Constructors

	public Doctor() {
		super();
	}
	
	
	public Doctor(int docId, String email, String firstName, String lastName, String password, int yearsInPractice,
			String description, String medSchool, Specialty SpecialtyId, Practice practiceId) {
		super();
		this.docId = docId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.yearsInPractice = yearsInPractice;
		this.description = description;
		this.medSchool = medSchool;
		this.specialtyId = SpecialtyId;
		this.practiceId = practiceId;
	}


	public Doctor(String email, String firstName, String lastName, String password, int yearsInPractice,
			String description, String medSchool, Specialty SpecialtyId, Practice practiceId) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.yearsInPractice = yearsInPractice;
		this.description = description;
		this.medSchool = medSchool;
		this.specialtyId = SpecialtyId;
		this.practiceId = practiceId;
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


	public String getMedSchool() {
		return medSchool;
	}


	public void setMedSchool(String medSchool) {
		this.medSchool = medSchool;
	}


	public Specialty getSpecialtyId() {
		return specialtyId;
	}


	public void setSpecialtyId(Specialty specialtyId) {
		this.specialtyId = specialtyId;
	}


	public Practice getPracticeId() {
		return practiceId;
	}


	public void setPracticeId(Practice practiceId) {
		this.practiceId = practiceId;
	}

	
//---------------------------------------------------------------------
	//ToString Method
	
	
	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", yearsInPractice=" + yearsInPractice + ", description=" + description
				+ ", yearGraduated=" + medSchool + ", SpecialtyId=" + specialtyId + ", practiceId=" + practiceId
				+ ", insuranceId=" + "]";
	}
	
	
	

}
