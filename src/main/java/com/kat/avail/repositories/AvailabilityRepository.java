package com.kat.avail.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kat.avail.models.Availability;

@Repository
public interface AvailabilityRepository extends CrudRepository<Availability, Long> {
	List<Availability> findByDay(String day);
	List<Availability> findAll();
	
}