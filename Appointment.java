package Appointment;

import java.util.Date;

public class Appointment {
	//declare variables
		private String appID;
		private Date appDate;
		private String appDescription;
		
		//Constructors for variable length requirements 
		public Appointment(String appID, Date appDate, String appDescription) {
			//set current date
			Date currentDate = new Date();
			
			if (appID == null || appID.length() > 10) {
				throw new IllegalArgumentException("Invalid Appointment ID");
			}
			if (appDate == null) {
				throw new IllegalArgumentException("Invalid Appointment Date");
			}
			else if(appDate.before(currentDate)) {
				throw new IllegalArgumentException("Invalid Appointment Date");
			}
			if (appDescription == null || appDescription.length() >50) {
				throw new IllegalArgumentException("Invalid Task ");
			}
			
			//set variables if the requirements pass the check
			this.appID = appID;
			this.appDate = appDate;
			this.appDescription = appDescription;	
		}
		
		//getters
		public String getAppID() {
			return appID;
		}
		public Date getAppDate() {
			return appDate;
		}
		public String getAppDescription() {
			return appDescription;
		}
}
