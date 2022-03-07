package com.PRGA2;
/*
 * Course:       TCSS 305A - Fall 2021
 * Name:         Johnny Heredia III
 * Instructor:   Professor Dincer
 * Assignment:   Programming Assignment 2
 * File Name:    decimalCalc.java
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * decimal calculator that processes the window
 * for the calculator and its math functions
 */
public class decimalCalc extends Calculator {
    /**
     * double value of x
     */
    double xNum;
    /**
     * double value of y
     */
    double yNum;
    /**
     * double value of answer
     */
    double answer;
    /**
     * String operator of math function
     */
    String operator;
    /**
     * Constructor method for calculator that generates the majority
     * of the window.
     * @param mainPanel to access the windows panel to make edits
     */
    public decimalCalc(JPanel mainPanel) {
        mainPanel.setLayout(new GridLayout(3, 1, 10, 10));

        Color customPurple = new Color(157,141,241);
        Color eggshell = new Color(240, 235, 216);

        var textPanel = new JPanel();
        textPanel.setBackground(customPurple);
        textPanel.setLayout(new GridLayout(2, 2, 10, 10));

        var xTextDisplay = new TextField(10);
        var yTextDisplay = new TextField(10);

        JLabel xLabel = new JLabel("    X");
        xLabel.setFont(new Font("Chivo", Font.PLAIN, 20));
        xLabel.setForeground(Color.WHITE);
        JLabel yLabel = new JLabel("    Y");
        yLabel.setFont(new Font("Chivo", Font.PLAIN, 20));
        yLabel.setForeground(Color.WHITE);

        textPanel.add(xLabel);
        textPanel.add(xTextDisplay);
        textPanel.add(yLabel);
        textPanel.add(yTextDisplay);

        mainPanel.add(textPanel);

        var buttonPanel = new JPanel();
        buttonPanel.setBackground(eggshell);
        buttonPanel.setLayout(new GridLayout(1, 4, 10, 10));
        mainPanel.add(buttonPanel);

        var buttonPlus = new JButton(" X + Y");
        buttonPlus.setBackground(customPurple);
        buttonPlus.setForeground(Color.WHITE);
        buttonPlus.setOpaque(true);
        buttonPlus.setBorderPainted(false);

        var buttonMinus = new JButton("X - Y");
        buttonMinus.setBackground(customPurple);
        buttonMinus.setForeground(Color.WHITE);
        buttonMinus.setOpaque(true);
        buttonMinus.setBorderPainted(false);

        var buttonMultiply = new JButton("X * Y");
        buttonMultiply.setBackground(customPurple);
        buttonMultiply.setForeground(Color.WHITE);
        buttonMultiply.setOpaque(true);
        buttonMultiply.setBorderPainted(false);

        var buttonDivide = new JButton(" X / Y");
        buttonDivide.setBackground(customPurple);
        buttonDivide.setForeground(Color.WHITE);
        buttonDivide.setOpaque(true);
        buttonDivide.setBorderPainted(false);

        buttonPanel.add(buttonPlus);
        buttonPanel.add(buttonMinus);
        buttonPanel.add(buttonMultiply);
        buttonPanel.add(buttonDivide);

        var answerPanel = new JPanel();
        answerPanel.setBackground(customPurple);
        answerPanel.setLayout(new GridLayout(2, 1, 10, 10));
        mainPanel.add(answerPanel);

        answerPanel.add(new JLabel("Answer Below:"));
        var answerText = new TextArea(5, 20);
        answerPanel.add(answerText);

        buttonPlus.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xNum = Double.parseDouble(xTextDisplay.getText());
                        yNum = Double.parseDouble(yTextDisplay.getText());
                        answer = add(xNum, yNum);
                        operator = "+";
                        answerText.setText(decimalCalc.this.toString());
                    }
                });

        buttonMinus.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xNum = Double.parseDouble(xTextDisplay.getText());
                        yNum = Double.parseDouble(yTextDisplay.getText());
                        answer = subtract(xNum, yNum);
                        operator = "-";
                        answerText.setText(decimalCalc.this.toString());

                    }
                });

        buttonMultiply.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xNum = Double.parseDouble(xTextDisplay.getText());
                        yNum = Double.parseDouble(yTextDisplay.getText());
                        answer = multiply(xNum, yNum);
                        operator = "*";
                        answerText.setText(decimalCalc.this.toString());
                    }
                });

        buttonDivide.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xNum = Double.parseDouble(xTextDisplay.getText());
                        yNum = Double.parseDouble(yTextDisplay.getText());
                        answer = divide(xNum, yNum);
                        operator = "/";
                        answerText.setText(decimalCalc.this.toString());
                    }
                });
    }
    /**
     * toString method to print out the result of the calculator
     * in a readable manner
     * @return string of calculation
     */
    @Override
    public String toString() {
        return (xNum + operator + yNum + "=" + answer);
    }
}