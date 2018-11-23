package com.example.fibonnaci.model;

public class FibonacciModel {

    private int input;
    private int fibonacciNumber;


    public FibonacciModel(int input, int fibonacciNumber) {
        this.input = input;
        this.fibonacciNumber = fibonacciNumber;
    }

    public int getFibonacciNumber() {
        return fibonacciNumber;
    }

}
