package task;

//declare variables
public class Task {
	private String taskID;
	private String taskName;
	private String taskDescription;
	
	//Constructors for variable length requirements 
	public Task(String taskID, String taskName, String taskDescription) {
		if (taskID == null || taskID.length() > 10) {
			throw new IllegalArgumentException("Invalid Task ID");
		}
		if (taskName == null || taskName.length() >20) {
			throw new IllegalArgumentException("Invalid Task Name");
		}
		if (taskDescription == null || taskDescription.length() >50) {
			throw new IllegalArgumentException("Invalid Task ");
		}
		
		//set variables if the requirements pass the check
		this.taskID = taskID;
		this.taskName = taskName;
		this.taskDescription = taskDescription;	
	}
	
	//getters
	public String getTaskID() {
		return taskID;
	}
	public String getTaskName() {
		return taskName;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	
	//setters
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public void setTaskDescription (String taskDescription) {
		this.taskDescription = taskDescription;
	}

}
