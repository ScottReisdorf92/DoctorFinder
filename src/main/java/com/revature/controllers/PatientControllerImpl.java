package com.revature.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Patient patientLogin(@RequestBody Patient patient, HttpServletResponse response) {
		System.out.println(patient);
		Patient foundPatient = patServ.patientLogin(patient);
		if(foundPatient != null) {
			Cookie cookie = new Cookie("patientEmail", foundPatient.getEmail());
			cookie.setSecure(true);
			response.addCookie(cookie);
		}
		return foundPatient;
	}

	@Override
	@CrossOrigin
	@GetMapping(value = "/loggedInPatient", produces = "application/json")
	public Patient loggedInPatient(@RequestParam(required = true) String id) {
		System.out.println(id);
		int inputId;
		try {
			inputId = Integer.parseInt(id);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
		System.out.println(inputId);
		return patServ.loggedInPatient(inputId);
	        
	}
	

	@PostMapping(value = "/PatientSignup", consumes = "application/json", produces = "application/json")
	@CrossOrigin
	public boolean addPatient(@RequestBody Patient p) { // https post

		return (patServ.addPatient(p));

	}
}
