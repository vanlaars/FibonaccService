package com.example.fibonnaci.logic;

public class Fibonacci {



    // Clearly we have performance issue due to : recursion

    public Integer calculate_fibonacci(int inputNumber){
        if (inputNumber == 0 || inputNumber ==1){
            return 1;
        } else {
            return calculate_fibonacci(inputNumber -1 ) + calculate_fibonacci(inputNumber - 2);
        }
    }

}
