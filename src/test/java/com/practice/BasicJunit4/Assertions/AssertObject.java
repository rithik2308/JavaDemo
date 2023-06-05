package com.practice.BasicJunit4.Assertions;

import static org.hamcrest.CoreMatchers.hasItem;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AssertObject {
	@Test
	public void testAssertNull() {
		String object=null;
		Assert.assertNull(object);
	}
	@Test
	public void testAssertNullIWithMessage() {
		String object="ergji";
		Assert.assertNull("Object is null",object);
	}
	@Test
	public void testAssertNotNull() {
		String object="fgrbg";
		Assert.assertNotNull(object);
	}
	@Test
	public void testAssertNotNullIWithMessage() {
		String object="ergji";
		Assert.assertNotNull("Object is not null",object);
	}
	@Test
	public void TestSame() {
		String str1="abc";
		String str2="abc";
		Assert.assertSame(str1, str2);
	}
	@Test
	public void TestNotSame() {
		String str1="abc";
		String str2="abd";
		Assert.assertNotSame(str1, str2);
	}
	@Test
	public void TestAssertThat() {
		Assert.assertThat(Arrays.asList("one","two","three"),hasItem("five"));
	}
	
}
