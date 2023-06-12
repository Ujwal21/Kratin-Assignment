package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.EmergencyContact;

public interface EmergrncyContactDao  extends JpaRepository<EmergencyContact, Long>{

}
