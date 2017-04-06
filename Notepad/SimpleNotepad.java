
public class SimpleNotepad implements INotepad{
	
	private Page[] pages;

	public SimpleNotepad(Page[] pages) {
		if(pages != null){
			this.pages = pages;
		}
		else{
			System.out.println("No pages!");
		}
	}
	
	private boolean isValidNumberOfPage(int numberOfPage){
		if(this.pages != null && this.pages.length >= numberOfPage && numberOfPage >= 1){
			return true;
		}
		return false;
	}

	@Override
	public void addTitle(String title, int numberOfPage) {
		if(title != null && isValidNumberOfPage(numberOfPage)){
			this.pages[numberOfPage - 1].addTitle(title);
		}
	}

	@Override
	public void addText(String text, int numberOfPage) {
		if(text != null && isValidNumberOfPage(numberOfPage)){
			this.pages[numberOfPage - 1].addText(text);
		}
	}

	@Override
	public void addNewText(String text, int numberOfPage) {
		if(text != null && isValidNumberOfPage(numberOfPage)){
			this.pages[numberOfPage - 1].deleteText();
			this.pages[numberOfPage - 1].addText(text);;
		}
	}

	@Override
	public void deleteAllText(int numberOfPage) {
		if(isValidNumberOfPage(numberOfPage)){
			this.pages[numberOfPage - 1].deleteText();
		}
	}

	@Override
	public void printAllPages() {
		if(this.pages != null){
			for(int i=0; i<pages.length; i++){
				pages[i].printPage();
			}
		}
	}
		
}
