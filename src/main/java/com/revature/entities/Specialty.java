package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="specialty")
public class Specialty {
	
	// Fields
	
	@Id

	@Column(updatable = false, name ="specialty_id")
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



	public int getspecialityId() {
		return specialtyId;
	}



	public void setspecialityId(int specialityId) {
		this.specialtyId = specialityId;
	}



	public String getSpeciality() {
		return specialty;
	}



	public void setSpeciality(String speciality) {
		this.specialty = speciality;
	}
	
	//-----------------------------------------
	//ToString Method



	@Override
	public String toString() {
		return "Specialty [specialtyId=" + specialtyId + ", specialty=" + specialty + "]";
	}
	
	
	
	
}
