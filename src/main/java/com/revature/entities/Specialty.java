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
	private int specalityId;
	@Column(name = "specialty_name")
	private String speciality;


	
	//-------------------------------------------------------
	//Constructors
	
	public Specialty() {
		super();
	}



	public Specialty(int specalityId, String speciality) {
		super();
		this.specalityId = specalityId;
		this.speciality = speciality;
	}



	public Specialty(String speciality) {
		super();
		this.speciality = speciality;
	}
	
	
	//------------------------------------------------------
	//Getters And Setters



	public int getSpecalityId() {
		return specalityId;
	}



	public void setSpecalityId(int specalityId) {
		this.specalityId = specalityId;
	}



	public String getSpeciality() {
		return speciality;
	}



	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	//-----------------------------------------
	//ToString Method



	@Override
	public String toString() {
		return "Speciality [specalityId=" + specalityId + ", speciality=" + speciality + "]";
	}
	
	
	
	
}
