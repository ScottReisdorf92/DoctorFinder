package com.revature.services;

import com.revature.entities.Doctor;

public interface DoctorServ {
	
	public Doctor signUp(Doctor doctor);

	public Doctor doctorLogin(Doctor doctor);

	public Doctor loggedInDoctor(String email);

}
