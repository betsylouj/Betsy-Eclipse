
public class Pasta {
	
	private String pastaType;
	private String sauce;
	
	Pasta(){
		
	}
	
	Pasta(String pastaType,	 String sauce){
		this.pastaType=pastaType;
		this.sauce=sauce;
	}
	
	
	public String getPastaType() {
		return pastaType;
	}
	public void setPastaType(String pastaType) {
		this.pastaType = pastaType;
	}
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public void printPastaDish(){
		System.out.println("You will be served "+pastaType+ " with "+ sauce+ " sauce");
	}
	
	public static void main(String[] args) {
		Pasta spag = new Pasta();
		spag.setPastaType("spaghetti");
		spag.setSauce("marinara");
		spag.printPastaDish();
	
	}

}
