package com.example.fibonnaci.controller;


import com.example.fibonnaci.logic.Fibonacci;
import com.example.fibonnaci.model.FibonacciModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class FibonacciController {

    private Fibonacci fibonacci = new Fibonacci();

    @RequestMapping(value = "/fibonacci", method = GET)
    public FibonacciModel fibonnaci(@RequestParam("input") int input){
        return new FibonacciModel(input, fibonacci.calculate_fibonacci(input));
    }

}
