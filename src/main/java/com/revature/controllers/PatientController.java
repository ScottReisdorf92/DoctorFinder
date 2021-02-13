package com.revature.controllers;

import org.springframework.web.bind.annotation.RequestBody;

import com.revature.entities.Patient;



public interface PatientController {
	
	public boolean addPatient(@RequestBody Patient p);

}
