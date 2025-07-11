package com.example.Calculator.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService 
{
    public double add(double a, double b)
    {
        return a+b;
    }    

    public double subtract(double a, double b)
    {
        return a-b;
    }   

    public double multiply(double a, double b)
    {
        return a*b;
    }    

    public double divide(double a, double b)
    {
        if(b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a/b;
    }
}
