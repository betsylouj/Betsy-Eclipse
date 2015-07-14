import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {

	JFrame bcFrame = new JFrame("Type in a binary to convert");
	JPanel bcPanel = new JPanel();
	JTextField answerInt = new JTextField(20);
	JTextField answerAsc = new JTextField(20);
	JTextField question = new JTextField(20);
	JButton convertButton = new JButton("convert to integer & Ascii");

	public static void main(String[] args) {
		BinaryConverter bc = new BinaryConverter();
		bc.makePanel();
	}

	void makePanel() {
		bcFrame.setVisible(true);
		bcPanel.add(question);
		bcPanel.add(convertButton);
		bcPanel.add(answerInt);
		bcPanel.add(answerAsc);
		bcFrame.add(bcPanel);
		bcFrame.pack();
		convertButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource() == convertButton) {
			String questionString = question.getText();
			int answernumber = convert(questionString);
			answerInt.setText(""+answernumber);
			if (answernumber >= 0 && answernumber<=255){
				JOptionPane.showMessageDialog(null, "Finding Ascii for "+answernumber);
				char theLetter = (char) answernumber;
				System.out.println(theLetter);
				answerAsc.setText(""+theLetter);
			}
			else
				JOptionPane.showMessageDialog(null, "This does not convert to an Ascii character");
				answerAsc.setText("");
			
		}
		else {
		}
	}

	int convert(String binary) {
		try{
		int asciiValue = Integer.parseInt(binary, 2);
		return  asciiValue;
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			question.setText("");
			
			return 0;
		}
	}

}
