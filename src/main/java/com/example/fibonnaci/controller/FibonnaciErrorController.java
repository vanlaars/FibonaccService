package com.example.fibonnaci.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class FibonnaciErrorController {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handle404Exception() {
        return "404";
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handle500Exception() {
        return "500";
    }

}
