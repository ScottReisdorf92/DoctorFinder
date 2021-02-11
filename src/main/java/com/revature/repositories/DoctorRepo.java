package com.revature.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.revature.entities.Doctor;

public interface DoctorRepo extends CrudRepository<Doctor, Integer>{
<<<<<<< HEAD
		
	public Doctor getDoctorByEmail(String email);
	
	public List<Doctor> getDoctorByName(String first_name, String last_name);
	
	public List<Doctor> getDoctorBySpecialty(int specialty_id);
	
=======
	

>>>>>>> 629809b5a3d2309c5a8d0b967754cf965a5bc80f
}
