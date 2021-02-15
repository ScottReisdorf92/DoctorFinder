package com.revature.services;

import java.time.LocalDateTime;
import java.util.List;

import com.revature.entities.Appointment;
import com.revature.entities.Doctor;

public interface AppointmentServ {

	public List<Appointment> getAllAppointmentsByDocId(Doctor doc);
	
}
