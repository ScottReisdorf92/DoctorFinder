package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class Speciality {
	
	// Fields
	
	@Id
	@Column(updatable = false, name ="")
	private int specialityId;
	@Column(name = "")
	private String speciality;


	
	//-------------------------------------------------------
	//Constructors
	
	public Speciality() {
		super();
	}



	public Speciality(int specialityId, String speciality) {
		super();
		this.specialityId = specialityId;
		this.speciality = speciality;
	}



	public Speciality(String speciality) {
		super();
		this.speciality = speciality;
	}
	
	
	//------------------------------------------------------
	//Getters And Setters



	public int getspecialityId() {
		return specialityId;
	}



	public void setspecialityId(int specialityId) {
		this.specialityId = specialityId;
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
		return "Speciality [specialityId=" + specialityId + ", speciality=" + speciality + "]";
	}
	
	
	
	
}
