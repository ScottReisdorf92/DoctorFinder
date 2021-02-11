package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.PatientServ;

@RestController
public class PatientControllerImpl implements PatientController {

	@Autowired
	private PatientServ patServ;
}
