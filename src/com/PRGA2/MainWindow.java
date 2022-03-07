package com.PRGA2;
/*
 * Course:       TCSS 305A - Fall 2021
 * Name:         Johnny Heredia III
 * Instructor:   Professor Dincer
 * Assignment:   Programming Assignment 2
 * File Name:    MainWindow.java
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Main window that creates windows for each calculator
 * and controls the main window of the program
 */
public class MainWindow extends JFrame {
    /**
     * Main window method that handles the layout
     * and processes the window of the program.
     * If a calculator is selected it opens the
     * window for that calculator.
     */
    public MainWindow() {
        JPanel mainPanel = new JPanel();

        Color eggshell = new Color(240, 235, 216);

        mainPanel.setBackground(eggshell);
        mainPanel.setLayout(new GridLayout(1, 1));
        this.add(mainPanel);

        Color customPurple = new Color(157,141,241);

        var buttonPanel = new JPanel();
        buttonPanel.setBackground(eggshell);
        buttonPanel.setLayout(new GridLayout(4, 1, 10, 10));
        mainPanel.add(buttonPanel);

        var buttonBinary = new JButton("Binary Calculator");
        buttonBinary.setBackground(customPurple);
        buttonBinary.setForeground(Color.WHITE);
        buttonBinary.setOpaque(true);
        buttonBinary.setBorderPainted(false);

        var buttonHexadecimal = new JButton("Hexadecimal Calculator");
        buttonHexadecimal.setBackground(customPurple);
        buttonHexadecimal.setForeground(Color.WHITE);
        buttonHexadecimal.setOpaque(true);
        buttonHexadecimal.setBorderPainted(false);

        var buttonBig = new JButton("Big Number Calculator");
        buttonBig.setBackground(customPurple);
        buttonBig.setForeground(Color.WHITE);
        buttonBig.setOpaque(true);
        buttonBig.setBorderPainted(false);

        var buttonDecimal = new JButton("Decimal Calculator");
        buttonDecimal.setBackground(customPurple);
        buttonDecimal.setForeground(Color.WHITE);
        buttonDecimal.setOpaque(true);
        buttonDecimal.setBorderPainted(false);

        buttonPanel.add(buttonBinary);
        buttonPanel.add(buttonHexadecimal);
        buttonPanel.add(buttonBig);
        buttonPanel.add(buttonDecimal);

        buttonBinary.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame biFrame = new JFrame();
                        biFrame.setTitle("Binary Calculator");
                        JPanel mainPanel = new JPanel();
                        mainPanel.setBackground(eggshell);
                        biFrame.add(mainPanel);
                        binaryCalc calculator = new binaryCalc(mainPanel);
                        biFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        biFrame.setSize(700, 700);
                        biFrame.setVisible(true);
                    }
                }
        );
        buttonHexadecimal.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame hexFrame = new JFrame();
                        hexFrame.setTitle("Hexadecimal Calculator");
                        JPanel mainPanel = new JPanel();
                        mainPanel.setBackground(eggshell);
                        hexFrame.add(mainPanel);
                        hexadecimalCalc calculator = new hexadecimalCalc(mainPanel);
                        hexFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        hexFrame.setSize(700, 700);
                        hexFrame.setVisible(true);
                    }
                }
        );
        buttonDecimal.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame decFrame = new JFrame();
                        decFrame.setTitle("Decimal Calculator");
                        JPanel mainPanel = new JPanel();
                        mainPanel.setBackground(eggshell);
                        decFrame.add(mainPanel);
                        decimalCalc calculator = new decimalCalc(mainPanel);
                        decFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        decFrame.setSize(700, 700);
                        decFrame.setVisible(true);
                    }
                }
        );
        buttonBig.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame bigFrame = new JFrame();
                        bigFrame.setTitle("Big Number Calculator");
                        JPanel mainPanel = new JPanel();
                        mainPanel.setBackground(eggshell);
                        bigFrame.add(mainPanel);
                        bigNumberCalc calculator = new bigNumberCalc(mainPanel);
                        bigFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        bigFrame.setSize(700, 700);
                        bigFrame.setVisible(true);
                    }
                }
        );
    }
}