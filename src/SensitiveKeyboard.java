import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener {
	JFrame sk = new JFrame("I'm sensitive - don't touch me  ");

	public static void main(String[] args) {
		new SensitiveKeyboard().sayOuch();
	}

	void sayOuch() {
		sk.addKeyListener(this);
		sk.setLocationRelativeTo(null);
		sk.setVisible(true);
		sk.setSize(350,50);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Ouch");
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
