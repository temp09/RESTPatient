package com.abc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.model.Patient;
import com.abc.service.PatientService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/patientmgt")
@Api(value="patientinfo", description="Operations pertaining to patient informations")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@ApiOperation(value = "View a list of available patients",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
	@GetMapping(value="/patients",produces= {"application/xml"})
	public List<Patient> getAllPatient(){
		return patientService.getAllPatient();
		
	}
	@ApiOperation(value = "Add a patient")
	@PostMapping("/patient/add")
	public void addPatient(@RequestBody Patient patient) {
		patientService.addPatient(patient);
	}
	@ApiOperation(value = "Update a patient")	
	@PutMapping("/patient/update")
	public void updatePatient(@RequestBody Patient patient) {
		patientService.updatePatient(patient);
	}
	@ApiOperation(value = "Get a specific patient by id")
	@GetMapping(value="/patient/{id}",produces= {"application/xml"})
	public Optional<Patient> getPatient(@PathVariable("id") int id){
		return patientService.getPatient(id);
		
	}
	@ApiOperation(value = "Delete a specific patient by id")
	@DeleteMapping("/patient/release/{id}")
	public void releasePatient(@PathVariable("id") int id){
		 patientService.deletePatient1(id);
		
	}

}
