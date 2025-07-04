package com.example.Calculator.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorServiceTest 
{
    private final CalculatorService calculatorService = new CalculatorService();
    
    @Test
    void testAdd()
    {
        assertEquals(10, calculatorService.add(7,4));
    }

    @Test
    void testSubtract() 
    {
        assertEquals(2, calculatorService.subtract(6, 4));
    }

    @Test
    void testMultiply() 
    {
        assertEquals(24, calculatorService.multiply(6, 4));
    }

    @Test
    void testDivide() 
    {
        assertEquals(2, calculatorService.divide(8, 4));
    }

    @Test
    void testDivideByZero() 
    {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculatorService.divide(5, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
