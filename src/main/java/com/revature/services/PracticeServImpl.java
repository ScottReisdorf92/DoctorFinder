package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repositories.PracticeRepo;

@Service
public class PracticeServImpl implements PracticeServ {

	@Autowired
	private PracticeRepo practRepo;
}
