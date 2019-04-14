package com.antique.mockito.unittesting.unittesting.business;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBuinsessImpTest {

	@Test
	public void calculate_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualSum = business.calculateSum(new int[] {1,2,3});
		int expectedSum = 6;
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void calculate_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualSum = business.calculateSum(new int[] {});
		int expectedSum = 0;
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void calculate_ValueOne() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualSum = business.calculateSum(new int[] {5});
		int expectedSum = 5;
		assertEquals(expectedSum, actualSum);
	}

}
