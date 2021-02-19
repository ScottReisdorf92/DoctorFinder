package com.revature.controllers;

import java.util.List;

import com.revature.entities.Appointment;

public interface AppointmentController {

	public List<Appointment> loadAppointments(String id);
	
	public List<Appointment> loadPatientAppointments(String id);
	
	public Appointment bookAppointment(Appointment appt, String id);
	
	public boolean deleteAppointment(int id);
	
}
