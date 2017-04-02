
public class Employee extends Person {
	
	private static final int WORKING_HOURS = 8;
	private int daySalary;
	
	
	public Employee(String name, int age, boolean isMale, int daySalary) {
		super(name, age, isMale);
		
		if(daySalary > 0){
			this.daySalary = daySalary;
		}
		else{
			System.out.println("No money, no work!");
		}
	}
	
	double calculateOvertime(int hours){
		if(this.getAge() < 18){
			return 0;
		}
		
		return (this.daySalary/WORKING_HOURS)*1.5*hours;
	}
	
	void showEmployeeInfo(){
		super.showPersonInfo();
		System.out.println("Daily salary: " + this.daySalary);
	}

}
