package com.pms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tbl_appointment1")
public class Appointment {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int appoinmentId;
	 
	    private String name;
	    private String reasonOfVisit;
	    private String patientID;
	    private String physicianName;
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm")
	    private    String startAppointmentTime;
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm")
	    private    String endAppointmentTime;
	    
	    
	    
		public Appointment() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Appointment(int appoinmentId, String name, String reasonOfVisit, String patientID,
				String physicianName, String startAppointmentTime, String endAppointmentTime) {
			super();
			this.appoinmentId = appoinmentId;
			this.name = name;
			this.reasonOfVisit = reasonOfVisit;
			this.patientID = patientID;
			this.physicianName = physicianName;
			this.startAppointmentTime = startAppointmentTime;
			this.endAppointmentTime = endAppointmentTime;
		}
		public int getAppoinmentId() {
			return appoinmentId;
		}
		public void setAppoinmentId(int appoinmentId) {
			this.appoinmentId = appoinmentId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getReasonOfVisit() {
			return reasonOfVisit;
		}
		public void setReasonOfVisit(String reasonOfVisit) {
			this.reasonOfVisit = reasonOfVisit;
		}
		public String getPatientID() {
			return patientID;
		}
		public void setPatientID(String patientID) {
			this.patientID = patientID;
		}
	
		public String getPhysicianName() {
			return physicianName;
		}

		public void setPhysicianName(String physicianName) {
			this.physicianName = physicianName;
		}

		public String getStartAppointmentTime() {
			return startAppointmentTime;
		}
		public void setStartAppointmentTime(String startAppointmentTime) {
			this.startAppointmentTime = startAppointmentTime;
		}
		public String getEndAppointmentTime() {
			return endAppointmentTime;
		}
		public void setEndAppointmentTime(String endAppointmentTime) {
			this.endAppointmentTime = endAppointmentTime;
		}
		@Override
		public String toString() {
			return "Appointment [appoinmentId=" + appoinmentId + ", name=" + name + ", reasonOfVisit=" + reasonOfVisit
					+ ", patientID=" + patientID + ", PhysicianName=" + physicianName + ", startAppointmentTime="
					+ startAppointmentTime + ", endAppointmentTime=" + endAppointmentTime + "]";
		}
	    
	    
		
		
}
