package com.kat.avail.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kat.avail.models.Availability;
import com.kat.avail.repositories.AvailabilityRepository;
import com.kat.avail.repositories.DayRepository;

@Service
public class AvailabilityService {
	private final AvailabilityRepository availRepo;
	private final DayRepository dayRepo;
	
	
	
	
	public AvailabilityService(AvailabilityRepository availRepo, DayRepository dayRepo) {
		this.availRepo = availRepo;
		this.dayRepo = dayRepo;
	}
	public List<Availability> allWeek(){
		return availRepo.findAll();
	}
	public void upDateRating(Availability availability, int rating){
		availability.setRating(rating);
	}
//	public Availability userAvailabilityByDay(Long userid, String day) {
//		return 
//	}

	public Availability updateAvailability(Availability availability) {
		return availRepo.save(availability);
		
	}
	
	public List<Object[]> allDaysAndRatings(){
		return dayRepo.userRatingsByDay();
	}
}

