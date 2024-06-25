package Appointment;

import java.util.ArrayList;


public class AppointmentService {
	public static ArrayList<Appointment>appointments = new ArrayList<>();

	public static boolean addApp(Appointment appointment) {
		boolean exists = false;
		
		for(Appointment appointmentList:appointments) {
			if(appointmentList.getAppID().equals(appointment.getAppID())) {
				exists = true;
			}
		}
		if(!exists) {
			appointments.add(appointment);
		}
		return exists;
	}
	
	//delete appointments
	public static boolean deleteApp(String appID) {
		boolean deleted = false;
		
		for(Appointment a : appointments) {
			if(a.getAppID().equals(appID)) {
				appointments.remove(a);
				deleted = true;
				break;
			}
		}
		return deleted;
	}
}

	

	
