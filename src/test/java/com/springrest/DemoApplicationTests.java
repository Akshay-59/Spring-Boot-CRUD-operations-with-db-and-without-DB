package com.springrest;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pms.dao.AppointmentDao;
import com.pms.service.AppointmentService;

@SpringBootTest
class DemoApplicationTests {
 
	@Autowired
	AppointmentService appointmentService;
	
	@Autowired
	AppointmentDao dao;
	@Test
	void contextLoads() {
		dao.getNextWeekAppointment();
	}

	
//	@Test
//	void checkAppointment() {
//		appointmentService.getData_between(LocalDate.now() ,LocalDate.now() );
//	}
}
