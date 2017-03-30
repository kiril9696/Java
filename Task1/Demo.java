
public class Demo {
	
	public static void main(String[] args) {
		
		Computer c = new Computer(1999, 1000, false, 900, 800, "Linux");
		
		System.out.println("Computer info: ");
		c.showComputerInfo();
		
		System.out.println("=======================");
		
		
		System.out.println("Computer info after changing operating system: ");
		c.changeOperationSystem("Windows");
		c.showComputerInfo();
		
		System.out.println("=======================");
		
		System.out.println("Computer info after use memory");
		c.useMemory(100);
		c.showComputerInfo();
		
	}

}
