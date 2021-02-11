package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;

import com.revature.entities.Doctor;

public interface DoctorRepo extends CrudRepository<Doctor, Integer>{
	

}
