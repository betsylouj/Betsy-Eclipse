public class Unicorn {
int horns;
	private Unicorn() {
		this.horns = 1;
	}
	
	public static void main(String[] args) {
		System.out.println( new Unicorn().horns);
	}

}