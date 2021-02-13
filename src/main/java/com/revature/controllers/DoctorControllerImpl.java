package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Doctor;
import com.revature.services.DoctorServ;

@RestController
public class DoctorControllerImpl implements DoctorController {

	@Autowired
	private DoctorServ ds;

	@Override
	@CrossOrigin
	@PostMapping(value="/DoctorSignup", consumes="application/json", produces="application/json")
	public Doctor signUp(@RequestBody Doctor doctor) {
		System.out.println(doctor);
		
		return ds.signUp(doctor);
	}
	
	
	
	
}
