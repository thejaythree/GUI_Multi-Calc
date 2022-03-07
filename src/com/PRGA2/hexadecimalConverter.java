package com.PRGA2;
/*
 * Course:       TCSS 305A - Fall 2021
 * Name:         Johnny Heredia III
 * Instructor:   Professor Dincer
 * Assignment:   Programming Assignment 2
 * File Name:    hexadecimalConverter.java
 */
/**
 * Interface for hexadecimal calculator to convert numbers
 */
public interface hexadecimalConverter {
    int toDecimal(String hexadecimalValue);
    String tohexadecimal(int decimalValue);
}