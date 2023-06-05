package com.practice.BasicJunit4.Assertions;

import org.junit.Test;

import org.junit.Assert;

public class AssertArrayEquals {
	@Test
	public void TestArrayEqualsParameters() {
		//compare string array
		Assert.assertArrayEquals(new String[] {"test","actual"},new String[] {"test","actual"});
		
		//compare integer array
		Assert.assertArrayEquals(new Integer[] {2,4},new Integer[] {2,4});
		
		//compare double array
		Assert.assertArrayEquals(new double[] {3.0,4.0},new double[] {3.0,4.0},0.1);
	}
	
	@Test
	public void TestArrayEqualsParametersWithMessaage() {
		//compare string array
		Assert.assertArrayEquals("Strings should match",new String[] {"test","actual"},new String[] {"test","actual"});
		
		//compare integer array
		Assert.assertArrayEquals("Integers should should match",new Integer[] {2,4},new Integer[] {3,4});
		
		//compare double array
		Assert.assertArrayEquals("Doubles should match",new double[] {3.0,4.0},new double[] {3.0,4.0},0.1);
	}
}
