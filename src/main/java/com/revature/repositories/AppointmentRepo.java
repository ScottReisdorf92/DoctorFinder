package com.revature.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Appointment;
import com.revature.entities.Doctor;

@Repository
public interface AppointmentRepo extends CrudRepository<Appointment, Integer>{

	List<Appointment> findAllByDocId(Doctor doc);

	
}
