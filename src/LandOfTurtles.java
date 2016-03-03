import java.util.Random;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {

	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
		/* 1. Get the panel to show */
		panel.showPanel();
		/* 2. Set the background image of the panel to the Galapagos Islands */
		panel.setBackgroundImage(galapagosIslands);

		/* 3. Instantiate a Turtle and add it to the panel */
		int width = panel.getWidth();
		int height = panel.getHeight();
		System.out.println(width + " , " + height);
		for (int i = 0; i < 50; i++) {
		Turtle t = new Turtle();
		int x = new Random().nextInt(width);
		int y = new Random().nextInt(height);
		System.out.println(x + " , " + y);
		t.setX(x);
		//t.setY(y);
		panel.addTurtle(t);

		/* 4. Put 50 Turtles on the beach. */
		}
	}

}
