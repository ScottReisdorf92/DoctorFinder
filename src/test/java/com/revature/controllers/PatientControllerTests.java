package com.revature.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.google.gson.Gson;
import com.revature.entities.Patient;
import com.revature.services.AppointmentServ;
import com.revature.services.AvailabilityServ;
import com.revature.services.DoctorServ;
import com.revature.services.PatientServ;

@AutoConfigureMockMvc
@SpringBootTest(classes = com.revature.demo.Project2DfApplication.class)
public class PatientControllerTests {

	@MockBean
	AppointmentServ as;
	
	@MockBean
	AvailabilityServ avs;
	
	@MockBean
	DoctorServ ds;
	
	@MockBean
	PatientServ ps;
	
	@Autowired
	MockMvc mvc;
	
	Gson gson = new Gson();
	
	@Test
	void patientLogin() throws Exception {
		Patient p = new Patient(1, "Scott", "Reisdorf", "scott@gmail.com", "password", "123456789");
		Mockito.when(ps.patientLogin(p)).thenReturn(p);
		
		ResultActions ra = mvc.perform(post("/patientLogin").contentType(MediaType.APPLICATION_JSON).content(gson.toJson(p)));
		ra.andExpect(status().isOk());
		//ra.andExpect(content().json(gson.toJson(p)));
	}
	
	@Test
	void loggedInPatient() throws Exception {
		Patient p = new Patient(1, "Scott", "Reisdorf", "scott@gmail.com", "password", "123456789");
		Mockito.when(ps.loggedInPatient(p.getPatientId())).thenReturn(p);
		
		ResultActions ra = mvc.perform(get("/loggedInPatient").param("id", Integer.toString(p.getPatientId())));
		ra.andExpect(status().isOk());
		//ra.andExpect(content().json(gson.toJson(p)));
		
		ra = mvc.perform(get("/loggedInPatient").param("id", "NaN"));
		ra.andExpect(status().isOk());
		ra.andExpect(content().string(""));
	}
	
	@Test
	void patientSignup() throws Exception {
		Patient p = new Patient(1, "Scott", "Reisdorf", "scott@gmail.com", "password", "123456789");
		Mockito.when(ps.addPatient(p)).thenReturn(true);
		
		ResultActions ra = mvc.perform(post("/PatientSignup").contentType(MediaType.APPLICATION_JSON).content(gson.toJson(p)));
		ra.andExpect(status().isOk());
		//ra.andExpect(content().string("true"));
		
	}
}
