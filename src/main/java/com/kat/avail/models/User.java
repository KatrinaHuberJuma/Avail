package com.kat.avail.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	 	@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
	 	@Column(unique=true)
	 	@Email(message="Email must be valid")
	    private String email;
	 	@Size(min=2, message="name must be at least 2 characters")
	    private String name;
	 	@Size(min=5, message="password must be at least 5 characters")
	    private String password;
	    @Transient
	    private String passwordConfirmation;
	    @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    
	    
	    
	    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
	    private List<Availability> availabilities;
	    
	    
	    
	    public User() {
	    }





		public User(Long id, @Email(message = "Email must be valid") String email,
				@Size(min = 2, message = "name must be at least 2 characters") String name,
				@Size(min = 5, message = "password must be at least 5 characters") String password,
				String passwordConfirmation, Date createdAt, Date updatedAt, List<Availability> availabilities) {
			this.id = id;
			this.email = email;
			this.name = name;
			this.password = password;
			this.passwordConfirmation = passwordConfirmation;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
			this.availabilities = availabilities;
		}





		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Long getId() {
			return id;
		}



		public void setId(Long id) {
			this.id = id;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}






		public List<Availability> getAvailabilities() {
			return availabilities;
		}





		public void setAvailabilities(List<Availability> availabilities) {
			this.availabilities = availabilities;
		}





		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}



		public String getPasswordConfirmation() {
			return passwordConfirmation;
		}



		public void setPasswordConfirmation(String passwordConfirmation) {
			this.passwordConfirmation = passwordConfirmation;
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



		// other getters and setters removed for brevity
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
	   
}



