package com.revature.services;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.revature.entities.Patient;
import com.revature.repositories.PatientRepo;

@SpringBootTest(classes= com.revature.demo.Project2DfApplication.class)
class PatientServicesTest {

	@MockBean
	PatientRepo pr; 
	
	@Autowired
	PatientServ ps;
	
	@Test
	void signup() {
		Patient p = new Patient("A", "K", "email","password", "phone#1234");
		
		Mockito.when(pr.save(null)).thenReturn(new Patient(1,p.getFirstName(),p.getLastName(),p.getEmail(),p.getPassword(),p.getPhoneNumber()));
		
		boolean b = ps.addPatient(p);
		
		Assertions.assertEquals(true, b);
	}
	
	@Test
	void signin(){
		Patient p = new Patient(1,"A", "K", "email","password", "phone#1234");
		
		Mockito.when(pr.getPatientByEmail(p.getEmail())).thenReturn(p);
		Patient pa = ps.patientLogin(p);
		System.out.println(pa);
		Assertions.assertEquals(1, pa.getPatientId());
	}

}
