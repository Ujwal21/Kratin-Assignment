package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.HealthData;

public interface HealthDataDao extends JpaRepository<HealthData, Long> {

}
