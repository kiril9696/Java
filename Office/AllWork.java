
public class AllWork {
	
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	private int numberTasks;
	
	public AllWork(int numberTasks) {
		this.numberTasks = numberTasks;
		this.tasks = new Task[numberTasks];
		this.freePlacesForTasks = numberTasks;
		this.currentUnassignedTask = 0;
	}
	
	void addTask(Task task){
		if(task != null && this.freePlacesForTasks > 0){
			tasks[this.tasks.length - this.freePlacesForTasks] = task;
			this.freePlacesForTasks--;
		}
		else{
			System.out.println("You can not add more tasks!");
		}
	}
	
	Task getNextTask(){
		if(this.currentUnassignedTask < this.tasks.length){
			return this.tasks[this.currentUnassignedTask++];
		}
		return null;
	}
	
	boolean isAllWorkDone(){
		for(int i=0; i<tasks.length; i++){
			if(this.tasks[i] != null && this.tasks[i].getWorkingHours() != 0){
				return false;
			}
		}
		return true;
	}

}
