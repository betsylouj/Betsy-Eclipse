	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class PigLatin implements ActionListener {

		JFrame plFrame = new JFrame("Type in a binary to convert");
		JPanel plPanel = new JPanel();
		JTextField answer = new JTextField(20);
		JTextField question = new JTextField(20);
		JButton convertButton = new JButton("translate to PigLatin");

		public static void main(String[] args) {
			new PigLatin().makePanel();
		}

		void makePanel() {
			plFrame.setVisible(true);
			plPanel.add(question);
			plPanel.add(convertButton);
			plPanel.add(answer);
			plFrame.add(plPanel);
			plFrame.pack();
			convertButton.addActionListener(this);
		}

		public void actionPerformed(ActionEvent arg0) {
			System.out.println(question.getText());
			answer.setText(new PigLatinTranslator().translate(question.getText()));

}
	}
