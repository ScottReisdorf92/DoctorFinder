package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repositories.InsuranceRepo;

@Service
public class InsuranceServImpl implements InsuranceServ {
	
	@Autowired
	private InsuranceRepo ir;
}
