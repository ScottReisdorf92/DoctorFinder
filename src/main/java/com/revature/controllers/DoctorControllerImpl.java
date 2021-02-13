package com.revature.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	@PostMapping(value = "/doctorLogin", consumes = "application/json", produces = "application/json")
	public Doctor doctorLogin(@RequestBody Doctor doctor, HttpServletResponse response) {
		System.out.println(doctor);
		Doctor foundDoc = ds.doctorLogin(doctor);
		if (foundDoc != null) {
			Cookie cookie = new Cookie("doctorEmail", foundDoc.getEmail());
			cookie.setSecure(true);
			response.addCookie(cookie);
		}
		
		return foundDoc;
	}

	@Override
	@CrossOrigin
	@GetMapping(value = "/loggedInDoctor", produces = "application/json")
	public Doctor loggedInDoctor(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("doctorEmail")) {
					return ds.loggedInDoctor(c.getValue());
				}
			}
		}
		
		return null;
	}

	
	@Override
	@CrossOrigin
	@GetMapping(value = "/doctorLogout")
	public boolean doctorLogout(HttpServletResponse response) {
		Cookie cookie = new Cookie("doctorEmail", "");
		cookie.setMaxAge(0);
		return true;
	}
	
	
	
}
