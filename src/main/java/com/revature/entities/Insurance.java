package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "INSURANCES")
public class Insurance {
	
	//---------------------------------------------------
	//Fields
	
	@Id
	@Column(updatable = false, name="")
	@SequenceGenerator(sequenceName = "", name = "INSURANCE_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "INSURANCE_SEQ", strategy = GenerationType.SEQUENCE)
	private int insuranceId;
	@Column(name = "")
	private String insurance;
	
	//----------------------------------
	//Constructors
	public Insurance() {
		super();
	}

	public Insurance(int insuranceId, String insurance) {
		super();
		this.insuranceId = insuranceId;
		this.insurance = insurance;
	}

	public Insurance(String insurance) {
		super();
		this.insurance = insurance;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	
	//----------------------------------------------------------------
	//ToString Method

	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", insurance=" + insurance + "]";
	}
	
	
	
	

}
