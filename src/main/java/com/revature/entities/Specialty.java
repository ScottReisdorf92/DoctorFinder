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
<<<<<<< HEAD:src/main/java/com/revature/entities/Speciality.java
	@Column(updatable = false, name ="")
	private int specialityId;
	@Column(name = "")
=======
	@Column(updatable = false, name ="specialty_id")
	private int specalityId;
	@Column(name = "specialty_name")
>>>>>>> 629809b5a3d2309c5a8d0b967754cf965a5bc80f:src/main/java/com/revature/entities/Specialty.java
	private String speciality;


	
	//-------------------------------------------------------
	//Constructors
	
	public Specialty() {
		super();
	}



<<<<<<< HEAD:src/main/java/com/revature/entities/Speciality.java
	public Speciality(int specialityId, String speciality) {
=======
	public Specialty(int specalityId, String speciality) {
>>>>>>> 629809b5a3d2309c5a8d0b967754cf965a5bc80f:src/main/java/com/revature/entities/Specialty.java
		super();
		this.specialityId = specialityId;
		this.speciality = speciality;
	}



	public Specialty(String speciality) {
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
