package com.abc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.model.Patient;
import com.abc.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@PostMapping("/patient/add")
	public void addPatient(@RequestBody Patient patient) {
		patientService.addPatient(patient);
	}
	
	@GetMapping(value="/patients",produces= {"application/xml"})
	public List<Patient> getAllPatient(){
		return patientService.getAllPatient();
		
	}
	
	@PutMapping("/patient/update")
	public void updatePatient(@RequestBody Patient patient) {
		patientService.updatePatient(patient);
	}
	
	@GetMapping(value="/patient/{id}",produces= {"application/xml"})
	public Optional<Patient> getPatient(@PathVariable("id") int id){
		return patientService.getPatient(id);
		
	}
	
	@DeleteMapping("/patient/release/{id}")
	public void releasePatient(@PathVariable("id") int id){
		 patientService.deletePatient1(id);
		
	}

}
