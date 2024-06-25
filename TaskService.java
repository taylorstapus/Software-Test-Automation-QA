package task;

import java.util.ArrayList;

public class TaskService {
	//array list of tasks
	public static ArrayList<Task>tasks = new ArrayList<>();
	
	//method to add task
	public static boolean addTask(Task task) {
		boolean exists = false;
		for(Task taskList:tasks) {
			if(taskList.getTaskID().equals(task.getTaskID())) {
				exists = true;
			}
		}
		if(!exists) {
			tasks.add(task);
		}
		return exists;
	}
	
	//method to delete task
	public static boolean deleteTask(Task task) {
		boolean deleted = false;
		for(Task taskList:tasks) {
			if(taskList.getTaskID().equals(task.getTaskID())) {
				tasks.remove(task);
				deleted = true;
			}
		}
		return deleted;
	}
	
	// method to update task
	public static boolean updateTask(Task task) {
		boolean updated = false;
		for(Task taskList: tasks) {
			if(taskList.getTaskID().equals(task.getTaskID())) {
				taskList.setTaskName(task.getTaskName());
				taskList.setTaskDescription(task.getTaskDescription());
				updated = true;
			}
		}
		return updated;
	}
	

}
