package com.PRGA2;
/*
 * Course:       TCSS 305A - Fall 2021
 * Name:         Johnny Heredia III
 * Instructor:   Professor Dincer
 * Assignment:   Programming Assignment 2
 * File Name:    Calculator.java
 */
import java.math.BigInteger;
/**
 * Calculator to hold basic math functions for the
 * calculators so they can inherit them.
 */
public abstract class Calculator {
    /**
     * method to do addition with doubles
     * @param x double value of x
     * @param y double value of y
     * @return result of additon
     */
    public double add(double x, double y) {
        return x + y;
    }
    /**
     * method to do subtraction with doubles
     * @param x double value of x
     * @param y double value of y
     * @return result of subtraction
     */
    public double subtract(double x, double y) {
        return x - y;
    }
    /**
     * method to do multiplication with doubles
     * @param x double value of x
     * @param y double value of y
     * @return result of multiplication
     */
    public double multiply(double x, double y) {
        return x * y;
    }
    /**
     * method to do division with doubles
     * @param x double value of x
     * @param y double value of y
     * @return result of division
     */
    public double divide(double x, double y) {
        return x / y;
    }
    /**
     * method to do addition with int
     * @param x int value of x
     * @param y int value of y
     * @return result of additon
     */
    public int add(int x, int y) {
        return x + y;
    }
    /**
     * method to do subtraction with int
     * @param x int value of x
     * @param y int value of y
     * @return result of subtraction
     */
    public int subtract(int x, int y) {
        return x - y;
    }
    /**
     * method to do multiplication with int
     * @param x int value of x
     * @param y int value of y
     * @return result of multiplication
     */
    public int multiply(int x, int y) {
        return x * y;
    }
    /**
     * method to do division with int
     * @param x int value of x
     * @param y int value of y
     * @return result of division
     */
    public double divide(int x, int y) {
        return ((double) x / y);
    }
    /**
     * method to do x value to the power of y with bigintegers
     * @param base bigint value representing x
     * @param exponent bigint value representing y
     * @return result of x^y
     */
    public BigInteger power(BigInteger base, BigInteger exponent) {
        BigInteger result = BigInteger.ONE;
        while (exponent.signum() > 0) {
            if (exponent.testBit(0)) result = result.multiply(base);
            base = base.multiply(base);
            exponent = exponent.shiftRight(1);
        }
        return result;
    }

    /**
     * method to find factorial of x
     * @param num bigint representing x
     * @return factorial of num
     */
    public BigInteger factorial(BigInteger num){
        BigInteger result = BigInteger.ONE;
        while (!num.equals(BigInteger.ZERO)) {
            result = result.multiply(num);
            num = num.subtract(BigInteger.ONE);
        }
        return result;
    }
    /**
     * BigInteger method to find lowest common multiplier
     * @param x bigint value of x
     * @param y bigint value of y
     * @return lowest common multiplier of x and y
     */
    public BigInteger lcm(BigInteger x, BigInteger y){
        if (x.signum() == 0 || y.signum() == 0)
            return BigInteger.ZERO;
        return x.divide(x.gcd(y)).multiply(y).abs();
    }
}