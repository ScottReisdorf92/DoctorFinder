package com.revature.controllers;

import com.revature.entities.Availability;

public interface AvailabilityController {

	public Availability getAvailabilityById(String id);
	
	public Availability loadAvailability(String id);
}
