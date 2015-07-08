import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FortuneCookie implements ActionListener {
	
	public static void main(String[] args) {
		FortuneCookie cookie = new FortuneCookie();
		cookie.showButton();
	}
	
	void showButton () {
		
		JFrame cookieFrame = new JFrame();
		cookieFrame.setVisible(true);
		JButton cookieButton = new JButton("cookieButton");
		cookieButton.addActionListener(this);
		cookieFrame.add(cookieButton);
		cookieFrame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int choice = new Random().nextInt(5);
		System.out.println(choice);
		String fortune;
		switch (choice){
		case 0: fortune = "Good luck";
		break;
		case 1: fortune = "Happiness";
		break;
		case 2: fortune = "Money";
		break;
		case 3: fortune = "Love";
		break;
		case 4: fortune = "Determination";
		break;
		default: fortune = "Sorrow";
		break;
		}
		JOptionPane.showMessageDialog(null, "Your fortune is " + fortune);
		
		
	}
	
	
}
