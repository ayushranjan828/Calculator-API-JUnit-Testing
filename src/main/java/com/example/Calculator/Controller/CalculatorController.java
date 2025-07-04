package com.example.Calculator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Calculator.Service.CalculatorService;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController 
{
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add")
    // @RequestParam annotation enables Spring to extract input data
    public double add(@RequestParam double a, @RequestParam double b)
    {
        return calculatorService.add(a, b);
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b)
    {
        return calculatorService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b)
    {
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b)
    {
        return calculatorService.divide(a, b);
    }
}
