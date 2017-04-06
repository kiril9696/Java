
public class NotepadDemo {
	
	public static void main(String[] args) {
		
		Page[] pages = new Page[10];
		
		for(int i=0; i<pages.length; i++){
			pages[i] = new Page();
		}
	
		pages[0].addTitle("First title");
		pages[0].addText("Text for first page");
		pages[0].printPage();
		pages[0].deleteText();
		pages[0].printPage();
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		
		SimpleNotepad notepad = new SimpleNotepad(pages);
		
		notepad.addTitle("Title", 1);
		notepad.addText("Some text", 1);
		notepad.addText(". More text.", 1);
		notepad.printAllPages();
	
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		
		SecuredNotepad securedNotepad = new SecuredNotepad(pages, "1234");
		
		securedNotepad.changePassword();
		securedNotepad.unlockNotepad();
		securedNotepad.addText("Text", 2);
		securedNotepad.addNewText("New text.", 9);
		securedNotepad.printAllPages();
		
	}

}
