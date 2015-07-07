import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;


public class Houses2 {
	public static void main(String[] args) {
		Tortoise.setX(50);
		Tortoise.setY(350);
		Tortoise.setSpeed(10);
		Tortoise.setAnimal(Animals.Unicorn);
		drawHouse("MEDIUM", "RED", "POINTY");
		drawHouse("BIG", "PURPLE", "FLAT");
		drawHouse("SMALL", "BLUE", "POINTY");
		drawHouse("MEDIUM","LILAC", "FLAT");
		drawHouse("SMALL", "GREEN", "POINTY");
		drawHouse("MEDIUM", "AQUA", "FLAT");
		drawHouse("SMALL", "RED", "POINTY");
		drawHouse("BIG", "PURPLE", "FLAT");
		drawHouse("MEDIUM", "GREEN", "FLAT");
	}

	private static void drawHouse(String size, String color, String roof ) {
		int height;
		if (size .equals ("BIG"))
			height = 250;
		else if (size .equals ("MEDIUM"))
			height = 120;
		else if (size .equals ("SMALL"))
			height = 60;
		else 
			height = 100;

		if (color .equals("RED"))
				Tortoise.setPenColor(PenColors.Reds.Crimson);
		else if (color .equals("PURPLE"))
			Tortoise.setPenColor(PenColors.Purples.MediumPurple);
		else if (color .equals("BLUE"))
			Tortoise.setPenColor(PenColors.Blues.Blue);
		else if (color .equals("LILAC"))
			Tortoise.setPenColor(PenColors.Purples.Violet);
		else if (color .equals("GREEN"))
			Tortoise.setPenColor(PenColors.Greens.LightGreen);
		else if (color .equals("AQUA"))
			Tortoise.setPenColor(PenColors.Blues.Aqua);
		
		Tortoise.move(height);
		int choice = new Random().nextInt(2);
		System.out.println(choice);
		if (choice == 0)
			drawPointRoof();
		else
			drawFlatRoof();
				
		/*if (roof .equals("POINTY"))
		drawPointRoof();
		else
			drawFlatRoof();*/
		
		Tortoise.move(height);
		Tortoise.turn(-90);
		Tortoise.setPenColor(PenColors.Greens.DarkGreen);
		Tortoise.move(50);
		Tortoise.turn(-90);
	}

	private static void drawPointRoof() {
		Tortoise.turn(45);
		Tortoise.move(35);
		Tortoise.turn(90);
		Tortoise.move(35);
		Tortoise.turn(45);
	}
	private static void drawFlatRoof() {
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
		
	}

}
