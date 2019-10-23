package com.kat.avail.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kat.avail.models.Availability;
import com.kat.avail.repositories.AvailabilityRepository;

@Service
public class AvailabilityService {
	private final AvailabilityRepository availRepo;

	public AvailabilityService(AvailabilityRepository availRepo) {
		this.availRepo = availRepo;
	}
	
	public List<Availability> allWeek(){
		return availRepo.findAll();
	}
	
}

