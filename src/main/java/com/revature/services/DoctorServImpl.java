package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Doctor;
import com.revature.repositories.DoctorRepo;

@Service
public class DoctorServImpl implements DoctorServ {

	@Autowired
	private DoctorRepo dr;

	@Override
	public Doctor signUp(Doctor doctor) {
		return dr.save(doctor);
	}
	
}
