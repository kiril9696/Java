
public class College {
	

	public static void main(String[] args) {
		
		Student s1=new Student("Name1", "Computer Science", 4.90, 20);
		Student s2=new Student("Name2", "Computer Science", 4, 21);
		Student s3=new Student("Name3", "Economics", 3, 22);
		Student s4=new Student("Name4", "Statistics", 4.40, 23);
		
		System.out.println(s1.receiveScholarship(4.85, 790));
		s2.upYear();
		
		StudentGroup group=new StudentGroup("Computer Science", 4);
		group.addStudent(s1);
		group.addStudent(s2);
		group.addStudent(s3);
		group.addStudent(s4);
		System.out.println(group.theBestStudent());
	}

}
