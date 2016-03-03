public class Bacon {

	String style = "streaky";

	Bacon(String style) {
		this.style = style;
	}

	Bacon() {

	}
	
	public static void main(String[] args) {
	System.out.println(new Bacon().style);
	System.out.println(new Bacon("back").style);
	}

}
