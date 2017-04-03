
public class Task {
	
	private String name;
	private int workingHours;
	
	public Task(String name, int workingHours) {
		if(name != null && !name.isEmpty() && workingHours>0){
			this.name = name;
			this.workingHours = workingHours;
		}
		else{
			System.out.println("Incorrect input!");
		}
	}

	
	
	public String getName() {
		return name;
	}



	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if(workingHours >= 0){
			this.workingHours = workingHours;
		}
	}
	
	
	
	

}
