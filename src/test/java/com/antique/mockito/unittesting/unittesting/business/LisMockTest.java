package com.antique.mockito.unittesting.unittesting.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LisMockTest {
	@Mock
	List<String> mock;
	@Spy
	ArrayList arrayListSpy;

	@Test
	public void size_basic() {
		when(mock.size()).thenReturn(5);
		assertEquals(5, mock.size());
	}
	
	@Test
	public void returnWithDiffValue() {
		when(mock.size()).thenReturn(5).thenReturn(10);
		assertEquals(5, mock.size());
		assertEquals(10, mock.size());
	}
	
	@Test
	public void returnWithParameters() {
		when(mock.get(0)).thenReturn("com.atique").thenReturn("antique");
		assertEquals("com.atique", mock.get(0));
		assertEquals("antique", mock.get(0));
		assertEquals(null, mock.get(1));
	}
	
	@Test
	public void returnWithGenericParameters() {
		when(mock.get(anyInt())).thenReturn("com.atique").thenReturn("antique");
		assertEquals("com.atique", mock.get(0));
		assertEquals("antique", mock.get(0));
		assertEquals("antique", mock.get(7));
	}
	
	@Test
	public void verifyBasicCalls() {
		String value1 = mock.get(0);
		String value2 = mock.get(1);
		verify(mock).get(0);
		verify(mock, times(2)).get(anyInt());
		verify(mock, atLeast(1)).get(anyInt());
		verify(mock, atMost(2)).get(anyInt());
		verify(mock, atLeastOnce()).get(anyInt());
		verify(mock, never()).get(2);
	}
	
	@Test
	public void argumentCapturing() {
		mock.add("add something");
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock).add(captor.capture());
		assertEquals("add something", captor.getValue());
	}
	
	@Test
	public void multipleArgumentCapturing() {
		mock.add("SomeString1");
		mock.add("SomeString2");
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock, times(2)).add(captor.capture());
		List<String> allValues = captor.getAllValues();
		assertEquals("SomeString1", allValues.get(0));
		assertEquals("SomeString2", allValues.get(1));
	}
	
	@Test
	public void mocking() {
		System.out.println(mock.get(0));//null
		System.out.println(mock.size());//0
		mock.add("SomeString");
		System.out.println(mock.size());//0
		when(mock.size()).thenReturn(5);
		System.out.println(mock.size());//5
	}
	
	@Test
	public void spying() {
		System.out.println(arrayListSpy.get(0));//null
		System.out.println(arrayListSpy.size());//0
		arrayListSpy.add("SomeString");
		System.out.println(arrayListSpy.size());//0
		when(arrayListSpy.size()).thenReturn(5);
		System.out.println(arrayListSpy.size());//5
	}

}
