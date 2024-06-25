package contact;

public class Contact {
	//declare variables
		private String contactID;
		private String firstName;
		private String lastName;
		private String phoneNumber;
		private String streetAddress;
		
		
		//Constructor establishing length requirements
		public Contact(String contactID, String firstName, String lastName, String phoneNumber, String streetAddress) {
			if (contactID == null ||contactID.length()>10) {
				throw new IllegalArgumentException("Invalid ID");
			}
			if (firstName == null ||firstName.length()>10) {
				throw new IllegalArgumentException("Invalid First Name");
			}
			if (lastName == null ||lastName.length()>10) {
				throw new IllegalArgumentException("Invalid Last Name");
			}
			if (phoneNumber == null ||phoneNumber.length()!=10) {
				throw new IllegalArgumentException("Invalid Phone Number");
			}
			if (streetAddress == null ||streetAddress.length()>30) {
				throw new IllegalArgumentException("Invalid Street Address");
			}
		}
			
		
		//gets variables
		public String getContactID() {
			return contactID;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		public String getStreetAddress() {
			return streetAddress;
		}
		
	//set variables
		public void setContactID(String contactID) {
			this.contactID = contactID;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}

}
