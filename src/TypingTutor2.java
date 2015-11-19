import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class TypingTutor2 {
	
	JFrame frame;
	JLabel jlabel;
	char currentLetter;
	
	public static void main(String[] args) {
		new TypingTutor2().startTyping();
		
	}
	
	void startTyping(){
		createFrame();
		currentLetter = generateRandomLetter();
		jlabel = new JLabel();
		jlabel.setText("" + currentLetter);

jlabel.setFont(jlabel.getFont().deriveFont(28.0f));
jlabel.setHorizontalAlignment(JLabel.CENTER);
frame.add(jlabel);

	}

	private void createFrame() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Type or Die");
		frame.setSize(400, 200);
	}
	

char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}


}
