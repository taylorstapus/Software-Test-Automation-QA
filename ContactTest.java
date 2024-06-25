package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1000", "Joe", "Smith", "6235550149", "123 Apple Street");
		assertTrue(contact.getContactID().equals("1000"));
		assertTrue(contact.getFirstName().equals("Joe"));
		assertTrue(contact.getLastName().equals("Smith"));
		assertTrue(contact.getPhoneNumber().equals("6235550149"));
		assertTrue(contact.getStreetAddress().equals("123 Apple Street"));
	}
	
	//test if contact id is too long
	@Test
	void testContactIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("10000000000", "Joe", "Smith", "6235550149", "123 Apple Street");
		});
	}
	
	//test if first name is too long
	@Test
	void testContactFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("1000", "Joeeeeeeeee", "Smith", "6235550149", "123 Apple Street");
		});
	}
	
	// test is last name is too long
	@Test
	void testContactLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("1000", "Joe", "Smithhhhhhh", "6235550149", "123 Apple Street");
		});
	}
	
	// test if phone number is too long 
	@Test
	void testContactPhoneNumberToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("1000", "Joe", "Smith", "62355501490", "123 Apple Street");
		});
	}
	
	//test if address is too long 
	@Test
	void testContactStreetAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("1000", "Joe", "Smith", "6235550149", "123 Apple Street hhhhhhhhhhhhhh");
		});
	}
	
	//test if phone number is too short
	@Test
	void testContactPhoneNumberToShort() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("1000", "Joe", "Smith", "623555014", "123 Apple Street");
		});
	}
}


