package com.revature.services;

import javax.servlet.http.HttpServletResponse;

import com.revature.entities.Doctor;

public interface DoctorServ {

	Doctor doctorLogin(Doctor doctor);

	Doctor loggedInDoctor(String email);

}
