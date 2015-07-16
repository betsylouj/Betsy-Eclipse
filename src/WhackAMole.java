import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	Dimension buttonSize = new Dimension(200, 100);
	JFrame wam;
	JPanel wamPanel;
	JButton wamButton;
	String moleText = "  Mole! ";
	int numberGoes = 0;
	int molesWhacked = 0;
	Date timeAtStart = new Date();

	public static void main(String[] args) {
		new WhackAMole().drawButtons(new Random().nextInt(24));
	}

	private void drawButtons(int moleButton) {
		wam = new JFrame("   Whack a Mole!!!  ");
		wamPanel = new JPanel();
		wam.setSize(500, 500);
		wam.setLocationRelativeTo(null);
		for (int i = 0; i < 24; i++) {
			wamButton = new JButton();
			wamButton.setFont(wamButton.getFont().deriveFont(30.0f));
			wamButton.setSize(buttonSize);
			if (i == moleButton) {
				wamButton.setText(moleText);
			} else {
				wamButton.setText("            ");
			}
			wamButton.addActionListener(this);
			wamPanel.add(wamButton);
		}
		wam.add(wamPanel);
		wam.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String chosenText = ((JButton) e.getSource()).getText();
		if (chosenText.equals(moleText)) {
			molesWhacked++;
			playSound("squelch.wav");
		} else {
			speak("idiot");
		}
		wam.dispose();
		numberGoes++;
		if (numberGoes < 10) {
			drawButtons(new Random().nextInt(24));
		} else {
			endGame(timeAtStart, molesWhacked);
			System.out.println(molesWhacked);
		}
	}

	private void speak(String string) {
		System.out.println(string);
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null,"Your whack rate is "
					+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.0 / molesWhacked)+ " moles per second.");
		molesWhacked += 10;
		System.out.println(molesWhacked);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
