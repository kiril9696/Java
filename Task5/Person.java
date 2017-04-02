
public abstract class Person {
	
	private String name;
	private int age;
	private boolean isMale;
	
	public Person(String name, int age, boolean isMale) {
		if(name != null && !name.isEmpty() && age >= 0 && age <= 200){
			this.name = name;
			this.age = age;
			this.isMale = isMale;
		}
		else{
			System.out.println("Invalid name or age!");
		}
	}
	
	
	
	public int getAge() {
		return age;
	}



	void showPersonInfo(){
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		
		System.out.print("Gender: ");
		if(this.isMale){
			System.out.println("Man");
		}
		else{
			System.out.println("Woman");
		}
		
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	

}
