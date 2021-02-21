package com.revature.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

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
import com.revature.entities.Doctor;
import com.revature.entities.Practice;
import com.revature.entities.Specialty;
import com.revature.services.DoctorServ;

@AutoConfigureMockMvc
@SpringBootTest(classes = com.revature.demo.Project2DfApplication.class)
public class DoctorControllerTests {

	@MockBean
	DoctorServ ds;
	
	@Autowired
	MockMvc mvc;
	
	Gson gson = new Gson();
	
	@Test
	void signup() throws Exception {
		Specialty spec= new Specialty(10, "Neurologist");
		Practice prac = new Practice(101,"0800","2200","Address","London","Co",80037);
		Doctor doc = new Doctor(1, "scott@gmail.com", "Scott", "Reisdorf", "password", 12, "Very Good", "SCTCC", spec, prac);
		Mockito.when(ds.signUp(doc)).thenReturn(doc);
		
		ResultActions ra = mvc.perform(post("/DoctorSignup").contentType(MediaType.APPLICATION_JSON).content(gson.toJson(doc)));
		ra.andExpect(status().isOk());
	}
	
}
