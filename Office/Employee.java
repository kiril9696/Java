
public class Employee {
	
	private static final int WORKING_HOURS = 8;
	
	private String name;
	private Task currentTask;
	private int dayHoursLeft;
	private static AllWork allWork;
	
	public Employee(String name) {
		if(name != null && !name.isEmpty() ){
			this.name = name;
			this.dayHoursLeft = WORKING_HOURS;
			if(allWork != null){
				this.currentTask = Employee.allWork.getNextTask();
			}
		}
	}
	
	
	
	public static void setAllWork(AllWork tasks) {
		if(tasks != null){
			Employee.allWork = tasks;
		}
	}


	void startWorkingDay(){
		this.dayHoursLeft = WORKING_HOURS;
	}
	
	

	void work(){
		if(this.currentTask != null){
			if(this.dayHoursLeft >= this.currentTask.getWorkingHours()){
				this.dayHoursLeft -= this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
				this.showReport();
				if(!allWork.isAllWorkDone()){
					this.currentTask = allWork.getNextTask();
					this.work();
				}
			}
			else{
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.dayHoursLeft);
				this.dayHoursLeft = 0;
				this.showReport();
			}
		}
	}
	
	
	
	private void showReport(){
		if(this.currentTask != null){
			System.out.println("Employee name: " + this.name);
			System.out.println("Task name: " + this.currentTask.getName());
			System.out.println("Employee day hours left: " + this.dayHoursLeft);
			System.out.println("Current task hours left: " + this.currentTask.getWorkingHours());
			System.out.println("--------------------------------------");
		}
	}
	
	
	
}
