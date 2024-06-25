package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Appointment.Appointment;

public class AppointmentTest {
	
	Date currentDate = new Date(System.currentTimeMillis());
	Date futureDate = new Date(currentDate.getTime()+10);
	
	//test appointment requirements 
	@Test
	public void testAppointmentClass() {
		Appointment appointment = new Appointment("1000", futureDate,"Description of Appointment");
		
		assertTrue(appointment.getAppID().equals("1000"));
		assertTrue(appointment.getAppDate().equals(futureDate));
		assertTrue(appointment.getAppDescription().equals("Description of Appointment"));
	}
	
	//test for ID Too Long
	@Test
	public void testAppIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Appointment("10000000000", futureDate, "Description of Appointment");
		});
	}
	
	//test for ID null
	@Test
	public void testAppIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Appointment(null, futureDate, "Description of Appointment");
		});
	}
	
	//test for date in past
	@Test
	public void testAppDatePast() {
		Date pastDate = new Date(currentDate.getTime() - 10);
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Appointment("1000", pastDate, "Description of Appointment");
		});
	}
	
	//test for date is null
	@Test
	public void testAppDateNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Appointment("1000", null, "Description of Appointment");
		});
	}
	
	//test for description Too Long
	@Test
	public void testAppDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Appointment("1000", futureDate, "Description of Appointment but make it too long and hopefully over the 50 charater limit");
		});
	}
	
	//test for description null
	@Test
	public void testAppDecriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Appointment("1000", futureDate, null);
		});
	}

}
