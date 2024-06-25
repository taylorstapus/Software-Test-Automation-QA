package contact;
import java.util.ArrayList;

public class ContactService {
	// list of contacts
	private ArrayList<Contact>contacts;
	
	//Constructor
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	//Add contact to list
	public boolean add(Contact contact) {
		boolean existingContact = false;
		for (Contact c:contacts) {
			//if contact exists
			if(c.equals(contact)) {
				existingContact = true;
			}
		}
		//if doesn't exist, add
		if(!existingContact) {
			contacts.add(contact);
			System.out.println("Contact Created");
			return true;
		}
		else {
			System.out.println("Contact already made");
			return false;
		}
	}
	
	//remove contact
	public boolean remove(String contactID) {
		for(Contact c:contacts) {
			if(c.getContactID().equals(contactID)) {
				contacts.remove(c);
				System.out.println("Contact Removed");
				return true;
			}
		}
		System.out.println("Contact Not Found");
		return false;
	}
	
	//update variables
	public boolean update(String contactID, String firstName, String lastName, String phoneNumber, String streetAddress) {
		for (Contact c: contacts) {
			if(c.getContactID().equals(contactID)) {
				if(!firstName.equals("")) 
					c.setFirstName(firstName);
				if(!lastName.equals(""))
					c.setLastName(lastName);
				if(!phoneNumber.equals(""))
					c.setPhoneNumber(phoneNumber);
				if (!streetAddress.equals(""))
					c.setStreetAddress(streetAddress);
				
				System.out.println("Contact Updated");
				return true;
			}
		}
		System.out.println("Contact Not Found");
		return false;
	}
}
