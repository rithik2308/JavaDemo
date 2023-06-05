package com.practice.BasicJunit4.Assertions;

import org.junit.Test;

import junit.framework.Assert;

public class AssertEquals {
	@Test
	public void TestEqualsParameters() {
		//compare string
		String actualdata="test data";
		String expecteddata="test data";
		Assert.assertEquals("data should match",expecteddata, actualdata);
		
		//compare Integer
		Assert.assertEquals("data should match",123,123);
		
		//compare double
		Assert.assertEquals("data should match",20.0,20.0,0.1);
	}
}
