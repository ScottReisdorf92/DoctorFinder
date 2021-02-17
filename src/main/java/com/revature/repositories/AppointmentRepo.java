package com.revature.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Appointment;
import com.revature.entities.Doctor;
import com.revature.entities.Patient;

@Repository
public interface AppointmentRepo extends CrudRepository<Appointment, Integer>{

	List<Appointment> findAllByDocId(Doctor doc);
	List<Appointment> findAllByPatientId(Patient patient);
	
	
}
