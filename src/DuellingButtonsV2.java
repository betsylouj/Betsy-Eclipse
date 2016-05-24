import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuellingButtonsV2 implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	Dimension BIG = new Dimension(600,600);
	Dimension MEDIUM = new Dimension(200,200);
	Dimension SMALL = new Dimension(100,100);
	

	public static void main(String[] args) {
		new DuellingButtonsV2().go();
	}

	private void go() {
		button1.setText("Click me!");
		button2.setText("Click me!");
		button1.setPreferredSize(MEDIUM);
		button2.setPreferredSize(MEDIUM);
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			button1.setPreferredSize(SMALL);
			button1.setText("Click me!");
			button2.setPreferredSize(BIG);
			button2.setText("No, Click me!");
			frame.pack();
		}
		else {
			button2.setPreferredSize(SMALL);
			button2.setText("Click me!");
			button1.setPreferredSize(BIG);
			button1.setText("No, Click me!");	
			frame.pack();
		}

	}

}
