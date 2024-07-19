package com.cms.confession.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.confession.entity.ConfessionAppointment;
import com.cms.confession.service.ConfessionAppointmentService;


@RestController
@RequestMapping("appointment")
@CrossOrigin("*")
public class ConfessionAppointmentController {
	
	@Autowired
	private  ConfessionAppointmentService service;
	
	
	@PostMapping("/save")
	public ResponseEntity<Object> saveAppointment(@RequestBody  ConfessionAppointment entity ){
		ConfessionAppointment savePastor2 = service.saveAppointment(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(savePastor2);
	
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteconfession(@PathVariable Integer id){
	 String deleteconfession = service.deleteconfession(id);
		return ResponseEntity.status(HttpStatus.OK).body(deleteconfession);
		
	
	}
	@GetMapping("/getAll")
	public ResponseEntity< List<ConfessionAppointment>> getAllPastor( ){
	 List<ConfessionAppointment> allPastor = service.getAllAppointments();
		return ResponseEntity.status(HttpStatus.OK).body(allPastor);
	}

}






