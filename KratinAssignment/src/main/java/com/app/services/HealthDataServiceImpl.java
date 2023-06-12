package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.HealthDataDao;
import com.app.entities.HealthData;

@Service
public class HealthDataServiceImpl implements HealthDataService {
 
	@Autowired
	private HealthDataDao healthDataDao;

	@Override
	public List<HealthData> getHealthData() {
		return healthDataDao.findAll();
	}

	@Override
	public HealthData addHealthdata(HealthData healthData) {
		// TODO Auto-generated method stub
		 healthDataDao.save(healthData);
		 return healthData;
	}

	@Override
	public HealthData updateHealthdata(HealthData healthData) {
		 healthDataDao.save(healthData);
		 return healthData;
	}

	@Override
	public void deleteHealthData(long parseLong) {
		healthDataDao.deleteById(parseLong);
	}
	

}
