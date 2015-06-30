
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.HashMap;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;


public class SimonSays extends KeyAdapter {

    // 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame simonFrame = new JFrame();

    HashMap<Integer,String> images = new HashMap<Integer, String>();

    private int imageIndex;
    private int tries = 0;
    private int score = 0;

    private  void makeAlbum() {

        // 2. add 4 images which match keyboard keys like this: images.put(new Integer(KeyEvent.VK_UP), "image.jpg");

    	images.put(new Integer(KeyEvent.VK_UP), "upArrow.jpg");
    	images.put(new Integer(KeyEvent.VK_DOWN), "downArrow.png");
    	images.put(new Integer(KeyEvent.VK_LEFT), "leftArrow.jpg");
    	images.put(new Integer(KeyEvent.VK_RIGHT), "rightArrow.jpg");
        // 3. call the method to show an image
    	showImage();

    }


    public void keyPressed(KeyEvent e) {

        int keyCode = e.getKeyCode();

        //11. increment tries by 1
       tries = tries+1;

        //12. if tries is greater than 9 (or however many you want)
if (tries>9)
{
	JOptionPane.showMessageDialog(null, "You scored "+score+ " out of 10");
	System.exit(0);
}
        //13.        exit the program

if (keyCode == imageIndex)
{
	JOptionPane.showMessageDialog(null, "You got a point");
	score = score + 1;
}
        //14. if the keyCode matches the imageIndex

        //15.        tell them they got a point

        

        //9. dispose of the frame
simonFrame.dispose();        

        //10. call the method to show an image
showImage();

    }



    private void showImage() {

        //4. initialize your frame to a new JFrame()
    	simonFrame = new JFrame();

        //5. set the frame to visible
    	simonFrame.setVisible(true);
      	simonFrame.add(getNextRandomImage()); //6. rename to the name of your frame
        
        // 7. set the size of the frame  
      	simonFrame.setSize(800, 600);
        
        // 8. add a key listener to the frame
      	simonFrame.addKeyListener(this);
      	speak("press the Up key");
    }


    private Component getNextRandomImage() {

        this.imageIndex = new Random().nextInt(4) + 37;

        return loadImage(images.get(imageIndex));

    }


    private JLabel loadImage(String fileName) {

        URL imageURL = getClass().getResource(fileName);

        Icon icon = new ImageIcon(imageURL);

        return new JLabel(icon);

    }
    static void speak(String words) {

        try {

            Runtime.getRuntime().exec("say " + words).waitFor();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }


    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null, "Press the matching key when 'Simon says' otherwise press a different key");
    	new SimonSays().makeAlbum();

    }

}


/* 16. make a points variable to track the score. tell the user their score at the end.

* 

* 17. add a timer

* ~~~ where the code starts running ~~~

* Date timeAtStart = new Date();

* 

* ~~~ where the code ends ~~~

* Date timeAtEnd = new Date();

* System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);

* System.exit(0);

*/




