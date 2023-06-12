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
public class HealthData {
  
	@Id
	private long id;
	
	private int stepsTaken;
	
	private double distanceTravelled;
	
	private double caloriesBurned;
	
	private int heartRate;
	
	private int bloodPressure;
	
	
	@ManyToOne
	private User user;
}
