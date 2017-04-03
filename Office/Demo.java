		
public class Demo {
	
	public static void main(String[] args) {
		
		AllWork tasks = new AllWork(10);
		
		tasks.addTask(new Task("task1", 9));
		tasks.addTask(new Task("task2", 40));
		tasks.addTask(new Task("task3", 1));
		tasks.addTask(new Task("task4", 41));
		tasks.addTask(new Task("task5", 90));
		tasks.addTask(new Task("task6", 26));
		tasks.addTask(new Task("task7", 24));
		tasks.addTask(new Task("task8", 29));
		tasks.addTask(new Task("task9", 99));
		tasks.addTask(new Task("task10", 7));
		
		Employee.setAllWork(tasks);
		
		Employee emp1 = new Employee("Employee1");
		Employee emp2 = new Employee("Employee2");
		Employee emp3 = new Employee("Employee3");
		Employee emp4 = new Employee("Employee4");
		
		int dayCounter = 1;
		
		while(true){
			
			System.out.println("day: " + dayCounter);
			
			emp1.work();
			emp2.work();
			emp3.work();
			emp4.work();
						
			emp1.startWorkingDay();
			emp2.startWorkingDay();
			emp3.startWorkingDay();
			emp4.startWorkingDay();
			
			if(tasks.isAllWorkDone()){
				break;
			}
			
			dayCounter++;
		}
		
		System.out.println("Days for tasks: " + dayCounter);
			
	}

}
