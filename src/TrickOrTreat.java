import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TrickOrTreat implements ActionListener {
	JFrame tot ;
	JPanel totPanel;
	
	JButton totButton1 ;
	JButton totButton2 ;
	
	public static void main(String[] args) {
		new TrickOrTreat().start();
	}

	private void start() {
		tot = new JFrame();
		totPanel = new JPanel();		
		totButton1 = new JButton("Trick");
		totButton2 = new JButton("Treat");
		totButton1.addActionListener(this);
		totButton2.addActionListener(this);
		totButton1.setFont(totButton1.getFont().deriveFont(30.0f));
		totButton2.setFont(totButton2.getFont().deriveFont(30.0f));
		totPanel.add(totButton1);
		totPanel.add(totButton2);
		tot.add(totPanel);
		tot.setLocationRelativeTo(null);
		tot.setVisible(true);
		tot.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonText = ((JButton) e.getSource()).getText();
		tot.dispose();
		if (buttonText .equals("Trick")){
			System.out.println("Trick");
			showPictureFromTheInternet("http://www.videogamerater.com/wp-content/uploads/2014/09/pc-games-free-download-scary-8.jpg");
		playSound("Boo.wav");
		}
		else{
			System.out.println("Treat");
			showPictureFromTheInternet("http://hdwimg.com/wp-content/uploads/2015/06/29/Dancing-Little-Animals-Puppy-Wallpaper.jpg");
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
            frame.pack();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
private void playSound(String fileName) {
	System.out.println("Sound");
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}
}
