package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repositories.DoctorRepo;

@Service
public class DoctorServImpl implements DoctorServ {

	@Autowired
	private DoctorRepo dr;
}
