import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor2 implements KeyListener {

	JFrame frame;
	JLabel jlabel = new JLabel();;
	char currentLetter;
	Date timeAtStart;
	int keysTyped = 0;
	int correctKeys = 0;

	public static void main(String[] args) {
		new TypingTutor2().startTyping();

	}

	void startTyping() {
		createFrame();
		timeAtStart = new Date();
		setLetter();

	}

	private void setLetter() {
		if (keysTyped > 20) {
			showTypingSpeed(correctKeys);
			System.exit(0);
		}
		currentLetter = generateRandomLetter();
		jlabel.setText("" + currentLetter);
		keysTyped++;

	}

	private void createFrame() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Type or Die");
		frame.setSize(400, 200);
		jlabel.setFont(jlabel.getFont().deriveFont(28.0f));
		jlabel.setHorizontalAlignment(JLabel.CENTER);
		frame.add(jlabel);
		frame.addKeyListener(this);
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("You typed " + e.getKeyChar());
		if (e.getKeyChar() == currentLetter) {
			System.out.println("Correct");
			correctKeys++;
			frame.setBackground(Color.GREEN);
		} else {
			System.out.println("Wrong, it should be " + currentLetter);
			frame.setBackground(Color.RED);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

		setLetter();

	}

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is "
				+ charactersPerMinute + " characters per minute.");
	}

}
