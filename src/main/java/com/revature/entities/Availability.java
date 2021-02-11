package com.revature.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "availability")
public class Availability {
	
	// INSTANCE VARIABLES //
	@Id
	@Column(updatable = false, name = "availabilty_id")
	@SequenceGenerator(sequenceName = "USER_ID_SEQ", name = "USER_ID_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "USER_ID_SEQ", strategy = GenerationType.SEQUENCE)
	private int availId; // Primary Key
	
	@Column(name = "date")
	private LocalDate date;
	@Column(name = "time")
	private LocalTime time;
	
	
	//foreign keys
	@OneToOne
	@JoinColumn(name = "specialty_id")
	private Specialty specialtyId;
	
	@ManyToMany
	@JoinColumn(name = "insurance_id")
	private int insuranceId;
	
	@OneToOne
	@JoinColumn(name = "doctor_id")
	private int doctorId;
	
}
