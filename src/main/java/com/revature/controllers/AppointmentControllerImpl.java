package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Appointment;
import com.revature.entities.Doctor;
import com.revature.entities.Patient;
import com.revature.services.AppointmentServ;
import com.revature.services.AvailabilityServ;
import com.revature.services.DoctorServ;
import com.revature.services.PatientServ;

@RestController
public class AppointmentControllerImpl implements AppointmentController {

	@Autowired
	private AppointmentServ apptServ;
	// Request mapping routes
	
	@Autowired
	private DoctorServ ds;
	
	@Autowired
	private PatientServ patServ;
	
	@Autowired
	private AvailabilityServ availServ;
	
	
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

	@Override
	@CrossOrigin
	@GetMapping(value = "/loadPatientAppt/{id}")
	public List<Appointment> loadPatientAppointments(@PathVariable("id") String id) {
		System.out.println(id);
		int patId = Integer.parseInt(id);
		Patient pat = patServ.getPatientById(patId);
		List<Appointment> a = apptServ.getAllAppointmentsByPatientId(pat);
		System.out.println(a);
		return a;
	}

	@Override
	@CrossOrigin
	@PostMapping(value = "/bookAppointment", produces = "application/json")
	public Appointment bookAppointment(@RequestBody Appointment appt, @RequestParam(required = true) String id) {
		System.out.println(appt);
		Appointment a = apptServ.bookAppointment(appt);
		System.out.println("returned appt " + a);
		availServ.cancelAvailibity(id);
		return a;
	}

	@Override
	@CrossOrigin
	@DeleteMapping(value="/deleteappointment/{id}")
	public boolean deleteAppointment(@PathVariable int id) {
		
		return apptServ.deleteAppointment(id);
		
	}

	
	
}
