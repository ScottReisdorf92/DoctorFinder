package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="specialty")
public class Specialty {
	
	
	@Id
	@Column(updatable = false, name ="specialty_id")
	@SequenceGenerator(sequenceName = "SPECIALTY_ID_SEQ", name = "SPECIALTY_ID_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "SPECIALTY_ID_SEQ", strategy = GenerationType.SEQUENCE)
	private int specialtyId;
	@Column(name = "specialty_name")
	private String specialty;

	
	//-------------------------------------------------------
	//Constructors
	
	public Specialty() {
		super();
	}




	public Specialty(int specialtyId, String specialty) {
		super();
		this.specialtyId = specialtyId;
		this.specialty = specialty;
	}



	public Specialty(String speciality) {
		super();
		this.specialty = speciality;
	}
	
	
	//------------------------------------------------------
	//Getters And Setters



	public int getSpecialtyId() {
		return specialtyId;
	}



	public void setSpecialtyId(int specialtyId) {
		this.specialtyId = specialtyId;
	}



	public String getSpecialty() {
		return specialty;
	}



	public void setSpecialty(String speciality) {
		this.specialty = speciality;
	}
	
	//-----------------------------------------
	//ToString Method



	@Override
	public String toString() {
		return "Specialty [specialtyId=" + specialtyId + ", specialty=" + specialty + "]";
	}
	
	
	
	
}
