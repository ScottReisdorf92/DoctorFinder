package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Availability;
import com.revature.services.AvailabilityServ;

@RestController
public class AvailabilityControllerImpl implements AvailabilityController {

	@Autowired
	private AvailabilityServ availServ;

	@Override
	@CrossOrigin
	@GetMapping(value = "/availability/{id}")
	public Availability getAvailabilityById(@PathVariable("id") String id) {
		System.out.println(id);
		return availServ.getAvailabiltyById(Integer.parseInt(id));
		
	}

	@Override
	@CrossOrigin
	@GetMapping(value = "/loadAvailability")
	public Availability loadAvailability(String id) {
		System.out.println(id);
		return availServ.getAvailabiltyById(100);
		
		// this will take in a doctorId we will then use to grab the doctor from the DB
		// then we will grab availability by the doctor and return as a List/Iterable
	}
}
