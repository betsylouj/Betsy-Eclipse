
// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Component;

import java.awt.GridLayout;

import java.awt.Toolkit;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.net.URL;


import javax.swing.BoxLayout;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import javax.swing.JApplet;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;


/* This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4 */


public class JeopardySolution implements ActionListener {

    private JButton firstButton;

    private JButton secondButton;

    private JButton thirdButton, fourthButton;

    

    private JPanel quizPanel;

    int score = 0;

    JLabel scoreBox = new JLabel("0");

    int buttonCount = 0;

    //int numberOfTopics = 2;


    public static void main(String[] args) {

        new JeopardySolution().start();

    }


    private void start() {

        JFrame frame = new JFrame();

        quizPanel = new JPanel();

        frame.setLayout(new BorderLayout());

        

        // 1. Make the frame show up

        frame.setVisible(true);

        // 2. Give your frame a title

        frame.setTitle("June's Jeopardy for Geniuses");

        // 3. Create a Component variable to hold the header using the createHeading method

        Component header = createHeader("Science & Technology");

        // 4. Add the header component to the quizPanel

        quizPanel.add(header);

        // 5. Add the quizPanel to the frame

        frame.add(quizPanel);

        

        // 6. Use the firstButton variable to hold a button using the createButton method

        firstButton = createButton("$200");

        // 7. Add the firstButton to the quizPanel

        quizPanel.add(firstButton);

        // 8. Implement createButton() method below. Check that your game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.

        

        // 9. Use the secondButton variable to hold a button using the createButton method

        secondButton = createButton("$400");

        // 10. Add the secondButton to the quizPanel

        quizPanel.add(secondButton);

        

        // 11. Add an action listeners to the buttons (2 lines of code)

        firstButton.addActionListener(this);

        secondButton.addActionListener(this);

        // 12. Implement the actionPerformed() method

        

        

        frame.pack();

        quizPanel.setLayout(new GridLayout(buttonCount+1, 3));

        frame.add(makeScorePanel(), BorderLayout.NORTH);

        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height, Toolkit.getDefaultToolkit().getScreenSize().width);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    /*

     * 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions 

     * 

     * [optional] Use the showImage or playSound methods when the user answers a question 

     * [optional] Add new topics for the quiz

     */

    

    private JButton createButton(String dollarAmount) {

        // Create a new JButton

        JButton button = new JButton();

        // Set the text of the button to the dollarAmount

        button.setText(dollarAmount);

        // Increment the buttonCount (this should make the layout vertical)

        buttonCount++;

        // Return your new button instead of the temporary button

        return button;

        //return new JButton("temporary button");

    }


    public void actionPerformed(ActionEvent arg0) {

        // Remove this temporary message:

        // JOptionPane.showMessageDialog(null,"pressed " + ((JButton)arg0.getSource()).getText() + " button");


        JButton buttonPressed = (JButton) arg0.getSource();

        // If the buttonPressed was the firstButton

        if(buttonPressed == firstButton){

            // Call the askQuestion() method

            askQuestion("why is the sky blue?", "just", 200);

            // Implement the askQuestion() method. When you play the game, the score should change.

        }

        // Or if the buttonPressed was the secondButton

        else if (buttonPressed == secondButton){

            // Call the askQuestionRecipe with a harder question

            askQuestion("why are we here?", "coz", 400);

        }

        // Clear the button text (set the button text to nothing)

        buttonPressed.setText("");

    }


    private void askQuestion(String question, String correctAnswer, int prizeMoney) {

        // Remove this temporary message

        JOptionPane.showMessageDialog(null, "this is where the question will be asked");

        // Use a pop up to ask the user the question

        String answer = JOptionPane.showInputDialog(null, question);

        // If the answer is correct

        if(answer.equals(correctAnswer)){

            // Increase the score by the prizeMoney

            score = score + prizeMoney;

            // Call the updateScore() method

            updateScore();

            // Pop up a message to tell the user they were correct

            JOptionPane.showMessageDialog(null, "correct!");

            showCorrectImage();

        }

        // Otherwise

        else {

            // Decrement the score by the prizeMoney

            score = score - prizeMoney;

            // Pop up a message to tell the user the correct answer

            JOptionPane.showMessageDialog(null, "wrong! the correct answer is " + correctAnswer);

            // Call the updateScore() method

            updateScore();

        }

    }


    private void playSound(String fileName) {

        AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));

        scream.play();

    }


    private Component makeScorePanel() {

        JPanel panel = new JPanel();

        panel.add(new JLabel("score:"));

        panel.add(scoreBox);

        panel.setBackground(Color.CYAN);

        return panel;

    }


    private void updateScore() {

        scoreBox.setText("" + score);

    }


    private Component createHeader(String topicName) {

        JPanel panelj = new JPanel();

        panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));

        JLabel l1 = new JLabel(topicName);

        l1.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelj.add(l1);

        return panelj;

    }


    void showCorrectImage() {

        showImage("256337_3815809148313_2037592374_o.jpg");

    }


    void showIncorrectImage() {

        showImage("incorrect.jpg");

    }


    private void showImage(String fileName) {

        JFrame frame = new JFrame();

        URL imageURL = getClass().getResource(fileName);

        Icon icon = new ImageIcon(imageURL);

        JLabel image = new JLabel(icon);

        frame.add(image);

        frame.setVisible(true);

        frame.pack();

    }

}


