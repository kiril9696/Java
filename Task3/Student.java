
public class Student {
	
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	public Student(String name, String subject, double grade, int age) {
		if(name != null && subject != null && !name.isEmpty() && !subject.isEmpty() && grade >= 2 && grade <= 6 && age >= 18 && age <= 90){
			this.name = name;
			this.subject = subject;
			this.grade = grade;
			this.age = age;
			this.yearInCollege = 1;
			this.isDegree = false;
			this.money = 0;
		}
		else{
			System.out.println("Incorrect input!");
		}
	}
	
	

	public String getSubject() {
		return subject;
	}

	


	public String getName() {
		return name;
	}



	public double getGrade() {
		return grade;
	}

	

	public int getYearInCollege() {
		return yearInCollege;
	}



	public int getAge() {
		return age;
	}



	public boolean isDegree() {
		return isDegree;
	}



	public double getMoney() {
		return money;
	}



	void upYear(){
		if(!this.isDegree){
			this.yearInCollege += 1;
			if(this.yearInCollege == 4){
				this.isDegree = true;
			}
		}
	}
	
	double receiveScholarship(double min, double amount){
		if(this.grade >= min && this.age < 30 && amount >= 700 && amount <= 950){
			this.money += amount;
		}
		return this.money;
	}
}
