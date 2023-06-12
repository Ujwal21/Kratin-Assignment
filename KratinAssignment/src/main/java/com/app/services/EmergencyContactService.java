package com.app.services;

import java.util.List;

import com.app.entities.EmergencyContact;


public interface EmergencyContactService {
	
	public List<EmergencyContact> getEmergencyContact();
	
	public EmergencyContact addEmergencyContact(EmergencyContact emergencyContact);
	
	public EmergencyContact updateEmergencyContact(EmergencyContact emergencyContact);
	
	public void deleteEmergencyContact(long parseLong);


}
