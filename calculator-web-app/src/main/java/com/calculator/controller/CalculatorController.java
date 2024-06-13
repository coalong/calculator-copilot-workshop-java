package com.calculator.controller;

import com.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public int add(int num1, int num2) {
        return calculatorService.add(num1, num2);
    }

    @GetMapping("/subtract")
    public int subtract(int num1, int num2) {
        return calculatorService.subtract(num1, num2);
    }

    @PostMapping("/multiply")
    public int multiply(@RequestBody CalculatorRequest request) {
        return calculatorService.multiply(request.getNum1(), request.getNum2());
    }

    @PostMapping("/divide")
    public double divide(@RequestBody CalculatorRequest request) {
        return calculatorService.divide(request.getNum1(), request.getNum2());
    }
}