import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {

	JFrame tt = new JFrame("   Typing Tutor    -  Type the letter shown");
	JLabel ttLabel = new JLabel();
	char currentLetter;
	String currentString;
	Date timeAtStart = new Date();
	int numberOfTurns = 0;
	int correctLetters = 0;

	public static void main(String[] args) {
		new TypingTutor().makeFrame();
	}

	private void makeFrame() {
		showLetter();
		ttLabel.setFont(ttLabel.getFont().deriveFont(60.0f));
		ttLabel.setHorizontalAlignment(JLabel.CENTER);

		tt.addKeyListener(this);
		tt.add(ttLabel);
		tt.setSize(400, 150);
		tt.setLocationRelativeTo(null);
		tt.setVisible(true);
		// tt.pack();
	}

	private void showLetter() {
		currentLetter = new TypingTutor().generateRandomLetter();
		System.out.println("Current letter is " + currentLetter + ".");
		currentString = "" + currentLetter;
		ttLabel.setText(currentString);
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
		// int r = new Random().nextInt(26);
		// return (char) (r + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char keyChar = e.getKeyChar();
		System.out.println("You typed " + keyChar + ".");
		if (keyChar == currentLetter) {
			System.out.println("Correct!!!!");
			tt.setBackground(Color.GREEN);
			correctLetters++;
		} else {
			System.out.println("Incorrect. Bad Luck!");
			tt.setBackground(Color.red);
		}
		numberOfTurns++;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (numberOfTurns < 10) {
			System.out.println("Number of turns: " + numberOfTurns);
			showLetter();
		} else {
			ttLabel.setText("");
			showTypingSpeed(numberOfTurns);
			String continuePlay = JOptionPane.showInputDialog("Play again Y/N?");
			if (continuePlay.equalsIgnoreCase("y")){
				showLetter();
				resetCounters();
			}
			else
				System.exit(0);
		}
	}

	private void resetCounters() {
		numberOfTurns = 0;
		timeAtStart = new Date();
		correctLetters = 0;
	}

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "You got " + correctLetters + " correct out of " + numberOfCorrectCharactersTyped
				+ "\nYour typing speed is " + charactersPerMinute + " characters per minute.");
	}
}
