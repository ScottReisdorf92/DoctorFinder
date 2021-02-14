package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Availability;
import com.revature.repositories.AvailabilityRepo;

@Service
public class AvailabilityServImpl implements AvailabilityServ {
	
	@Autowired
	private AvailabilityRepo availRepo;

	@Override
	public Availability getAvailabiltyById(int id) {
		System.out.println(id);
		Availability a = availRepo.findById(id).get();
		System.out.println(a);
		return a;
	}
	
}
