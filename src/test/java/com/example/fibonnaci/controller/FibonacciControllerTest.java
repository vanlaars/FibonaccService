package com.example.fibonnaci.controller;

import com.example.fibonnaci.model.FibonacciModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(classes = FibonacciController.class)
public class FibonacciControllerTest {


    @InjectMocks
    FibonacciController contoller;


    @Test
    public void test_fibonacci_controller(){

        final FibonacciModel fibonnaci = contoller.fibonnaci(0);

        Assert.assertTrue(fibonnaci.getFibonacciNumber() == 1);

    }


}
