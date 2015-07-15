import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CandyMan implements ActionListener {
	
	JFrame cm = new JFrame();
	JPanel cmPanel = new JPanel();
	JTextField cmText = new JTextField("   Beware the CandyMan   ");
	JButton cmButton = new JButton("CandyMan");
	int counter = 0;
	
	public static void main(String[] args) {
		new CandyMan().showUI();
	}

	private void showUI() {
		cmPanel.add(cmText);
		cmText.setBackground(Color.RED);
		cmPanel.add(cmButton);
		cm.add(cmPanel);
		cmButton.addActionListener(this);
		cm.setVisible(true);
		cm.setLocationRelativeTo(null);
		cm.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		counter ++;	
		System.out.println(counter);
		if (counter>=5){
			showPictureFromTheInternet("http://www.funnyhub.com/wp-content/uploads/2014/12/Scary-faces.jpg");
			playSound(0);
		}
	}
	

private void showPictureFromTheInternet(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            Icon icon = new ImageIcon(url);
            JLabel imageLabel = new JLabel(icon);
            JFrame frame = new JFrame();
            frame.add(imageLabel);
            frame.setVisible(true);
            frame.setLocation(200, 100);
            frame.pack();
            System.out.println("Be very afraid");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
}
        
static final int CREEPY = 0;
    static final int SCREAM = 1;    

public static void playSound(int whichSound) {
	System.out.println("Boo");
    File soundFile = null;
        if (whichSound == CREEPY)
            soundFile = new File(
                    "/Users/Guest/Google Drive/LeagueStuff/league-sounds/creepy-noise.wav");
        else if (whichSound == SCREAM)
            soundFile = new File(
                    "/Users/Guest/Google Drive/LeagueStuff/league-sounds/scream.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem
                    .getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(3400);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
    }


    }

