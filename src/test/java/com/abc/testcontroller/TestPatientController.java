package com.abc.testcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abc.model.Patient;

@RestController
public class TestPatientController {
	
		@RequestMapping(value = "/patientmgt/patients", method = RequestMethod.GET)
		public Patient firstPage() {

			Patient patient = new Patient();
			patient.setPatientId(1);
			patient.setPatientName("Amdad");
			patient.setPatientAddress("Omaha");
			patient.setPatientAge(30);
			patient.setPatientContactNumber("123-456-7890");
			patient.setPatientEmail("abc@xyz.com");
			return patient;
		}

	}


