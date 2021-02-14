package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.AppointmentServ;

@RestController
public class AppointmentControllerImpl implements AppointmentController {

	@Autowired
	private AppointmentServ apptServ;
	// Request mapping routes
}
