
public class Page {

	private String title = "No title";
	private String text = "";
	
	void addTitle(String title){
		if(title != null && !title.isEmpty()){
			this.title = title;
		}
	}
	
	void addText(String text){
		if(text != null && !text.isEmpty()){
			this.text += text;
		}
	}
	
	void deleteText(){
		this.text = "";
	}
	
	void printPage(){
		System.out.println("Tittle: " + this.title);
		System.out.println("Text: " + this.text);
		System.out.println("=============================");
	}
	
	
}
