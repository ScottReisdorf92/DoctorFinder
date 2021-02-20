package com.revature.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.revature.entities.Doctor;
import com.revature.entities.Practice;
import com.revature.entities.Specialty;
import com.revature.repositories.DoctorRepo;


@SpringBootTest(classes= com.revature.demo.Project2DfApplicationTests.class)
class DoctorServicesTest {

	@MockBean
	DoctorRepo dr;
	
	DoctorServ ds = new DoctorServImpl();
	@Test
	void signup() {
		
		Specialty spec= new Specialty(10, "Neurologist");
		Practice prac = new Practice(101,"0800","2200","Address","London","Co",80037);
		
		Doctor doc = new Doctor("azharkhalil@gmail.com", "A", "K", "1234567",2,
			"Some Description", "MedSchool", spec, prac);
		
		Mockito.when(dr.save(doc)).thenReturn(new Doctor(1,doc.getEmail(),doc.getFirstName(),doc.getLastName(),doc.getPassword(),doc.getYearsInPractice(),doc.getDescription(),doc.getMedSchool(),doc.getSpecialtyId(),doc.getPracticeId()));
		
		Doctor docc = ds.signUp(doc);
		Assertions.assertEquals(1, doc.getDocId());
	
	}

}
