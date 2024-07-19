package com.cms.confession.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.confession.entity.ConfessionAppointment;

public interface ConfessionAppointmentRepository extends JpaRepository<ConfessionAppointment, Long> {
}
