import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Houses {

	public static void main(String[] args) {
		Tortoise.setX(10);
		Tortoise.setY(300);
		drawHouse("small", "red");
		drawHouse("large", "green");
		drawHouse("small", "blue");
		drawHouse("medium", "purple");
	}

	private static void drawHouse(String size, String houseColor) {
		int Height1;
		if (size.equals("small"))
			Height1 = 60;
		else if (size.equals("medium"))
			Height1 = 120;
		else
			Height1 = 250;
		if (houseColor.equals("red"))
			Tortoise.setPenColor(PenColors.Reds.Crimson);
		else if (houseColor.equals("green"))
			Tortoise.setPenColor(PenColors.Greens.ForestGreen);
		else if (houseColor.equals("blue"))
			Tortoise.setPenColor(PenColors.Blues.DodgerBlue);
		else if (houseColor.equals("purple"))
			Tortoise.setPenColor(PenColors.Purples.Magenta);

		Tortoise.move(Height1);
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(Height1);
		Tortoise.turn(-90);
		Tortoise.setPenColor(PenColors.Greens.LawnGreen);
		Tortoise.move(50);
		Tortoise.turn(-90);
	}
}
