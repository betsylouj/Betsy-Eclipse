
// Copyright Wintriss Technical Schools 2013

import java.awt.TextField;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JTextField;


public class BinaryConverterSolution implements ActionListener {


    JTextField entry = new JTextField(20);

    JTextField answer = new JTextField(20);


    public static void main(String[] args) {

        // 011000110110000

       // System.out.println(new BinaryConverter().convert("01110100"));


        new BinaryConverterSolution().createUI();

    }


    private void createUI() {

        JFrame frame = new JFrame();

        JPanel panel = new JPanel();

        frame.setTitle("Give me binary or give me death!");

        panel.add(entry);

        JButton convertButton = new JButton("convert");

        convertButton.addActionListener(this);

        panel.add(convertButton);


        panel.add(answer);


        frame.add(panel);

        frame.setVisible(true);

        frame.pack();

    }


    String convert(String binary) {

        int asciiValue = Integer.parseInt(binary, 2);

        char theLetter = (char) asciiValue;

        return "" + theLetter;

    }


    @Override

    public void actionPerformed(ActionEvent arg0) {

        System.out.println(entry.getText());

        answer.setText(convert(entry.getText()));


    }

}



