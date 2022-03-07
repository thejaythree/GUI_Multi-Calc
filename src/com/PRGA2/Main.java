package com.PRGA2;
/*
 * Course:       TCSS 305A - Fall 2021
 * Name:         Johnny Heredia III
 * Instructor:   Professor Dincer
 * Assignment:   Programming Assignment 2
 * File Name:    Main.java
 */
import javax.swing.*;
/**
 * This is the main driver class for the calculator program.
 * The class sets up the main window that holds access to all
 * the calculators.
 */
public class Main {
    /**
     * main method that initializes the window that
     * holds all the calculators.
     * @param args
     */
    public static void main(String[] args) {
	    var mainWindow = new MainWindow();
        mainWindow.setTitle("Programming Assignment 2");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(700, 500);
        mainWindow.setVisible(true);
    }
}