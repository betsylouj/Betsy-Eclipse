
// Copyright Wintriss Technical Schools 2013

/* 

 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g

 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.

 * 

 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.

 * 6. Make a Smurfette and print her name, hat color and girl or boy. */


public class Smurf {

	
	
    private String name;


    Smurf(String name) {

        this.name = name;

    }
    
	public static void main(String[] args) {
		String myName,hatColor,gender;
		
		Smurf smurf1 = new Smurf("Fred");
		myName = smurf1.getName();
		smurf1.eat();
		hatColor = smurf1.getHatColor();
		gender = smurf1.isGirlOrBoy();
		System.out.println(myName+hatColor+gender);
		
		Smurf papa = new Smurf("Papa");
		myName = papa.getName();
		hatColor = papa.getHatColor();
		gender = papa.isGirlOrBoy();
		System.out.println(myName+hatColor+gender);	
		
		Smurf smurfette = new Smurf("Smurfette");
		myName = smurfette.getName();
		hatColor = smurfette.getHatColor();
		gender = smurfette.isGirlOrBoy();
		System.out.println(myName+hatColor+gender);	
	}



    public String getName() {

        return "My name is " + name + " Smurf. ";

    }


    public void eat() {

        System.out.println(name + " Smurf is eating Smurfberries.");

    }


    /* Papa Smurf wears a red hat, all the others are white. */

    public String getHatColor() {

        // 3. Fill in this method
    	if (this.name .equals("Papa")){
    		return "My hat is red. ";
    	}
    	else {
          return "My hat is white. ";
    	}
    }


    /* Smurfette is the only female Smurf. */

    public String isGirlOrBoy() {

        // 4. Fill in this method
    	if (this.name .equals("Smurfette")){
    		return "I am a girl. ";
    	}
    	else {
          return "I am a boy. ";
    	}

    }
    
   
}




