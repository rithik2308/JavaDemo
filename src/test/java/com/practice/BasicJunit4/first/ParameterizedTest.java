package com.practice.BasicJunit4.first;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	private final Integer counter;
	
	public ParameterizedTest(Integer counter) {
		this.counter=counter;
	}
	@Parameterized.Parameters
	public static List<Integer>counterIncrementer(){
		return Arrays.asList(1,2,3,4,5);
	}
	
	@Test
	public void ParameterExample() {
		System.out.println(counter);
	}
	
	
}
