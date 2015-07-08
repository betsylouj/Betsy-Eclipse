import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ChuckleClicker implements ActionListener {
	
	Dimension BUTTONSIZE = new Dimension(200,200);
	JPanel ccPanel = new JPanel();
	JButton ccButton1 = new JButton();
	JButton ccButton2 = new JButton();
	
//	public static void main(String[] args) {
//		ChuckleClicker cc = new ChuckleClicker();
//		cc.makeButtons();
//	}
	
	 void makeButtons()
	{
		JOptionPane.showMessageDialog(null, "makeButtons method");
		
		JFrame ccFrame = new JFrame();
		ccFrame.setSize(1000, 800);//doesn't make any difference unless you take out pack
		ccFrame.setVisible(true);
						
		ccButton1.setPreferredSize(BUTTONSIZE);
		ccButton1.setText("Joke");
		ccButton1.addActionListener(this);
		
		ccButton2.setPreferredSize(BUTTONSIZE);
		ccButton2.setText("Punchline");
		ccButton2.addActionListener(this);
		
		ccPanel.add(ccButton1);
		ccPanel.add(ccButton2);
		ccFrame.add(ccPanel);
		
		ccFrame.pack();
	}
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "Hi");

if(arg0.getSource() == ccButton1)
{
	JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
}

else if(arg0.getSource() == ccButton2)
{
	JOptionPane.showMessageDialog(null, "To get to the other side!!");
}


	}
	
}
