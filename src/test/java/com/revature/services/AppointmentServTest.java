package com.revature.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.revature.entities.Appointment;
import com.revature.entities.Doctor;
import com.revature.entities.Patient;
import com.revature.repositories.AppointmentRepo;

@SpringBootTest(classes= com.revature.demo.Project2DfApplication.class)
class AppointmentServTest {

	@MockBean
	AppointmentRepo ar;
	
	@Autowired
	AppointmentServ as;
	@Test
	void bookAppointment() {
		Appointment app = new Appointment();
		app.setText("SomeText");
		
		Appointment appointment =new Appointment();
		appointment.setid(1);
		
		Mockito.when(ar.save(app)).thenReturn(appointment);
		
		Appointment ap= as.bookAppointment(app);
		Assertions.assertEquals(1, ap.getid());
	}
	
	@Test
	void getAllAppointmentsByPatientId() {
		
		Patient p = new Patient();
		p.setPatientId(1);
		
		Appointment a = new Appointment();
		a.setText("SomeText");
		List<Appointment> appList = new ArrayList<Appointment>();
		appList.add(a);
		Mockito.when(ar.findAllByPatientId(p)).thenReturn(appList);
		
		List<Appointment>a1 = as.getAllAppointmentsByPatientId(p);
		Assertions.assertEquals("SomeText", a1.get(0).getText());
	}
	@Test
	void getAllAppointmentsByDoctorId() {
		
		Doctor d = new Doctor();
		d.setDocId(1);
		
		Appointment a = new Appointment();
		a.setText("SomeText");
		List<Appointment> appList = new ArrayList<Appointment>();
		appList.add(a);
		Mockito.when(ar.findAllByDocId(d)).thenReturn(appList);
		
		List<Appointment>a1 = as.getAllAppointmentsByDocId(d);
		Assertions.assertEquals("SomeText", a1.get(0).getText());
	}
	
	@Test
	void deleteAppointment() {
		Appointment a = new Appointment();
		a.setid(1);
		Optional<Appointment> optionalA = Optional.of(a);
		
		Mockito.when(ar.findById(a.getid())).thenReturn(optionalA);
		Mockito.doNothing().when(ar).deleteById(a.getid());
		
		as.deleteAppointment(a.getid());
		
	}

}
