package com.example.fibonnaci.logic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Fibonacci.class)
public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();


    @Test
    public void finbonacci_should_return_1_value_0(){
        Assert.assertTrue(fibonacci.calculate_fibonacci(0).equals(1));
    }

    @Test
    public void finbonacci_should_return_1_value_1(){
        Assert.assertTrue(fibonacci.calculate_fibonacci(1).equals(1));
    }

    @Test
    public void finbonacci_should_return_2_value_2(){
        Assert.assertTrue(fibonacci.calculate_fibonacci(2).equals(2));
    }

    @Test
    public void finbonacci_should_return_5_value_4(){
        Assert.assertTrue(fibonacci.calculate_fibonacci(4).equals(5));
    }



}
