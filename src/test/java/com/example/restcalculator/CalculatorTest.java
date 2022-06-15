package com.example.restcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sumTest1(){
        // Arrange
        int a = 2;
        int b = 5;

        int expectedResult = 7;

        //Act
        int result = calculator.sum(a,b);

        //Assert
        //expected result == result
        assertEquals(expectedResult, result);
    }

    @Test
    void multiplyTest1(){
        int a = 2;
        int b = 4;

        int expectedResult = 8;

        int result = calculator.multiply(a,b);

        assertEquals(expectedResult, result);
    }

    @Test
    void divide1(){
        int a = 4;
        int b = 2;

        int expectedResult = 2;

        int result = calculator.divide(a,b);

        assertEquals(expectedResult, result);
    }

    @Test
    void divide2(){
        int a = 2;
        int b = 0;

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(a,b);
        });
    }




    @Test
    void absolutValueTest1(){
        int a = -1;

        int expectedResult = 1;

        int result = calculator.absoluteValue(a);

        assertEquals(expectedResult, result);
    }

    @Test
    void absolutValueTest2(){
        int a = 0;

        int expectedResult = 0;

        int result = calculator.absoluteValue(a);

        assertEquals(expectedResult, result);
    }

    @Test
    void expTest(){
        int a = 2;
        int b = 2;

        int expectedResult = 4;

        int result = calculator.exp(a,b);

        assertEquals(expectedResult, result);
    }

    @Test
    void sqr(){
        int a = 4;

        int expectedResult = 16;

        int result = calculator.sqr(a);

        assertEquals(expectedResult, result);
    }

}