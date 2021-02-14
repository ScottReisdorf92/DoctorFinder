package com.revature.controllers;

import javax.servlet.http.HttpServletResponse;

import com.revature.entities.Doctor;

public interface DoctorController {

	public Doctor signUp(Doctor doctor);

	public Doctor doctorLogin(Doctor doctor, HttpServletResponse response);
	
	public Doctor loggedInDoctor(String id);
	
	public boolean doctorLogout(HttpServletResponse response);
}
