package com.revature.services;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.revature.entities.Doctor;
import com.revature.repositories.DoctorRepo;

@Service
public class DoctorServImpl implements DoctorServ {

	@Autowired
	private DoctorRepo dr;

	@Override
	public Doctor doctorLogin(Doctor doctor) {
		Doctor foundDoc = dr.getDoctorByEmail(doctor.getEmail());
		if (foundDoc != null && foundDoc.getPassword().equals(doctor.getPassword())) {
			System.out.println(foundDoc);
			
			return foundDoc;
		}
		return null;
	}

	@Override
	public Doctor loggedInDoctor(String email) {
		return dr.getDoctorByEmail(email);
	}
	
	
}
