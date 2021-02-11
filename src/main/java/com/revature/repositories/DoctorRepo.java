package com.revature.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.revature.entities.Doctor;

public interface DoctorRepo extends CrudRepository<Doctor, Integer>{
		
	public Doctor getDoctorByEmail(String email);
	
	public List<Doctor> getDoctorByName(String first_name, String last_name);
	
	public List<Doctor> getDoctorBySpecialty(int specialty_id);
	
}
