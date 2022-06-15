package com.example.restcalculator;

public class Calculator {

    public int sum(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        if(0 == b){
            throw new ArithmeticException();
        }
        return a/b;
    }

    public int absoluteValue(int a){
        if(a >= 0){
            return a;
        }else{
            return a*-1;
        }

    }

    public int exp(int a, int b){
        int temp = a;
        for(int i = 1; i < b; i++){
            temp = temp*a;
        }
        return temp;
    }

    public int sqr(int a){
        return (int) Math.pow(a, 2);
    }

}
