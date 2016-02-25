
public class Person {
	
	String name = "John";
	String superpower;
	
	public Person(){
		
	}
	
	public Person (String name, String superpower){
		this.name = name;
		this.superpower = superpower;		
	}

	String getName(){
		return this.name;
	}
}
