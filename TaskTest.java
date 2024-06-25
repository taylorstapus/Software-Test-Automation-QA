package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import task.Task;

public class TaskTest {

	//test task requirements
	@Test
	void testTask() {
		Task task = new Task("0001", "Task Name", "Task Description");
		assertTrue(task.getTaskID().equalsIgnoreCase("0001"));
		assertTrue(task.getTaskName().equalsIgnoreCase("Task Name"));
		assertTrue(task.getTaskDescription().equalsIgnoreCase("Task Description"));
	}
	
	//test for ID TooLong
	void testTaskIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Task("10000000000", "Task Name", "Task Description");	
		});
	}
	
	//test for ID null
	@Test
	void testTaskIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Task(null, "Task Name", "Task Description");	
		});
	}
	
	//test for Name TooLong
	@Test 
	void testTaskNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Task("1000", "Task Name But Very Long And Over The Requirements", "Task Description");	
		});
	}
	
	//test for Name null
	@Test 
	void testTaskNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Task("1000", null, "Task Description");	
		});
	}
	
	//test for Description TooLong
	@Test 
	void testTaskDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Task("1000", "Task Name", "Task Description     This should be over 50 charaters  hopefully     ");	
		});
	}
	
	// test for Description null
	@Test 
	void testTaskDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Task("1000", "Task Name", null);	
		});
	}
}
