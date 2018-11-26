package com.example.fibonnaci.controller;


import com.example.fibonnaci.logic.Fibonacci;
import com.example.fibonnaci.model.FibonacciModel;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class FibonacciController {

    private Fibonacci fibonacci = new Fibonacci();

    @RequestMapping(value = "/fibonacci", method = GET)
    public FibonacciModel fibonnaci(@RequestParam("input") int input){
        return new FibonacciModel(input, fibonacci.calculate_fibonacci(input));
    }


    @RequestMapping(value = "/jenkins/{id}", method = POST)
    @ResponseBody
    public String getFoosBySimplePathWithPathVariable(
            @PathVariable String id) {
        return "Get a specific Foo with id=" + id;
    }

}
