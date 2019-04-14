package com.antique.mockito.unittesting.unittesting.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.antique.mockito.unittesting.unittesting.data.SomeDataService;

@RunWith(MockitoJUnitRunner.class)
public class SomeBuinsessImpMockTest {
// 
//	SomeBusinessImpl business = new SomeBusinessImpl();
//	SomeDataService mockDataService = mock(SomeDataService.class);
	
//	@Before
//	public void Before() {
//		business.setSomeDataService(mockDataService);
//	}
	@InjectMocks
	SomeBusinessImpl business;
	
	@Mock
	SomeDataService mockDataService;
	
	@Test
	public void calculateSumUsingSomeDataService_basic() {
		when(mockDataService.retriveAllData()).thenReturn(new int[] {1,2,3});
		assertEquals(6, business.calculateSumUsingSomeDataService());
	}
	
	@Test
	public void calculateSumUsingSomeDataService_empty() {
		when(mockDataService.retriveAllData()).thenReturn(new int[] {});
		assertEquals(0, business.calculateSumUsingSomeDataService());
	}
	
	@Test
	public void calculateSumUsingSomeDataService_ValueOne() {
		when(mockDataService.retriveAllData()).thenReturn(new int[] {5});
		assertEquals(5, business.calculateSumUsingSomeDataService());
	}

}
