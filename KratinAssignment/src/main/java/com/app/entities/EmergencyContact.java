package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmergencyContact {
	
	@Id
	private long id;
	
	private String name;
	
	private String Relation;
	
	private long phoneNo;
	
	@Email
	private String emailAddress;
	
	@ManyToOne
	private User user;
	
	
	

}
