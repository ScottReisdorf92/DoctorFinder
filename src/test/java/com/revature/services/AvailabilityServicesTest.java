package com.revature.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.revature.entities.Availability;
import com.revature.entities.Doctor;
import com.revature.entities.Specialty;
import com.revature.repositories.AvailabilityRepo;

@SpringBootTest(classes = com.revature.demo.Project2DfApplication.class)
class AvailabilityServicesTest {

	@MockBean
	AvailabilityRepo ar;

	@Autowired
	AvailabilityServ as;

	@Test
	void getAvailabiltyById() {
		Availability av = new Availability();
		av.setid(100);
		Optional<Availability> optionalA = Optional.of(av);
		Mockito.when(ar.findById(av.getid())).thenReturn(optionalA);

		Availability a = as.getAvailabiltyById(av.getid());
		Assertions.assertEquals(100, a.getid());

	}

	@Test
	void addAvailability() {
		Availability av = new Availability();
		av.setStart(LocalDateTime.now());
		av.setText("SomeText");
		Availability av1 = new Availability();
		av1.setid(100);
		Mockito.when(ar.save(av)).thenReturn(av1);

		Availability a = as.addAvailability(av);

		Assertions.assertEquals(100, a.getid());
	}


	@Test
	void getAvailabilityBySpecialty() {
		Specialty spec = new Specialty();
		spec.setSpecialtyId(10);
		spec.setSpecialty("Neurologist");
		LocalDateTime start = LocalDateTime.now();
		Availability a = new Availability();
		a.setText("SomeText");

		List<Availability> av = new ArrayList<Availability>();
		av.add(a);
	
		
		Mockito.when(ar.findAllBySpecialtyIdAndStartAfterAndEndBefore(spec, start, start)).thenReturn (av);
		List<Availability> a1 =as.getAvailabilityBySpecialty(spec, start, start);
		//System.out.println(a.size());
		Assertions.assertEquals("SomeText", a1.get(0).getText());
	}

	@Test
	void getAvailabilityForCalendar() {

		Doctor doctor = new Doctor();
		doctor.setFirstName("Azhar");
		
		Availability a = new Availability();
		a.setText("SomeText");

		List<Availability> av = new ArrayList<Availability>();
		//av.setStart(LocalDateTime.now());
		//av.setText("SomeText");
		av.add(a);
		LocalDateTime start = LocalDateTime.now();
		Mockito.when(ar.findAllByDoctorIdAndStartAfterAndEndBefore(doctor, start, start)).thenReturn(av);
		
		List<Availability> a1 =as.getAvailabilityForCalendar(doctor, start, start);
		Assertions.assertEquals("SomeText", a1.get(0).getText());
	}

	@Test
	void cancelAvailibity() {
		
		Mockito.doNothing().when(ar).deleteById(1);
		as.cancelAvailibity("1");
	}
}
