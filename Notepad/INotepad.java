
public interface INotepad {

	void addTitle(String title, int numberOfPage);
	
	void addText(String text, int numberOfPage);
	
	void addNewText(String text, int numberOfPage);
	
	void deleteAllText(int numberOfPage);
	
	void printAllPages();
}
