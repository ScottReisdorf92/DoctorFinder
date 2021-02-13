package com.revature.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.entities.Patient;

public interface PatientController {
	
	public Patient patientLogin(Patient patient, HttpServletResponse response);
	
	public Patient loggedInPatient(HttpServletRequest request);

}
