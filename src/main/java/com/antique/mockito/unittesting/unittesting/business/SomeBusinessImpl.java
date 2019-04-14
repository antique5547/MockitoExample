package com.antique.mockito.unittesting.unittesting.business;

import com.antique.mockito.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessImpl {
private SomeDataService someDataService;
public int calculateSum(int[] data) {
	int sum = 0;
	for(int value : data) {
		sum += value;
	}
	return sum;
}

public int calculateSumUsingSomeDataService() {
	int[] data = someDataService.retriveAllData();
	int sum = 0;
	for(int value : data) {
		sum += value;
	}
	return sum;
}

public SomeDataService getSomeDataService() {
	return someDataService;
}

public void setSomeDataService(SomeDataService someDataService) {
	this.someDataService = someDataService;
}


}
