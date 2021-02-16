package com.revature.services;

import com.revature.entities.Patient;

public interface PatientServ {
	
	Patient patientLogin(Patient patient);
	
	public Patient loggedInPatient(int id);

	boolean addPatient(Patient p);
	
	public Patient getPatientById(int id);
	
}
