package com.revature.services;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.revature.entities.Specialty;
import com.revature.repositories.SpecialtyRepo;

@SpringBootTest(classes = com.revature.demo.Project2DfApplication.class)
class SpecialtyServiceTest {
	
	@MockBean
	SpecialtyRepo sr;
	
	@Autowired
	SpecialtyServ ss;
	@Test
	void test() {
		Specialty spec = new Specialty(10,"Neurologist");
		Optional<Specialty> optionalS = Optional.of(spec);
		Mockito.when(sr.findById(spec.getSpecialtyId())).thenReturn(optionalS);
		
		Specialty s= ss.getSpecialtyBySpecialtyId(spec.getSpecialtyId());
		
		Assertions.assertEquals(10, spec.getSpecialtyId());
	}

}
