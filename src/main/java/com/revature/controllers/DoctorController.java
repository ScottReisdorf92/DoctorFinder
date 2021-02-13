package com.revature.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.entities.Doctor;

public interface DoctorController {

	public Doctor doctorLogin(Doctor doctor, HttpServletResponse response);
	
	public Doctor loggedInDoctor(HttpServletRequest request);
	
	public boolean doctorLogout(HttpServletResponse response);
}
