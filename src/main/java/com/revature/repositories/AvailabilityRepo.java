package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Availability;

@Repository
public interface AvailabilityRepo extends CrudRepository<Availability, Integer>{
	
	public Availability getAvailabiltyByDoctorId(int doctorId);
}
