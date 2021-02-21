package com.revature.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
import com.revature.entities.Availability;
import com.revature.entities.Doctor;
import com.revature.entities.Practice;
import com.revature.entities.Specialty;
import com.revature.services.AppointmentServ;
import com.revature.services.AvailabilityServ;
import com.revature.services.DoctorServ;
import com.revature.services.PatientServ;
import com.revature.services.SpecialtyServ;

@AutoConfigureMockMvc
@SpringBootTest(classes = com.revature.demo.Project2DfApplication.class)
public class AvailabilityControllerTests {

	@MockBean
	AppointmentServ as;
	
	@MockBean
	AvailabilityServ avs;
	
	@MockBean
	DoctorServ ds;
	
	@MockBean
	PatientServ ps;
	
	@MockBean
	SpecialtyServ ss;
	
	@Autowired
	MockMvc mvc;
	
	Gson gson = new Gson();
	
	@Test
	void getAvailabilityById() throws Exception {
		Specialty spec= new Specialty(10, "Neurologist");
		Practice prac = new Practice(101,"0800","2200","Address","London","Co",80037);
		Doctor doc = new Doctor(1, "scott@gmail.com", "Scott", "Reisdorf", "password", 12, "Very Good", "SCTCC", spec, prac);

		Availability a = new Availability(1, LocalDateTime.now(), LocalDateTime.now(), spec, doc, "text", "green");
		Mockito.when(avs.getAvailabiltyById(1)).thenReturn(a);
		
		ResultActions ra = mvc.perform(get("/availability/1"));
		ra.andExpect(status().isOk());
	}
	
	@Test
	void loadAvailability() throws Exception {
		Specialty spec= new Specialty(10, "Neurologist");
		Practice prac = new Practice(101,"0800","2200","Address","London","Co",80037);
		Doctor doc = new Doctor(1, "scott@gmail.com", "Scott", "Reisdorf", "password", 12, "Very Good", "SCTCC", spec, prac);
		LocalDateTime start = LocalDateTime.now();
		LocalDateTime end = LocalDateTime.now();
		List<Availability> avails = new ArrayList();
		Availability a = new Availability(1, LocalDateTime.now(), LocalDateTime.now(), spec, doc, "text", "green");
		avails.add(a);
		Mockito.when(ds.getDoctorById(doc.getDocId())).thenReturn(doc);
		Mockito.when(avs.getAvailabilityForCalendar(doc, start, end)).thenReturn(avails);
		
		ResultActions ra = mvc.perform(get("/loadAvailability/1").param("start", start.toString()).param("end", end.toString()));
		ra.andExpect(status().isOk());
	}
	
	@Test
	void getAvailBySpecialtyId() throws Exception {
		Specialty spec= new Specialty(10, "Neurologist");
		Practice prac = new Practice(101,"0800","2200","Address","London","Co",80037);
		Doctor doc = new Doctor(1, "scott@gmail.com", "Scott", "Reisdorf", "password", 12, "Very Good", "SCTCC", spec, prac);

		List<Availability> avails = new ArrayList();
		Availability a = new Availability(1, LocalDateTime.now(), LocalDateTime.now(), spec, doc, "text", "green");
		avails.add(a);
		Mockito.when(ss.getSpecialtyBySpecialtyId(spec.getSpecialtyId())).thenReturn(spec);
		Mockito.when(avs.getAvailabilityBySpecialty(spec, LocalDateTime.now(), LocalDateTime.now())).thenReturn(avails);
		
		ResultActions ra = mvc.perform(get("/availability/1"));
		ra.andExpect(status().isOk());
	}
	
	@Test
	void cancelAvailability() throws Exception {
		Mockito.when(avs.cancelAvailibity(Integer.toString(1))).thenReturn(true);
		
		ResultActions ra = mvc.perform(get("/cancelAvailability/1"));
		ra.andExpect(status().isOk());
	}
	
//	@Test
//	void addAvailability() throws Exception {
//		Specialty spec= new Specialty(10, "Neurologist");
//		Practice prac = new Practice(101,"0800","2200","Address","London","Co",80037);
//		Doctor doc = new Doctor(1, "scott@gmail.com", "Scott", "Reisdorf", "password", 12, "Very Good", "SCTCC", spec, prac);
//
//		Availability a = new Availability(1, LocalDateTime.now(), LocalDateTime.now(), spec, doc, "text", "green");
//		Mockito.when(avs.addAvailability(a)).thenReturn(a);
//		
//		ResultActions ra = mvc.perform(post("/addAvailability").contentType(MediaType.APPLICATION_JSON).content(gson.toJson(a)));
//		ra.andExpect(status().isOk());
//	}
}
