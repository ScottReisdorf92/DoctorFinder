package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.SpecialtyServ;

@RestController
public class SpecialtyControllerImpl implements SpecialtyController {

	@Autowired
	private SpecialtyServ ss;
	
}
