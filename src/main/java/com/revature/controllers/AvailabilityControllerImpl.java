package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.AvailabilityServ;

@RestController
public class AvailabilityControllerImpl implements AvailabilityController {

	@Autowired
	private AvailabilityServ availServ;
}
