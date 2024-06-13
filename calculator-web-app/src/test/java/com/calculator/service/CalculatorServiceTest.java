package com.calculator.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    private CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testAddition() {
        int result = calculatorService.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculatorService.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiplication() {
        int result = calculatorService.multiply(4, 3);
        assertEquals(12, result);
    }

    @Test
    public void testDivision() {
        int result = calculatorService.divide(10, 2);
        assertEquals(5, result);
    }
}