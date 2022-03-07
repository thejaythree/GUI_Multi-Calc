package com.PRGA2;
/*
 * Course:       TCSS 305A - Fall 2021
 * Name:         Johnny Heredia III
 * Instructor:   Professor Dincer
 * Assignment:   Programming Assignment 2
 * File Name:    binaryConverter.java
 */
/**
 * Interface for binary calculator to convert numbers
 */
public interface binaryConverter {
    int toDecimal(String value);
    String toBinary(int value);
}