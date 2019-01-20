package com.abc.repository;

import org.springframework.data.repository.CrudRepository;

import com.abc.model.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer> {

}
