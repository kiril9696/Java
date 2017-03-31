
public class StudentGroup {
	
	private String groupSubject;
	private Student[] students;
	private int freePlaces;
	
	public StudentGroup(String groupSubject, int freePlaces){
		if(groupSubject != null && !groupSubject.isEmpty() && freePlaces > 1 && freePlaces <= 100){
			this.groupSubject = groupSubject;
			this.freePlaces = freePlaces;
			students = new Student[freePlaces];
		}
		else{
			System.out.println("Incorrect input!");
		}
	}
	
	void addStudent(Student s){
		if(this.groupSubject.equals(s.getSubject()) && this.freePlaces > 0){
			students[this.students.length - this.freePlaces] = s;
			this.freePlaces--;
		}
		else{
			System.out.println("The student can't be added in this group!");
		}
	}
	
	void emptyGroup(){
		for(int i=0; i<this.students.length; i++){
			this.students[i] = null;
		}
		this.freePlaces = this.students.length;
	}
	
	String theBestStudent(){
		if(this.students[0] == null){
			return "This group is empty!";
		}
			
		int indexOfBestStudent = 0;
		double bestGrade = this.students[0].getGrade();
		
		for(int i=0; i<this.students.length; i++){
			if(this.students[i] != null && bestGrade < this.students[i].getGrade()){
				bestGrade = this.students[i].getGrade();
				indexOfBestStudent = i;
			}
		}
		
		return this.students[indexOfBestStudent].getName();
		
	}

	void printStudentsInGroup(){
		for(int i=0; i<this.students.length; i++){
			if(this.students[i] != null){
				System.out.println("Name: " + this.students[i].getName() + " Age: " + this.students[i].getAge() + " Subject: " + this.students[i].getSubject() + " Year in college: " + this.students[i].getYearInCollege() + " Is degree: " + this.students[i].isDegree() + " Grade: " + this.students[i].getGrade() + " Money from cholarships: " + this.students[i].getMoney());
			}
		}
	}
	
}
