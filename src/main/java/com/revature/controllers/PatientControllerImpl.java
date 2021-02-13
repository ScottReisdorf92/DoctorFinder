package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Patient;
import com.revature.services.PatientServ;

@RestController
public class PatientControllerImpl implements PatientController {

	@Autowired
	private PatientServ patServ;

	@Override
	@CrossOrigin
	@PostMapping(value = "/patientLogin", consumes = "application/json", produces = "application/json")
	public Patient patientLogin(@RequestBody Patient patient) {
		System.out.println(patient);
		return patServ.patientLogin(patient);
	}
}
