package com.revature.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.google.gson.Gson;
import com.revature.entities.Appointment;
import com.revature.entities.Doctor;
import com.revature.entities.Patient;
import com.revature.entities.Practice;
import com.revature.entities.Specialty;
import com.revature.services.AppointmentServ;
import com.revature.services.AvailabilityServ;
import com.revature.services.DoctorServ;
import com.revature.services.PatientServ;

@AutoConfigureMockMvc
@SpringBootTest(classes = com.revature.demo.Project2DfApplication.class)
public class AppointmentControllerTests {
	
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
	void loadAppointments() throws Exception {
		Specialty spec= new Specialty(10, "Neurologist");
		Practice prac = new Practice(101,"0800","2200","Address","London","Co",80037);
		Doctor doc = new Doctor(1, "scott@gmail.com", "Scott", "Reisdorf", "password", 12, "Very Good", "SCTCC", spec, prac);
		List<Appointment> appts = new ArrayList();
		appts.add(new Appointment());
		Mockito.when(ds.getDoctorById(1)).thenReturn(doc);
		Mockito.when(as.getAllAppointmentsByDocId(doc)).thenReturn(appts);
		
		ResultActions ra = mvc.perform(get("/loadAppointments/1"));
		ra.andExpect(status().isOk());
	}
	
	@Test
	void loadPatientAppointments() throws Exception {
		Patient p = new Patient("A", "K", "email","password", "phone#1234");
		List<Appointment> appts = new ArrayList();
		appts.add(new Appointment());
		Mockito.when(ps.getPatientById(1)).thenReturn(p);
		Mockito.when(as.getAllAppointmentsByPatientId(p)).thenReturn(appts);
		
		ResultActions ra = mvc.perform(get("/loadPatientAppt/1"));
		ra.andExpect(status().isOk());
	}
	
//	@Test
//	void bookAppointment() throws Exception {
//		Patient p = new Patient("A", "K", "email","password", "phone#1234");
//		Specialty spec= new Specialty(10, "Neurologist");
//		Practice prac = new Practice(101,"0800","2200","Address","London","Co",80037);
//		Doctor doc = new Doctor(1, "scott@gmail.com", "Scott", "Reisdorf", "password", 12, "Very Good", "SCTCC", spec, prac);
//		Appointment a = new Appointment(1, LocalDateTime.now(), LocalDateTime.now(), doc, p, "looks good", "Available");
//		Mockito.when(as.bookAppointment(a)).thenReturn(a);
//		Mockito.when(avs.cancelAvailibity("1")).thenReturn(true);
//		
//		ResultActions ra = mvc.perform(post("/bookAppointment").contentType(MediaType.APPLICATION_JSON).content(gson.toJson(a)).queryParam("id", "1"));
//		ra.andExpect(status().isOk());
//	}
	
	@Test
	void deleteAppointment() throws Exception {
		Mockito.when(as.deleteAppointment(1)).thenReturn(true);
		ResultActions ra = mvc.perform(delete("/deleteappointment/1"));
		ra.andExpect(status().isOk());
	}
}
