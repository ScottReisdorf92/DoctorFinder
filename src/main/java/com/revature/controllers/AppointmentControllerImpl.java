package com.revature.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Appointment;
import com.revature.entities.Availability;
import com.revature.entities.Doctor;
import com.revature.services.AppointmentServ;
import com.revature.services.DoctorServ;

@RestController
public class AppointmentControllerImpl implements AppointmentController {

	@Autowired
	private AppointmentServ apptServ;
	// Request mapping routes
	
	@Autowired
	private DoctorServ ds;

	@Override
	@CrossOrigin
	@GetMapping(value = "/loadAppointments/{id}")
	public List<Appointment> loadAppointments(@PathVariable("id") String id) {
		System.out.println(id);
		int docId = Integer.parseInt(id);
		Doctor doc = ds.getDoctorById(docId);
		List<Appointment> a = apptServ.getAllAppointmentsByDocId(doc);
		System.out.println(a);
		return a;
	}
}
