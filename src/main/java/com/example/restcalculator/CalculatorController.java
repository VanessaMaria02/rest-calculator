package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


    @RequestMapping("/sum")
    public int sum(
            @RequestParam int a,
            @RequestParam int b){
        return a+b;
    }

    @RequestMapping("/multiply")
    public int multiply(
            @RequestParam int a,
            @RequestParam int b){
        return a*b;
    }

    @RequestMapping("/divide")
    public int divide(
            @RequestParam int a,
            @RequestParam int b){
        return a/b;
    }

    @RequestMapping("/absoluteValue")
    public int absoluteValue(
            @RequestParam int a){
        if(a >= 0){
            return a;
        }else{
            return a*-1;
        }

    }

    @RequestMapping("exp")
    public int exp(
            @RequestParam int a,
            @RequestParam int b){
        int temp = a;
        for(int i = 1; i < b; i++){
            temp = temp*a;
        }
        return temp;
    }



}
