package com.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.dao.EmergrncyContactDao;
import com.app.entities.EmergencyContact;

@Service
public class EmergencyContactServiceImpl implements EmergencyContactService {

	private EmergrncyContactDao emergencyContactDao; 
	@Override
	public List<EmergencyContact> getEmergencyContact() {
		// TODO Auto-generated method stub
		return this.emergencyContactDao.findAll();
	}

	@Override
	public EmergencyContact addEmergencyContact(EmergencyContact emergencyContact) {
		 emergencyContactDao.save(emergencyContact);
		 return emergencyContact;
	}

	@Override
	public EmergencyContact updateEmergencyContact(EmergencyContact emergencyContact) {
		 emergencyContactDao.save(emergencyContact);
		 return emergencyContact;
	}

	@Override
	public void deleteEmergencyContact(long parseLong) {
		emergencyContactDao.deleteById(parseLong);
	}

}
