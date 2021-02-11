package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;

import com.revature.entities.Doctor;

public interface DoctorRepo extends CrudRepository<Doctor, Integer>{
	
	public Doctor getDoctorById(int doctor_id);
	
	public Doctor getDoctorByEmail(String email);
	
	public Doctor getDoctorByName(String first_name, String last_name);
	
	public Doctor getDoctorBySpecialty(int specialty_id);
	
}
