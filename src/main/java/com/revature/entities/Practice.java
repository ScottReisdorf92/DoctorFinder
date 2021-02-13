package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="practices")
public class Practice {
	
	//---------------------------------------
	//Fields
	
	@Id
	@Column(updatable = false, name="practice_id")
	@SequenceGenerator(sequenceName = "PRACTICE_ID_SEQ", name = "PRACTICE_ID_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "PRACTICE_ID_SEQ", strategy = GenerationType.SEQUENCE)
	private int practiceId;
	
	@Column(name = "open_time")
	private String openTime;
	@Column(name = "closing_time")
	private String closingTime;
	@Column(name = "street_address")
	private String streetAddress;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zip")
	private int zip;
	
	
	//--------------------------------------------------------------------------------
	//Constructors
	
	public Practice() {
		super();
	}


	
	
	public Practice(int practiceId, String openTime, String closingTime, String streetAddress, String city,
			String state, int zip) {
		super();
		this.practiceId = practiceId;
		this.openTime = openTime;
		this.closingTime = closingTime;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}




	//------------------------------------------------------------------
	//ToString Method


	public int getPracticeId() {
		return practiceId;
	}




	public void setPracticeId(int practiceId) {
		this.practiceId = practiceId;
	}




	public String getOpenTime() {
		return openTime;
	}




	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}




	public String getClosingTime() {
		return closingTime;
	}




	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}




	public String getStreetAddress() {
		return streetAddress;
	}




	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public String getState() {
		return state;
	}




	public void setState(String state) {
		this.state = state;
	}




	public int getZip() {
		return zip;
	}




	public void setZip(int zip) {
		this.zip = zip;
	}




	@Override
	public String toString() {
		return "Practice [practiceId=" + practiceId + ", openTime=" + openTime + ", closingTime=" + closingTime
				+ ", streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
	
	

}
