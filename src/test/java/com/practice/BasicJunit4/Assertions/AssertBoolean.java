package com.practice.BasicJunit4.Assertions;

import org.junit.Test;

import org.junit.Assert;

public class AssertBoolean {
	@Test
	public void testAssertTrue() {
		Assert.assertTrue(2>0);
	}
	@Test
	public void testAssertTrueWithMessage() {
		Assert.assertTrue("condition should be true",2>0);
	}
	@Test
	public void testAssertFalse() {
		Assert.assertFalse(2==0);
	}
	@Test
	public void testAssertFalseWithMessage() {
		Assert.assertFalse("condition should be false",2>0);
	}
	
}
