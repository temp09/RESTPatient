package com.abc.service;

import java.util.List;
import java.util.Optional;

import com.abc.model.Patient;

public interface PatientService {
	
	void addPatient(Patient patient);
	void updatePatient(Patient patient);
	Optional<Patient> getPatient(int id);
	List<Patient> getAllPatient();
	Optional<Patient> deletePatient(int id);
    void deletePatient1(int id);
}
