package com.revature.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Availability;
import com.revature.entities.Doctor;
import com.revature.entities.Specialty;

@Repository
public interface AvailabilityRepo extends CrudRepository<Availability, Integer>{
	
	public Availability getAvailabiltyByDoctorId(int doctorId);
	
	//@Query("SELECT * FROM availability WHERE doc_id = :doctorId AND start_time >= :start AND end_time < :end")
	public List<Availability> findAllByDoctorIdAndStartAfterAndEndBefore(Doctor doctorId, LocalDateTime start, LocalDateTime end);
	
	public List<Availability> findAllBySpecialtyIdAndStartAfterAndEndBefore(Specialty specialtyId, LocalDateTime start, LocalDateTime end);
}
