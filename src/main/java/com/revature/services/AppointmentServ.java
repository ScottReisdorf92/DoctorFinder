package com.revature.services;

import java.util.List;

import com.revature.entities.Appointment;
import com.revature.entities.Doctor;
import com.revature.entities.Patient;

public interface AppointmentServ {

	public List<Appointment> getAllAppointmentsByDocId(Doctor doc);
	
	public List<Appointment> getAllAppointmentsByPatientId(Patient patient);
	
	public Appointment bookAppointment(Appointment appt);
	
	public boolean deleteAppointment(int id);

	
}
