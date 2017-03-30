
public class Computer {

	private final int year;
	private double price;
	private boolean isNotebook;
	private int hardDiskMemory;
	private int freeMemory;
	private String operatingSystem;
	
	
	
	public Computer(int year, double price, boolean isNotebook, int hardDiskMemory, int freeMemory,
			String operationSystem) {
		if(year >= 1940 && year <= 2017 && price >= 0 && price < 100_000 && hardDiskMemory > 0 && hardDiskMemory < 4000 && freeMemory >= 0
				&& freeMemory < hardDiskMemory && operationSystem != null && !operationSystem.isEmpty()){
			this.year = year;
			this.price = price;
			this.isNotebook = isNotebook;
			this.hardDiskMemory = hardDiskMemory;
			this.freeMemory = freeMemory;
			this.operatingSystem = operationSystem;
		}
		else{
			this.year = 1940;
			System.out.println("Incorrect input!");
		}
	}

	void changeOperationSystem(String newOperatingSystem){
		if(newOperatingSystem != null && !newOperatingSystem.isEmpty()){
			if(!this.operatingSystem.equals(newOperatingSystem)){
				this.operatingSystem = newOperatingSystem;
			}
			else{
				System.out.println("Choose different operating system");
			}
		}
		else{
			System.out.println("Incorrect input");
		}
	}
	
	void useMemory(int memory){
		if(this.freeMemory >= memory){
			this.freeMemory -= memory;
		}
		else{
			System.out.println("Not enough free memory!");
		}
	}
	
	void showComputerInfo(){
		System.out.println("Year: " + this.year);
		System.out.println("Price: " + this.price);
		System.out.println("Is notebook: " + this.isNotebook);
		System.out.println("Hard disk memory: " + this.hardDiskMemory);
		System.out.println("Free memory: " + this.freeMemory);
		System.out.println("Operating system: " + this.operatingSystem);
	}
	
}
