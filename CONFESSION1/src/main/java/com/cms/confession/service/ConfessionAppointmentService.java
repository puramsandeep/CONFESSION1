package com.cms.confession.service;

import com.cms.confession.entity.ConfessionAppointment;
import com.cms.confession.repository.ConfessionAppointmentRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConfessionAppointmentService {

    @Autowired
    private ConfessionAppointmentRepository repository;
    

    public List<ConfessionAppointment> getAllAppointments() {
        return repository.findAll();
    }

    public Optional<ConfessionAppointment> getAppointmentById(Long id) {
        return repository.findById(id);
    }

    public ConfessionAppointment saveAppointment(ConfessionAppointment appointment) {
        return repository.save(appointment);
    }

    public void deleteAppointment(Long id) {
        repository.deleteById(id);
    }

	public String deleteconfession(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
