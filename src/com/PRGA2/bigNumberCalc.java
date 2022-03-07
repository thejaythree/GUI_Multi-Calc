package com.PRGA2;
/*
 * Course:       TCSS 305A - Fall 2021
 * Name:         Johnny Heredia III
 * Instructor:   Professor Dincer
 * Assignment:   Programming Assignment 2
 * File Name:    bigNumberCalc.java
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
/**
 * This class is the calculator for big integer numbers
 * that does the same functions as the previous calculators
 * with 7 new functions.
 */
public class bigNumberCalc extends Calculator{
    /**
     * BigInteger value for x
     */
    BigInteger xValue;
    /**
     * BigInteger value for y
     */
    BigInteger yValue;
    /**
     * BigInteger value for the answer
     */
    BigInteger answer;
    /**
     * Operator for the math function
     */
    String operator;
    /**
     * Constructor method for calculator that generates the majority
     * of the window.
     * @param mainPanel access to the panel to make edits to the window
     */
    public bigNumberCalc(JPanel mainPanel){
        mainPanel.setLayout(new GridLayout(3, 1, 10, 10));

        Color customPurple = new Color(157,141,241);
        Color eggshell = new Color(240, 235, 216);

        var textPanel = new JPanel();
        textPanel.setBackground(customPurple);
        textPanel.setLayout(new GridLayout(2,2,10,10));

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
        buttonPanel.setLayout(new GridLayout(3, 4, 10, 10));
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

        var buttonPower = new JButton(" X ^ Y");
        buttonPower.setBackground(customPurple);
        buttonPower.setForeground(Color.WHITE);
        buttonPower.setOpaque(true);
        buttonPower.setBorderPainted(false);

        var buttonRoot = new JButton(" Square Root x");
        buttonRoot.setBackground(customPurple);
        buttonRoot.setForeground(Color.WHITE);
        buttonRoot.setOpaque(true);
        buttonRoot.setBorderPainted(false);

        var buttonSquare = new JButton(" X ^ 2");
        buttonSquare.setBackground(customPurple);
        buttonSquare.setForeground(Color.WHITE);
        buttonSquare.setOpaque(true);
        buttonSquare.setBorderPainted(false);

        var buttonFactorial = new JButton(" X!");
        buttonFactorial.setBackground(customPurple);
        buttonFactorial.setForeground(Color.WHITE);
        buttonFactorial.setOpaque(true);
        buttonFactorial.setBorderPainted(false);

        var buttonMOD = new JButton(" MOD");
        buttonMOD.setBackground(customPurple);
        buttonMOD.setForeground(Color.WHITE);
        buttonMOD.setOpaque(true);
        buttonMOD.setBorderPainted(false);

        var buttonGCD = new JButton(" GCD");
        buttonGCD.setBackground(customPurple);
        buttonGCD.setForeground(Color.WHITE);
        buttonGCD.setOpaque(true);
        buttonGCD.setBorderPainted(false);

        var buttonLCM = new JButton(" LCM ");
        buttonLCM.setBackground(customPurple);
        buttonLCM.setForeground(Color.WHITE);
        buttonLCM.setOpaque(true);
        buttonLCM.setBorderPainted(false);

        buttonPanel.add(buttonPlus);
        buttonPanel.add(buttonMinus);
        buttonPanel.add(buttonMultiply);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(buttonPower);
        buttonPanel.add(buttonRoot);
        buttonPanel.add(buttonSquare);
        buttonPanel.add(buttonFactorial);
        buttonPanel.add(buttonMOD);
        buttonPanel.add(buttonGCD);
        buttonPanel.add(buttonLCM);

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
                        xValue = new BigInteger(xTextDisplay.getText());
                        yValue = new BigInteger(yTextDisplay.getText());
                        answer = xValue.add(yValue);
                        operator = "+";
                        answerText.setText(bigNumberCalc.this.toString());
                    }
                } );

        buttonMinus.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xValue = new BigInteger(xTextDisplay.getText());
                        yValue = new BigInteger(yTextDisplay.getText());
                        answer = xValue.subtract(yValue);
                        operator = "-";
                        answerText.setText(bigNumberCalc.this.toString());
                    }
                } );

        buttonMultiply.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xValue = new BigInteger(xTextDisplay.getText());
                        yValue = new BigInteger(yTextDisplay.getText());
                        answer = xValue.multiply(yValue);
                        operator = "*";
                        answerText.setText(bigNumberCalc.this.toString());
                    }
                } );

        buttonDivide.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xValue = new BigInteger(xTextDisplay.getText());
                        yValue = new BigInteger(yTextDisplay.getText());
                        answer = xValue.divide(yValue);
                        operator = "/";
                        answerText.setText(bigNumberCalc.this.toString());
                    }
                } );

        buttonPower.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xValue = new BigInteger(xTextDisplay.getText());
                        yValue = new BigInteger(yTextDisplay.getText());
                        answer = power(xValue, yValue);
                        operator = "^";
                        answerText.setText(bigNumberCalc.this.toString());
                    }
                } );

        buttonRoot.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xValue = new BigInteger(xTextDisplay.getText());
                        answer = xValue.sqrt();
                        operator = "r";
                        answerText.setText(bigNumberCalc.this.toString());
                    }
                } );

        buttonSquare.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xValue = new BigInteger(xTextDisplay.getText());
                        answer = xValue.pow(2);
                        operator = "^2";
                        answerText.setText(bigNumberCalc.this.toString());
                    }
                } );

        buttonFactorial.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xValue = new BigInteger(xTextDisplay.getText());
                        answer = factorial(xValue);
                        operator = "!";
                        answerText.setText(bigNumberCalc.this.toString());
                    }
                } );

        buttonMOD.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xValue = new BigInteger(xTextDisplay.getText());
                        yValue = new BigInteger(yTextDisplay.getText());
                        answer = xValue.mod(yValue);
                        operator = "MOD";
                        answerText.setText(bigNumberCalc.this.toString());
                    }
                } );

        buttonGCD.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xValue = new BigInteger(xTextDisplay.getText());
                        yValue = new BigInteger(yTextDisplay.getText());
                        answer = xValue.gcd(yValue);
                        operator = "GCD";
                        answerText.setText(bigNumberCalc.this.toString());
                    }
                } );

        buttonLCM.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        xValue = new BigInteger(xTextDisplay.getText());
                        yValue = new BigInteger(yTextDisplay.getText());
                        answer = lcm(xValue, yValue);
                        operator = "lcm";
                        answerText.setText(bigNumberCalc.this.toString());
                    }
                } );
    }
    /**
     * toString method to print out the result of the calculator
     * in a readable manner
     * @return String of calculation
     */
    @Override
    public String toString() {
        String s = "";
        if(operator.equals("r")){
            s += "Square root of " + xValue;
            s += "= " + answer;
        } else if(operator.equals("^2")){
            s += xValue + "squared = " + answer;
        } else if(operator.equals("!")){
            s += operator + xValue + " = ";
            s += answer;
        } else if(operator.equals("MOD")){
            s += "The MOD of " + xValue + " and " +yValue;
            s += " = " + answer;
        } else if(operator.equals("GCD")){
            s += "The greatest common divisor of " + xValue;
            s += " and " + yValue + " = " + answer;
        } else if(operator.equals("lcm")){
            s += "The least common multiple of " + xValue;
            s += " and " + yValue + " = " + answer;
        } else {
            s += xValue + " " + operator + " ";
            s += yValue + " = " + answer;
        }
        return s;
    }
}