package com.practice.BasicJunit4.Practice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorServiceTest {

    private CalculatorService service;

    @Before
    public void setUp() throws Exception {
        service = new CalculatorService();
    }

    // testing adding functionality
    @Test
    public void testAddFunctionality() {
        int result = service.addNumbers(-1, 2, -3);
        Assert.assertEquals(-2, result);
    }

    // testing getQuotient method
    @Test
    public void testGetQuotientMethod() {
        Integer actualResult = service.getQuotient(30, 2);
        Assert.assertEquals(Integer.valueOf(15), actualResult);
    }

    // testing getQuotient method for exception
    // negative test case
    @Test(expected = ArithmeticException.class)
    public void testGetQuotientMethodForException() {
        service.getQuotient(30, 0);
    }

    // testing getRemainder method
    @Test
    public void testGetRemainderMethod() {
        Integer actualResult = service.getRemainder(35, 2);
        Assert.assertEquals(Integer.valueOf(1), actualResult);
    }

    // testing getRemainder method for exception
    // negative test case
    @Test(expected = ArithmeticException.class)
    public void testGetRemainderMethodForException() {
        service.getRemainder(35, 0);
    }
}
