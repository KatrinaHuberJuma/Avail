package com.kat.avail.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

	@Entity
	@Table(name="availabilities")
	public class Availability {
		 	@Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    private Long id;
//		 	@Column(unique=false)
		   
		 	private int rating;
		 	
		 	@ManyToOne(fetch = FetchType.LAZY)
		    @JoinColumn(name="user_id")
		    private User user;
		   
		    @Column(updatable=false)
		    @DateTimeFormat(pattern="yyyy-MM-dd")
		    private Date createdAt;
		    @DateTimeFormat(pattern="yyyy-MM-dd")
		    private Date updatedAt;
		    
		    
		    @ManyToOne(fetch = FetchType.LAZY)
		    @JoinColumn(name="day_id")
		    private Day day;
		        
		    
			
			public Availability(Long id, int rating, User user, Date createdAt, Date updatedAt, Day day) {
				this.id = id;
				this.rating = rating;
				this.user = user;
				this.createdAt = createdAt;
				this.updatedAt = updatedAt;
				this.day = day;
			}
			public Availability() {
			}
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			
			public Day getDay() {
				return day;
			}
			public void setDay(Day day) {
				this.day = day;
			}
			public int getRating() {
				return rating;
			}
			public void setRating(int rating) {
				this.rating = rating;
			}
			public User getUser() {
				return user;
			}
			public void setUser(User user) {
				this.user = user;
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
