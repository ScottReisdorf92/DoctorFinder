package com.revature.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Integer>{
	
	public Patient getPatientByEmail(String email);
	
	public List<Patient> getPatientByName(String firstName, String LastName);
}
