package com.revature.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Availability;
import com.revature.entities.Doctor;
import com.revature.entities.Specialty;
import com.revature.repositories.AvailabilityRepo;

@Service
public class AvailabilityServImpl implements AvailabilityServ {
	
	@Autowired
	private AvailabilityRepo availRepo;

	@Override
	public Availability getAvailabiltyById(int id) {
		System.out.println(id);
		Availability a = availRepo.findById(id).get();
		System.out.println(a);
		return a;
	}

	@Override
	public List<Availability> getAvailabilityForCalendar(Doctor docId, LocalDateTime start, LocalDateTime end) {
		
		List<Availability> a = availRepo.findAllByDoctorIdAndStartAfterAndEndBefore(docId, start, end);
		System.out.println(a);
		return a;
	}

	@Override
	public List<Availability> getAvailabilityBySpecialty(Specialty spec, LocalDateTime start, LocalDateTime end) {
		List<Availability> a = availRepo.findAllBySpecialtyIdAndStartAfterAndEndBefore(spec, start, end);
		System.out.println(a);
		return a;
	}
	
	@Override
	public boolean cancelAvailibity(String id) {
		System.out.println(id);
		availRepo.deleteById(Integer.parseInt(id));
		return true;
	}

	@Override
	public Availability addAvailability(Availability a) {
		System.out.println(a.toString());
		return(availRepo.save(a));
	}
	
	
}
