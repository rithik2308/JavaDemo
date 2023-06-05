package com.practice.BasicJunit4.first;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.AfterClass;

public class BasicExampleTest {
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("-----Running BeforeClass method-----");
	}
	@Before
	public void setUp() throws Exception{
		System.out.println("-----Running setUp method-----");
	}
	@Ignore("Ignored")
	@Test
	public void TestExampleone() {
		System.out.println("-----Running Test example ne method------");
	}
	@Test(timeout=1000)
	public void TestExampletwo() throws InterruptedException {
		System.out.println("-----Running Test example two method------");
		System.out.println("-----Failing test after 1000 ms------");
		Thread.sleep(2000);
	}
	@After
	public void tearDown() throws Exception{
		System.out.println("-----Running tearDown method-----");
	}
	@AfterClass
	public static void AfterClass() {
		System.out.println("-----Running AfterClass method-----");
	}
}
