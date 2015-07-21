
public class Calculator {

	
	public static void main(String[] args) {
		new Calculator().go();
	}

	private void go() {
		
		
	}
	
	public double add(double a, double b){
		return a+b;
	}
	public double minus(double a, double b){
		return a-b;
	}
	public double multiply(double a, double b){
		return a*b;
	}

	public double divide(double a, double b){
		return a/b;
	}
	public double exp(double a, double b){
		return Math.pow(a, b);
	}
}
