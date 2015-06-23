
public class CamelCreator {
	
	public  void main(String[] args) {
		Camel fred = new Camel("brown",2);
		fred.spit();
		
		Camel jane = new Camel("purple",2);
		jane.spit();
		
		System.out.println(fred.camelPopulation);
		
		
	}

}
