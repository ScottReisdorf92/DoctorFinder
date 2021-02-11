package com.revature.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Appointment;

@Repository
public interface AppointmentRepo extends CrudRepository<Appointment, Integer>{

	
}
