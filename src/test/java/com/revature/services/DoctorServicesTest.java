package com.revature.services;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.junit.jupiter.api.Assertions;

import com.revature.entities.Doctor;
import com.revature.repositories.DoctorRepo;


@SpringBootTest(classes= com.revature.demo.Project2DfApplication.class)
class DoctorServicesTest {

	@MockBean
	DoctorRepo docr;
	
	//@MockBean
	//SpecialtyRepo sr;
	
	//@MockBean
	//PracticeRepo pr;
	@Autowired
	DoctorServ ds;
	@Test
	void signin() {
		
		Doctor doc = new Doctor();
		doc.setEmail("franky@gmail.com");
		doc.setDocId(10);
		doc.setPassword("1234");
		Mockito.when(docr.getDoctorByEmail(doc.getEmail())).thenReturn(doc);
		
		Doctor docc = ds.doctorLogin(doc);
		Assertions.assertEquals(10, docc.getDocId());

	
	
	}
	
	@Test
	void loggedInDoctor() {
		Doctor doc = new Doctor();
		doc.setDocId(1);
		Optional<Doctor> optionalD = Optional.of(doc);
		Mockito.when(docr.findById(doc.getDocId())).thenReturn(optionalD);
		
		Doctor docc = ds.loggedInDoctor(doc.getDocId());
		Assertions.assertEquals(1, docc.getDocId());
	}
	
	@Test
	void getDoctorById() {
		Doctor doc = new Doctor();
		doc.setDocId(1);
		Optional<Doctor> optionalD = Optional.of(doc);
		Mockito.when(docr.findById(doc.getDocId())).thenReturn(optionalD);
		
		Doctor docc = ds.getDoctorById(doc.getDocId());
		Assertions.assertEquals(1, docc.getDocId());
	}

}
