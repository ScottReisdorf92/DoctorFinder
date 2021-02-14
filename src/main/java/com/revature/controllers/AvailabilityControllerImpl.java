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

import com.revature.entities.Availability;
import com.revature.entities.Doctor;
import com.revature.services.AvailabilityServ;
import com.revature.services.DoctorServ;

@RestController
public class AvailabilityControllerImpl implements AvailabilityController {

	@Autowired
	private AvailabilityServ availServ;
	@Autowired
	private DoctorServ ds;

	@Override
	@CrossOrigin
	@GetMapping(value = "/availability/{id}")
	public Availability getAvailabilityById(@PathVariable("id") String id) {
		System.out.println(id);
		return availServ.getAvailabiltyById(Integer.parseInt(id));
		
	}

	@Override
	@CrossOrigin
	@GetMapping(value = "/loadAvailability/{id}")
	public List<Availability> loadAvailability(@RequestParam("start") @DateTimeFormat(iso = ISO.DATE_TIME) LocalDateTime start, @RequestParam("end") @DateTimeFormat(iso = ISO.DATE_TIME) LocalDateTime end, @PathVariable("id") String id) {
		System.out.println(id);
		System.out.println(start);
		System.out.println(end);
		int docId = Integer.parseInt(id);
		Doctor doc = ds.getDoctorById(docId);
		List<Availability> a = availServ.getAvailabilityForCalendar(doc, start, end);
		return a;
		
		// this will take in a doctorId we will then use to grab the doctor from the DB
		// then we will grab availability by the doctor and return as a List/Iterable
	}
}
