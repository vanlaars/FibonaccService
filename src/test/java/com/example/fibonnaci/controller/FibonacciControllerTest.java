package com.example.fibonnaci.controller;

import com.example.fibonnaci.model.FibonacciModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletRequest;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(classes = FibonacciController.class)
public class FibonacciControllerTest {


    @InjectMocks
    FibonacciController contoller;

    @InjectMocks
    FibonnaciErrorController errorContoller;



    @Test
    public void test_fibonacci_controller(){

        final FibonacciModel fibonnaci = contoller.fibonnaci(0);

        Assert.assertTrue(fibonnaci.getFibonacciNumber() == 1);

    }

    @Test
    public void test_fibonacci_controller_error(){
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setLocalAddr("http://localhost:80/nothere");

        final String actualValue = errorContoller.handleError(request);

        Assert.assertTrue(actualValue.equals("error"));

    }


}
