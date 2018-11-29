package com.example.fibonnaci.controller;

import com.example.fibonnaci.model.FibonacciModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(classes = FibonacciController.class)
public class FibonacciControllerTest {


    @InjectMocks
    FibonacciController contoller;

    @InjectMocks
    FibonnaciErrorController errorContoller;



    @Test
    public void test_fibonacci_controller(){
        // when
        final FibonacciModel fibonnaci = contoller.fibonnaci(0);

        // then
        Assert.assertTrue(fibonnaci.getFibonacciNumber() == 1);

    }

    @Test
    public void test_fibonacci_controller_error(){
        final MockHttpServletRequest request = new MockHttpServletRequest();

        // when
        request.setLocalAddr("http://localhost:80/nothere");

        //then
        Assert.assertTrue(errorContoller.handleError(request).equals("error"));

    }


}
