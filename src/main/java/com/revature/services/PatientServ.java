package com.revature.services;

import com.revature.entities.Patient;

public interface PatientServ {
	
	Patient patientLogin(Patient patient);
	
	public Patient loggedInPatient(String email);

	boolean addPatient(Patient p);
	
}
