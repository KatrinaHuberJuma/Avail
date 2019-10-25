package com.kat.avail.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Days")
public class Day {
	 	@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
//	 	@Column(unique=false)
	    private String day;
	 	
	    @OneToMany(mappedBy="day", fetch = FetchType.LAZY)
	    private List<Availability> availabilities;
	    
	    
	   
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    
		public Day() {
		}


		public Day(Long id, String day, List<Availability> availabilities, Date createdAt, Date updatedAt) {
			this.id = id;
			this.day = day;
			this.availabilities = availabilities;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getDay() {
			return day;
		}


		public void setDay(String day) {
			this.day = day;
		}


		public List<Availability> getAvailabilities() {
			return availabilities;
		}


		public void setAvailabilities(List<Availability> availabilities) {
			this.availabilities = availabilities;
		}


		public Date getCreatedAt() {
			return createdAt;
		}


		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}


		public Date getUpdatedAt() {
			return updatedAt;
		}


		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
	    
	    
	    
	    
}