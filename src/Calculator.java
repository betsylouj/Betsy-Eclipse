import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Calculator implements ActionListener {

	JFrame cFrame;
	JPanel cPanel;
	JRadioButton addButton;
	JRadioButton subtractButton;
	JRadioButton multiplyButton;
	JRadioButton divideButton;
	JRadioButton expButton;
	ButtonGroup mathsGroup;
	JTextField number1 = new JTextField(30);
	JTextField number2 = new JTextField(30);
	double answer;
	
	public static void main(String[] args) {
		new Calculator().go();
	}

	private void go() {
	cFrame = new JFrame("Calculator    Please enter your numbers");
	cFrame.setSize(400, 200);
	cFrame.setLocationRelativeTo(null);
	cFrame.setVisible(true);
	cPanel = new JPanel();
	cPanel.add(number1);
	createRadioButtons();
	cPanel.add(addButton);
	cPanel.add(subtractButton);
	cPanel.add(multiplyButton);
	cPanel.add(divideButton);
	cPanel.add(expButton);
	cPanel.add(number2);
	cFrame.add(cPanel);
		
	}
	
	public double add(double a, double b){
		return a+b;
	}
	public double minus(double a, double b){
		return a-b;
	}
	public double multiply(double a, double b){
		return a*b;
	}

	public double divide(double a, double b){
		return a/b;
	}
	public double exp(double a, double b){
		return Math.pow(a, b);
	}
	private void createRadioButtons(){
	    //Create the radio buttons.
	    addButton = new JRadioButton("add");
	    addButton.setMnemonic(KeyEvent.VK_B);
	    addButton.setActionCommand("add");
	    addButton.setSelected(false);

	    subtractButton = new JRadioButton("subtract");
	    subtractButton.setMnemonic(KeyEvent.VK_S);
	    subtractButton.setActionCommand("subtract");
	    
	    multiplyButton = new JRadioButton("multiply");
	    multiplyButton.setMnemonic(KeyEvent.VK_M);
	    multiplyButton.setActionCommand("multiply");

	    divideButton = new JRadioButton("divide");
	    divideButton.setMnemonic(KeyEvent.VK_D);
	    divideButton.setActionCommand("divide");
	    
	    expButton = new JRadioButton("to the power of");
	    expButton.setMnemonic(KeyEvent.VK_P);
	    expButton.setActionCommand("exp");


	    //Group the radio buttons.
	    ButtonGroup mathsGroup = new ButtonGroup();
	    mathsGroup.add(addButton);
	    mathsGroup.add(subtractButton);
	    mathsGroup.add(multiplyButton);
	    mathsGroup.add(divideButton);
	    mathsGroup.add(expButton);

	    //Register a listener for the radio buttons.
	    addButton.addActionListener(this);
	    subtractButton.addActionListener(this);
	    multiplyButton.addActionListener(this);
	    divideButton.addActionListener(this);
	    expButton.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		double double1 = Integer.parseInt(number1.getText());
		double double2 = Integer.parseInt(number2.getText());
		if (e.getActionCommand() == "add"){
			System.out.println(answer = add(double1,double2));
		}
		
	}
	}

