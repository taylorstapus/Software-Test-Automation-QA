package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import task.Task;
import task.TaskService;


public class TaskServiceTest {
	
	//test add task
	@Test
	void testAddTask() {
		Task test1 = new Task("1000", "Task Name", "Task Description");
		assertEquals(false, TaskService.addTask(test1));
	}
	
	//test delete task
	@Test
	void deleteTest() {
		Task test1 = new Task("1000", "Task Name", "Task Description");
		assertEquals(true, TaskService.deleteTask(test1));
	}
	
	//test task updates
	@Test
	void updateTest() {
		Task test1 = new Task("1000", "Task Name", "Task Description");
		TaskService.updateTask(test1);
		assertTrue(TaskService.addTask(test1));
	}
}
