package com.revature.services;

import java.time.LocalDateTime;
import java.util.List;

import com.revature.entities.Availability;
import com.revature.entities.Doctor;

public interface AvailabilityServ {

	public Availability getAvailabiltyById(int id);
	
	public List<Availability> getAvailabilityForCalendar(Doctor docId, LocalDateTime start, LocalDateTime end);
}
