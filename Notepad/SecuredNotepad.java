import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	Scanner sc = new Scanner(System.in);
	
	private String password;
	private String enteredPassword;
	
	public SecuredNotepad(Page[] pages, String password) {
		super(pages);
		
		if(password != null && !password.isEmpty()){
			this.password = password;
		}
		else{
			System.out.println("Please put password to your notepad!");
		}	
	}
	
	void unlockNotepad(){
		if(this.password != null){
			do{
				System.out.println("Please enter password to unlock this notepad: ");
				
				this.enteredPassword = sc.next();
				
				if(!this.password.equals(this.enteredPassword)){
					System.out.println("Wrong password! Try again!");
				}
			} while(!this.password.equals(this.enteredPassword));
		}
	}
	
	void changePassword(){
		if(this.password != null){
			do{
				System.out.println("Please enter old password: ");
				
				this.enteredPassword = sc.next();
				
				if(!this.password.equals(this.enteredPassword)){
					System.out.println("Wrong password! Try again!");
				}
				
			} while(!this.password.equals(this.enteredPassword));
			
			System.out.println("Enter new password: ");
			
			this.password = sc.next();
		}
	}
	
	
	private boolean isUnlocked(){
		if(this.password != null){
			return this.password.equals(this.enteredPassword);
		}
		return false;
	}
	
	@Override
	public void addTitle(String title, int numberOfPage) {
		if(this.isUnlocked()){
			super.addTitle(title, numberOfPage);
		}
	}
	
	@Override
	public void addText(String text, int numberOfPage) {
		if(this.isUnlocked()){
			super.addText(text, numberOfPage);
		}
	}
	
	@Override
	public void addNewText(String text, int numberOfPage) {
		if(this.isUnlocked()){
			super.addNewText(text, numberOfPage);
		}
	}

	@Override
	public void deleteAllText(int numberOfPage) {
		if(this.isUnlocked()){
			super.deleteAllText(numberOfPage);
		}
	}
	
	@Override
	public void printAllPages() {
		if(this.isUnlocked()){
			super.printAllPages();
		}
	}
}
