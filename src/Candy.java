import javax.swing.JOptionPane;


class Candy {

    private String maker;        //e.g. Hershey’s, Willy Wonka

    private boolean isChocolatey;
    private double price; 
    
    
    Candy (String maker, boolean isChocolatey, double price){
    	this.maker = maker;
    	this.isChocolatey = isChocolatey;
    	this.price = price;    	
    }
    
    public static void main(String[] args) {
		new Candy("Cadbury's", true, 1.50).go();
	}

	private void go() {
		String taste;
		if (this.isChocolatey){
			taste = "chocolatey";
		}
		else {
			taste = "not very chocolatey";
		}
		JOptionPane.showMessageDialog(null, "The " + this.maker + " candy bar is " + taste + ". \nIt costs £" + this.price);
		
	}
    
    
    
    
}
