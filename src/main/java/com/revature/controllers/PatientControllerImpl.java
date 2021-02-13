package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Patient;
import com.revature.services.PatientServImpl;

@RestController
public class PatientControllerImpl implements PatientController {

	@Autowired
	private PatientServImpl ps;

	@PostMapping(value = "/PatientSignup", consumes = "application/json", produces = "application/json")
	@CrossOrigin
	public boolean addPatient(@RequestBody Patient p) { // https post

		return (ps.addPatient(p));

	}
}
