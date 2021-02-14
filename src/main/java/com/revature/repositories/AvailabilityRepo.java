package com.revature.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Availability;
import com.revature.entities.Doctor;

@Repository
public interface AvailabilityRepo extends CrudRepository<Availability, Integer>{
	
	public Availability getAvailabiltyByDoctorId(int doctorId);
	
	public List<Availability> findAllByDoctorIdAndStartAfterAndEndBefore(Doctor doctorId, LocalDateTime start, LocalDateTime end);
}
