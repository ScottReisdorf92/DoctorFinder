package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repositories.AppointmentRepo;

@Service
public class AppointmentServImpl implements AppointmentServ {
	
	@Autowired
	private AppointmentRepo apptRepo;

}
