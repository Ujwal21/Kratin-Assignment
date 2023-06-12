package com.app.services;

import java.util.List;

import com.app.entities.HealthData;

public interface HealthDataService {
	public List<HealthData> getHealthData();
	
	public HealthData addHealthdata(HealthData healthData);
	
	public HealthData updateHealthdata(HealthData healthData);
	
	public void deleteHealthData(long parseLong);



}
