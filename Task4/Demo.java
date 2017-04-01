
public class Demo {
	
	public static void main(String[] args) {
		
		Task task1 = new Task("Homework", 20);
		
		Employee emp = new Employee("Employee1");
		
		emp.setCurrentTask(task1);
		
		emp.showReport();
		
		emp.work();
		
		emp.showReport();
	}

}
