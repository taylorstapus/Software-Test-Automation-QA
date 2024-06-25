package test;

import static org.junit.Assert.assertTrue;


import java.util.Date;

import org.junit.jupiter.api.Test;

import Appointment.Appointment;
import Appointment.AppointmentService;

public class AppointmentServiceTest {
	
	// test add appointments
	@Test
	public void AddAppTest() {
	//set dates
		Date currentDate = new Date(System.currentTimeMillis());
		Date futureDate = new Date(currentDate.getTime()+10);
	
	//create new appointment
	Appointment appointment = new Appointment ("1000", futureDate, "Descritption of Appointment");
	
	//add appointment
	AppointmentService.addApp(appointment);
	
	//test method
	assertTrue(AppointmentService.addApp(appointment));
	}
	
	//test delete method
	@Test
	public void DeleteAppTest() {
	
	//set dates
		Date currentDate = new Date(System.currentTimeMillis());
		Date futureDate = new Date(currentDate.getTime()+10);
		
	//create new appointment
	Appointment appointment = new Appointment ("1000", futureDate, "Descritption of Appointment");
		
	//add appointment
		AppointmentService.addApp(appointment);
	
	//test delete method
		assertTrue(AppointmentService.deleteApp("1000"));
	}
	

}
