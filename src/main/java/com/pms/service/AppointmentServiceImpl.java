package com.pms.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.dao.AppointmentDao;
import com.pms.entity.Appointment;


@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentDao appointmentDao;

	
	@Override
	public List<Appointment> getAppointments1() {
		
		return appointmentDao.findAll();
	}
	
	// get one record by id
	
//	public Appointment getAppointment(long appointmentId) {
//
//		return appointmentDao.getReferenceById(appointmentId);
//	}

	// add appointment
	public Appointment addAppointment(Appointment appointment) {
		appointmentDao.save(appointment);
		return appointment;
	}

//	@Override
//	public  List<Appointment> getData_between(LocalDate fromDate, LocalDate toDate) {
//		// TODO Auto-generated method stub
//		
//		System.out.println(appointmentDao.findAll());
//		return appointmentDao.findAll();
//		
//	}
	
	
	
	
//	public static void main(String[] args) {
//		AppointmentServiceImpl a= new AppointmentServiceImpl();
//				a.getData_between(LocalDate.now() ,LocalDate.now());
//	}
	
//	public static void main(String[] args) {
//		AppointmentServiceImpl a= new AppointmentServiceImpl();
//				a.getAppointments1();
//	}

//@Override
//public void deleteCourse(long parseLong) {
//	// TODO Auto-generated method stub
//	
//}
	
	
	

	
	


}
