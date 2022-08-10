package com.pms.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.pms.entity.Appointment;


public interface AppointmentService {

	public List<Appointment> getAppointments1();
	
	public Appointment addAppointment(Appointment appointment);

	//public List<Appointment> getData_between(LocalDate fromDate, LocalDate toDate);

//	 public List<Appointment> getData_between(@Param("startDate") LocalDate date, @Param("endDate") LocalDate date2);
//	
//	 public void deleteAppointment(long parseLong);

}
