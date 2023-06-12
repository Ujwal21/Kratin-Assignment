package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.EmergencyContact;
import com.app.services.EmergencyContactService;

@RestController
public class EmergencyContactController {
	
	@Autowired
	private EmergencyContactService emeegencyContactService;
	
	@GetMapping("/emergencyContact")
	public List<EmergencyContact> getEmergencyContact(){
		
		return this.emeegencyContactService.getEmergencyContact();
		
	}
	//If we want to add new HealthData then we will use following method
	@PostMapping(path = "/emergencyContact", consumes="application/json")
	public EmergencyContact addhealthData(@RequestBody EmergencyContact emergencyContact) {
		return this.emeegencyContactService.addEmergencyContact(emergencyContact);
		
	}
	
	// To update the user data
	@PutMapping("/emergencyContact")
	public EmergencyContact updateUser(@RequestBody EmergencyContact emergencyContact) {
		return this.emeegencyContactService.updateEmergencyContact(emergencyContact);
	}
	
	//To delete user
	@DeleteMapping("/emergencyContact/{emergencyContactId}")
	public ResponseEntity<HttpStatus> deleteEmergencyContact(@PathVariable String emergencyContactId){
		try {
			this.emeegencyContactService.deleteEmergencyContact(Long.parseLong(emergencyContactId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
