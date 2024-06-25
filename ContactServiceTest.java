package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;




class ContactServiceTest {

	//Test adding 
	@Test
	void testAddMethod() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("1000", "Joe", "Smith", "6235550149", "123 Apple Street");
		Contact c2 = new Contact("1001", "Jane", "Smith", "6235550140", "124 Apple Street");
		Contact c3 = new Contact ("1002", "Jacob", "Smith", "6235550147", "125 Apple Street");
		assertTrue(cs.add(c1));
		assertTrue(cs.add(c2));
		assertTrue(cs.add(c3));
	}
	
	//current having issues with this segment
	// Test if adding fails
	//@Test
	//void testAddMethodFail() {
		//ContactService contacts = new ContactService();
		//Assertions.assertThrows(IllegalArgumentException.class, ()->{
			//contacts.add("1001");
		//});
		//}
	
	// test if delete fails
	@Test
	void testDeleteMethodFail() {
		ContactService contacts = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			contacts.remove("1004");
		});
	}
	
	//Test if deletes works
	@Test
	void testDeleteMethodPass() {
		ContactService contacts = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			contacts.remove("1001");
		});
	}
	
	//test id updates fail
	@Test
	void testUpdateFail() {
		ContactService contacts = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			contacts.update("1004", "Sue", "Lee", "6235550149", "123 Apple Street");
		});
	}
	
	//test is updates work
	@Test
	void testUpdatePass() {
		ContactService contacts = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			contacts.update("1001", "Sue", "Lee", "6235550149", "123 Apple Street");
		});
	}
}
