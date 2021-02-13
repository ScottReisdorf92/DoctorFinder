package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Patient;
import com.revature.repositories.PatientRepo;

@Service
public class PatientServImpl implements PatientServ {
	
	@Autowired
	PatientRepo pr;
	
	@Override
	public boolean addPatient(Patient p) {
		
		if (pr.getPatientByEmail(p.getEmail()) == null) {
			pr.save(p);
			return true;
		}
		
		return false;
		
	}
}
	
