package com.practice.BasicJunit4.Practice;
import com.practice.BasicJunit4.Practice.BasicExample;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasicExampleMeTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("inside setup method");
    }

    // testing print message method
    @Test
    public void testPrintMessageMethod() {
        String expectedMessage = "Hello World";
        BasicExample util = new BasicExample(expectedMessage);

        String actualMessage = util.printMessage();

        Assert.assertEquals("actual is not as expected message", expectedMessage, actualMessage);
    }
}