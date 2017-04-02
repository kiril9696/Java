import java.util.HashSet;

public class Demo {
	
	public static void main(String[] args) {
		
		HashSet<Person> people = new HashSet<>();
		
		people.add(new Student("Name1", 20, true, 4));
		people.add(new Student("Name2", 25, false, 4.90));
		people.add(new Employee("Name3", 40, true, 1000));
		people.add(new Employee("Name4", 29, false, 4000));
		
		for (Person p : people) {
			if(p instanceof Student){
				((Student) p).showStudentInfo();
				System.out.println("======================");
			}
			if(p instanceof Employee){
				((Employee) p).showEmployeeInfo();
				System.out.println("Bonus money: " + ((Employee) p).calculateOvertime(2));
				System.out.println("======================");
			}
		}
		
		
	}

}
  