package com.antique.mockito.unittesting.unittesting.business;

import static org.junit.Assert.*;

import org.junit.Test;

import com.antique.mockito.unittesting.unittesting.data.SomeDataService;

class SomeDataServiceStub implements SomeDataService{
	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3};
	}
}

class SomeDataServiceEmptyStub implements SomeDataService{
	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] {};
	}
}

class SomeDataServiceOneElementStub implements SomeDataService{
	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] {5};
	}
}

public class SomeBuinsessImpStubTest {

	@Test
	public void calculateSumUsingSomeDataService_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceStub());
		int actualSum = business.calculateSumUsingSomeDataService();
		int expectedSum = 6;
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void calculateSumUsingSomeDataService_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceEmptyStub());
		int actualSum = business.calculateSum(new int[] {});
		int expectedSum = 0;
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void calculateSumUsingSomeDataService_ValueOne() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceOneElementStub());
		int actualSum = business.calculateSum(new int[] {5});
		int expectedSum = 5;
		assertEquals(expectedSum, actualSum);
	}

}
