package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Medication {
	
	@Id
	private long id;
	
	private String name;
	
	private String dosage;
	
	private String frequency;
	
	@ManyToOne
	private User user;

}
