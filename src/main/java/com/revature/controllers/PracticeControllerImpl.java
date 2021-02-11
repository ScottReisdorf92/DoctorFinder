package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.PracticeServ;

@RestController
public class PracticeControllerImpl implements PracticeController {

	@Autowired
	private PracticeServ practServ;
}
