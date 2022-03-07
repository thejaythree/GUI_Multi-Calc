package com.PRGA2;
/*
 * Course:       TCSS 305A - Fall 2021
 * Name:         Johnny Heredia III
 * Instructor:   Professor Dincer
 * Assignment:   Programming Assignment 2
 * File Name:    hexadecimalCalc.java
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * binary calculator that processes the window
 * for the calculator and its math functions
 */
public class hexadecimalCalc extends Calculator implements hexadecimalConverter {
    /**
     * String value for x in hexadecimal form
     */
    String xValue;
    /**
     * String value for y in hexadecimal form
     */
    String yValue;
    /**
     * String value for answer in hexadecimal form
     */
    String answer;
    /**
     * int decimal form of x value
     */
    int decX;
    /**
     * int decimal form of y value
     */
    int decY;
    /**
     * int decimal form of answer
     */
    int decAnswer;
    /**
     * int decimal form of x value
     */
    double divAnswer;
    /**
     * in the event of division double
     * value for the answer
     */
    String operator;
    /**
     * Constructor method for calculator that generates the majority
     * of the window.
     * @param mainPanel to access the windows panel to make edits
     */
    public hexadecimalCalc(JPanel mainPanel) {
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
                        xValue = xTextDisplay.getText();
                        decX = toDecimal(xValue);
                        yValue = yTextDisplay.getText();
                        decY = toDecimal(yValue);
                        decAnswer = add(decX, decY);
                        answer = tohexadecimal(decAnswer);
                        operator = "+";
                        answerText.setText(hexadecimalCalc.this.toString());
                    }
                });

        buttonMinus.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xValue = xTextDisplay.getText();
                        decX = toDecimal(xValue);
                        yValue = yTextDisplay.getText();
                        decY = toDecimal(yValue);
                        decAnswer = subtract(decX, decY);
                        answer = tohexadecimal(decAnswer);
                        operator = "-";
                        answerText.setText(hexadecimalCalc.this.toString());
                    }
                });

        buttonMultiply.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xValue = xTextDisplay.getText();
                        decX = toDecimal(xValue);
                        yValue = yTextDisplay.getText();
                        decY = toDecimal(yValue);
                        decAnswer = multiply(decX, decY);
                        answer = tohexadecimal(decAnswer);
                        operator = "*";
                        answerText.setText(hexadecimalCalc.this.toString());
                    }
                });

        buttonDivide.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xValue = xTextDisplay.getText();
                        decX = toDecimal(xValue);
                        yValue = yTextDisplay.getText();
                        decY = toDecimal(yValue);
                        divAnswer = divide(decX, decY);
                        operator = "/";
                        answerText.setText(hexadecimalCalc.this.toString());
                    }
                });
    }
    /**
     * conversion from hex form to decimal form
     * @param hexadecimalValue the hex number to be converted
     * @return the decimal form of the hex number
     */
    @Override
    public int toDecimal(String hexadecimalValue) {
        return Integer.parseInt(hexadecimalValue, 16);
    }
    /**
     * converting a decimal number to its hex form
     * @param decimalValue the decimal form of a hex number
     * @return hex form of decimal number
     */
    @Override
    public String tohexadecimal(int decimalValue) {
        String result = "";
        if (decimalValue < 0) {
            decimalValue = Math.abs(decimalValue);
            result = "-" + Integer.toHexString(decimalValue);
        } else {
            result = Integer.toHexString(decimalValue);
        }
        return result;
    }
    /**
     * toString method to print out the result of the calculator
     * in a readable manner
     * @return string of calculation
     */
    @Override
    public String toString() {
        String s = "Hexadecimal Calculation:\n";
        s += xValue + operator + yValue + "=";
        if (operator.equals("/")) {
            s += (Long.toHexString((long) divAnswer));
        } else {
            s += answer;
        }
        s += "\n Decimal form calculation:\n";
        s += decX + operator + decY + "=";
        if (operator.equals("/")) {
            s += divAnswer;
        } else {
            s += decAnswer;
        }
        return s;
    }
}