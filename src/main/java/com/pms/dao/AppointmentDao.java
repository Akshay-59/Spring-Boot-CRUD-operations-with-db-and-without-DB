package com.pms.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pms.entity.Appointment;


public interface AppointmentDao extends JpaRepository<Appointment, Long>{

	
	@Query(value = "SELECT app FROM Appointment app WHERE ")
	public List<Appointment> getNextWeekAppointment();

	
}
