package com.revature.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.revature.entities.Appointment;

public interface AppointmentController {

	public List<Appointment> loadAppointments(String id);
	
}
