package com.pms.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pms.entity.Appointment;
import com.pms.service.AppointmentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;

	// get all appointments
	@GetMapping("/appointments")
	public List<Appointment> getAppointments() {

		return this.appointmentService.getAppointments1();
	}
	
	

//	@GetMapping("/upcoming-appointments")
//	public List<Appointment> getUpcomingAppointments() {
//		
//		
//	}
	
	
	
	
	
	
	
	
	

	// adding the new appointment into the list
	@PostMapping("/appointment")
	public Appointment addAppointment(@RequestBody Appointment appointment) {

		return this.appointmentService.addAppointment(appointment);
	}

	// get a single course details by id
//	@GetMapping("/courses/{courseId}")
//	public Appointment getCourse(@PathVariable String courseId) {
//		return this.appointmentService.getAppointment(Long.parseLong(courseId)); // converts whatever the value u enter for
//																		// courseId into long
//	}

	// Delete a course by id
	// here passing Http status
//	@DeleteMapping("/appointments/{appointmentId}")
//	public ResponseEntity<HttpStatus> deleteAppointment(@PathVariable String appointmentId) {
//		try {
//			this.appointmentService.deleteAppointment(Long.parseLong(appointmentId));
//			return new ResponseEntity<>(HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}

	// getting appointments for next 7 days
//		@GetMapping("/upcoming_appointments")
//		public List<Appointment> getData_between(@PathVariable(value = "one_date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fromDate, @PathVariable(value = "two_date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate toDate) {
//		    return appointmentService.getData_between(fromDate, toDate);
//		}
//		

}
