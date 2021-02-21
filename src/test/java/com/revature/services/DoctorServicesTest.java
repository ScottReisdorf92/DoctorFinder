package com.revature.services;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.revature.entities.Doctor;
import com.revature.entities.Practice;
import com.revature.entities.Specialty;
import com.revature.repositories.DoctorRepo;
import com.revature.repositories.PracticeRepo;
import com.revature.repositories.SpecialtyRepo;


@SpringBootTest(classes= com.revature.demo.Project2DfApplication.class)
class DoctorServicesTest {

	@MockBean
	DoctorRepo dr;
	
	@MockBean
	SpecialtyRepo sr;
	
	@MockBean
	PracticeRepo pr;
	
	DoctorServ ds = new DoctorServImpl();
	@Test
	void signup() {
		
		
		Specialty spec= new Specialty(10, "Neurologist");
		Optional<Specialty> optionalS = Optional.of(spec);
		Practice prac = new Practice(101,"0800","2200","Address","London","Co",80037);
		Optional<Practice> optionalP= Optional.of(prac);
		Doctor doc = new Doctor("azharkhalil@gmail.com", "A", "K", "1234567",2,
			"Some Description", "MedSchool", spec, prac);
		
		
		Mockito.when(sr.findById(spec.getSpecialtyId())).thenReturn(optionalS);
		Mockito.when(pr.findById(prac.getPracticeId())).thenReturn(optionalP);
		Mockito.when(dr.save(doc)).thenReturn(new Doctor(1,doc.getEmail(),doc.getFirstName(),doc.getLastName(),doc.getPassword(),doc.getYearsInPractice(),doc.getDescription(),doc.getMedSchool(),doc.getSpecialtyId(),doc.getPracticeId()));
		
		Doctor docc = ds.signUp(doc);
		Assertions.assertEquals(1, docc.getDocId());
	
	}

}
