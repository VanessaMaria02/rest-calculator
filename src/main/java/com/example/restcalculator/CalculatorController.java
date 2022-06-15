package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    Calculator calculator = new Calculator();


    @RequestMapping("/sum")
    public int sum(
            @RequestParam int a,
            @RequestParam int b){
        return calculator.sum(a,b);
    }

    @RequestMapping("/multiply")
    public int multiply(
            @RequestParam int a,
            @RequestParam int b){
        return calculator.multiply(a,b);
    }

    @RequestMapping("/divide")
    public int divide(
            @RequestParam int a,
            @RequestParam int b){
        return calculator.divide(a,b);
    }

    @RequestMapping("/absoluteValue")
    public int absoluteValue(
            @RequestParam int a){
        return calculator.absoluteValue(a);
    }

    @RequestMapping("exp")
    public int exp(
            @RequestParam int a,
            @RequestParam int b){
        return calculator.exp(a,b);
    }

    @RequestMapping("/sqr")
    public int sqr(
            @RequestParam int a
    ){
        return calculator.sqr(a);
    }



}
