package com.kat.avail.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kat.avail.models.Day;



@Repository 
public interface DayRepository  extends CrudRepository<Day, Long> {
	List<Day> findAll(); 
	
	@Query("SELECT d.day, a.rating, u.name FROM Day d JOIN d.availabilities a JOIN a.user u ORDER BY a.rating DESC")
	List<Object[]> userRatingsByDay();
	
	
}
