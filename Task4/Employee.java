
public class Employee {
	
	private static final int WORKING_HOURS = 8;
	
	private String name;
	private Task currentTask;
	private int dayHoursLeft;
	
	public Employee(String name) {
		if(name != null && !name.isEmpty()){
			this.name = name;
			this.dayHoursLeft = WORKING_HOURS;
		}
	}
	
	
	public void setCurrentTask(Task currentTask) {
		if(currentTask != null){
			this.currentTask = currentTask;
		}
		else{
			System.out.println("No task!");
		}
	}



	void work(){
		if(this.currentTask != null){
			if(this.dayHoursLeft >= this.currentTask.getWorkingHours()){
				this.dayHoursLeft -= this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
			}
			else{
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.dayHoursLeft);
				this.dayHoursLeft = 0;
			}
		}
	}
	
	void showReport(){
		System.out.println("Employee name: " + this.name);
		System.out.println("Task name: " + this.currentTask.getName());
		System.out.println("Employee day hours left: " + this.dayHoursLeft);
		System.out.println("Current task hours left: " + this.currentTask.getWorkingHours());
	}
	
	
	
}
