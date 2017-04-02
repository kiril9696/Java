
public class Student extends Person {
	
	private static final double MIN_SCORE = 2;
	private static final double MAX_SCORE = 6;
	
	private double score;
	
	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		
		if(score >= MIN_SCORE && score <= MAX_SCORE){
			this.score = score;
		}
		else{
			System.out.println("Invalid score!");
		}
	}
	
	void showStudentInfo(){
		super.showPersonInfo();
		System.out.println("Score: " + this.score);
	}



}
