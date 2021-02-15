package com.revature.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Appointment;
import com.revature.entities.Availability;
import com.revature.entities.Doctor;
import com.revature.repositories.AppointmentRepo;

@Service
public class AppointmentServImpl implements AppointmentServ {
	
	@Autowired
	private AppointmentRepo apptRepo;

	@Override
	public List<Appointment> getAllAppointmentsByDocId(Doctor doc) {
		return apptRepo.findAllByDocId(doc);
	}

}
