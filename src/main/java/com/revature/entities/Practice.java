package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PRACTICE")
public class Practice {
	
	//---------------------------------------
	//Fields
	
	@Id
	@Column(updatable = false)
	@SequenceGenerator(sequenceName = "", name = "LOC_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "LOC_SEQ", strategy = GenerationType.SEQUENCE)
	private int practiceId;
	
	@Column(name = "")
	private String hours;
	@Column(name = "")
	private String streetAddress;
	@Column(name = "")
	private String city;
	@Column(name = "")
	private String state;
	@Column(name = "")
	private int zip;
	
	
	//--------------------------------------------------------------------------------
	//Constructors
	
	public Practice() {
		super();
	}


	public Practice(int practiceId, String hours, String streetAddress, String city, String state, int zip) {
		super();
		this.practiceId = practiceId;
		this.hours = hours;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}


	public Practice(String hours, String streetAddress, String city, String state, int zip) {
		super();
		this.hours = hours;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	//------------------------------------------------------------------
	//ToString Method


	@Override
	public String toString() {
		return "Practice [practiceId=" + practiceId + ", hours=" + hours + ", streetAddress=" + streetAddress
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
	
	

}
