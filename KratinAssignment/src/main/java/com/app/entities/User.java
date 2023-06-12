package com.app.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString 
@Entity
public class User<healthData> {
	
	private String name;
	
	private int age;
	@Id
	private long contactInfo;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true/* ,fetch = FetchType.EAGER */)
	private List<HealthData> healthData = new ArrayList<HealthData>();
	
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true/* ,fetch = FetchType.EAGER */)
    private List<EmergencyContact> emergencyContact = new ArrayList<EmergencyContact>();
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true/* ,fetch = FetchType.EAGER */)
    private List<Medication> medication = new ArrayList<Medication>();
    
//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true/* ,fetch = FetchType.EAGER */)
//    private List<NutritionPreference> nutritionPreference = new ArrayList<NutritionPreference>();
//    
    
}
