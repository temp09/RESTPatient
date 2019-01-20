package com.abc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.model.Patient;
import com.abc.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepository patientRepository;

	@Override
	public void addPatient(Patient patient) {
		patientRepository.save(patient);
		
	}

	@Override
	public void updatePatient(Patient patient) {
		patientRepository.save(patient);
	}

	@Override
	public Optional<Patient> getPatient(int id) {
		return patientRepository.findById(id);
	}

	@Override
	public List<Patient> getAllPatient() {
		List<Patient> patients = new ArrayList<>();
		patientRepository.findAll().forEach(patients::add);
		return patients;
	}

	@Override
	public void deletePatient1(int id) {
		patientRepository.deleteById(id);		
		
	}

	@Override
	public Optional<Patient> deletePatient(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
