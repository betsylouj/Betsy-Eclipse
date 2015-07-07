// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter
{

	JLabel drumLabelWithImage;
	JLabel drumLabel2;

	public static void main(String[] args) throws Exception
	{
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException
	{
		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame drum = new JFrame();
		// 2. Make the frame visible
		drum.setVisible(true);
		// 3. Set the size of the frame
		drum.setSize(600, 600);
		// 4. Set the title of the frame
		drum.setTitle("Drum Kit");
		// 5. Make a JPanel and initialize it.
		JPanel drumPanel = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
		drum.add(drumPanel);
		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "default package".

		// 8. Put the name of your image in a String variable.
		String drumString = "drum-2.jpg";
		// 9. Use the "createLabelImage()" method to initialize the drumImage
		// variable.
		drumLabelWithImage = createLabelImage(drumString);
		// 10. Add the image to the panel
		drumPanel.add(drumLabelWithImage);
		// 11. Set the layout of the panel to "new GridLayout()"
		drumPanel.setLayout(new GridLayout());
		// 12. call the pack() method on the frame
		drum.pack();
		// 13. add a mouse listener to your drumImage.
		drumLabelWithImage.addMouseListener(this);

		drumString = "drum 3.jpeg";
		drumLabel2 = createLabelImage(drumString);
		// 10. Add the image to the panel
		drumPanel.add(drumLabel2);
		// 11. Set the layout of the panel to "new GridLayout()"
		drumPanel.setLayout(new GridLayout());
		// 12. call the pack() method on the frame
		drum.pack();
		// 13. add a mouse listener to your drumImage.
		drumLabel2.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e)
	{
		// 14. When the mouse is clicked, print "mouse clicked"
		System.out.println("Mouse Clicked");

		JLabel drumClicked = (JLabel) e.getSource();
		// 15. Download a drum sound and drop it into your "default package".
		// There are some sounds here: http://bit.ly/drum-sounds or you can also
		// get them from freesound.org
		// 16. If they clicked on the drumImage...
		if (drumClicked == drumLabelWithImage)
			// 17. ...use the playSound method to play a drum sound.
			playSound("drumsound.wav");
		else if (drumClicked == drumLabel2)
			playSound("snaredrum.wav");

		// 18. Add more images to make a drumkit. Remember to add a mouse
		// listener to each one.
	}

	private JLabel createLabelImage(String fileName)
			throws MalformedURLException
	{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null)
		{
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}

		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName)
	{
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
