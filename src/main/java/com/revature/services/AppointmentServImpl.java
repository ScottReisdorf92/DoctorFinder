package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Appointment;
import com.revature.entities.Doctor;
import com.revature.entities.Patient;
import com.revature.repositories.AppointmentRepo;

@Service
public class AppointmentServImpl implements AppointmentServ {
	
	@Autowired
	private AppointmentRepo apptRepo;

	@Override
	public List<Appointment> getAllAppointmentsByDocId(Doctor doc) {
		return apptRepo.findAllByDocId(doc);
	}

	@Override
	public List<Appointment> getAllAppointmentsByPatientId(Patient patient) {
		return apptRepo.findAllByPatientId(patient);
	}

	@Override
	public Appointment bookAppointment(Appointment appt) {
		return apptRepo.save(appt);
	}
	
	

	@Override
	public boolean deleteAppointment(int id) {
		try {
			apptRepo.deleteById(id);
			return true;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return false;
		}
	}

}
