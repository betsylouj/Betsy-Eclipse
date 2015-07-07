// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;



import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FortuneTeller extends JPanel implements Runnable, MouseListener {

    BufferedImage fortuneTellerImage;
    int frameWidth = 800;
    int frameHeight = 661;

    FortuneTeller() throws Exception {
        // 1. Choose an image for your fortune teller and put it in your default package
        fortuneTellerImage = ImageIO.read(getClass().getResource("fortuneTeller.png"));

        // 2. Adjust the frameWidth and frameHeight variables to fit your image nicely (doesn�t need a new line of code)
        // 4. add a mouse listener
   addMouseListener(this);
    }

    static void begin() {
        // 3. Welcome the user. Give them a hint for the secret location.
    	JOptionPane.showMessageDialog(null, "Welcome to the secret fortune teller\n Try to click on the secret location \n Hint: Look near the bottom");
    }

    @Override

    public void mousePressed(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();

        // 5. Print the mouseX variable
        System.out.println(mouseX + "  " + mouseY);

        // 6. Add the mouseY variable to the previous line so that it prints out too (no new line)
        // 7. Adjust your secret location co-ordinates here:
        int secretLocationX = 535;
        int secretLocationY = 512;

        /** If the mouse co-ordinates and secret location are close, we'll let them ask a question. */

        if (areClose(mouseX, secretLocationX) && areClose(mouseY, secretLocationY)) {

            // 8. Get the user to enter a question for the fortune teller
JOptionPane.showInputDialog("Ask the fortune teller a yes/no question");

            // 9. Find a spooky sound and put it in your default package (freesound.org)
            AudioClip sound = JApplet.newAudioClip(getClass().getResource("scarysound.wav"));

            // 10. Play the sound
           sound.play();        
            pause(7);
            System.out.println("After pause");

            // 11. Use the pause() method below to wait until your music has finished
            // 12. Insert your completed Magic 8 ball recipe (http://bit.ly/Zdrf6d) here
            
        	int newNumber = new Random().nextInt(4);
        	System.out.println(newNumber);
       	
        	if (newNumber == 0)
        	{
        		JOptionPane.showMessageDialog(null, "Yes");	
        	}
        	else if (newNumber == 1)
        	{
        		JOptionPane.showMessageDialog(null, "No");	
        	}
        	else if (newNumber == 2)
        	{
        		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");	
        	}
        	else if (newNumber == 3)
        	{
        		JOptionPane.showMessageDialog(null, "Your face");	
        	}
        	else
        		JOptionPane.showMessageDialog(null, "Error!!!!");
        	}	
        }

  private boolean areClose(int mouseX, int secretLocationX) {
        return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
    }

    private void pause(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**************** don't worry about the stuff under here *******************/
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new FortuneTeller());
        begin();
    }

    @Override
    public void run() {
        JFrame frame = new JFrame();
        frame.add(this);
        setPreferredSize(new Dimension(frameWidth, frameHeight));
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

private void showAnotherImage(String imageName) {
        try {
            fortuneTellerImage = ImageIO.read(getClass().getResource(imageName));
        } catch (Exception e) {
            System.err.println("Couldn't find this image: " + imageName);
        }
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(fortuneTellerImage, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}

