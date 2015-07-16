public class MakeTea {

	public static void main(String[] args) {
		new MakeTea().go();
	}

	/* Figure out how to make a cup of tea using the classes below */

	private void go() {
		TeaBag myTeaBag = new TeaBag("English Breakfast");
		Kettle myKettle = new Kettle();
		myKettle.boil();
		new Cup().makeTea(myTeaBag, myKettle.getWater());
	}
}

class TeaBag {
	public final static String GREEN = "Green";
	public final static String MINT = "Mint";
	public final static String CHAMOMILE = "Chamomile";
	public final static String PASSION_FRUIT = "Passion Fruit";
	//public final static String ENGLISH = "English Breakfast";

	private String flavor;

	TeaBag(String flavor) {
		this.flavor = flavor;
	}

	String getFlavor() {
		return flavor;
	}
}

class Kettle {
	private Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {
		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}
}

class Cup {

	private TeaBag teabag;

	void makeTea(TeaBag teabag, Kettle.Water hotWater) {
		this.teabag = teabag;
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}
}
