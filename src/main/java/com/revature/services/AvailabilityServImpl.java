package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repositories.AvailabilityRepo;

@Service
public class AvailabilityServImpl implements AvailabilityServ {
	
	@Autowired
	private AvailabilityRepo availRepo;
	
}
