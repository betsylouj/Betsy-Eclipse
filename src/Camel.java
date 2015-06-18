public class Camel {

	String camelColor;
	int numberOfHumps;
	
	static int camelPopulation;

	Camel(String camelColor, int numberOfHumps) {
		this.camelColor = camelColor;
		this.numberOfHumps = numberOfHumps;
		
		camelPopulation++;
	}
	 void spit()
	 {
		System.out.println(camelColor + " camel is spiting"); 
	 }
	 void walk()
	 {
		 System.out.println("walk");
	 }
	public static void bomb() {
		// TODO Auto-generated method stub
		
	}

}
