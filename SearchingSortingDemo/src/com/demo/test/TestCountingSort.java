package com.demo.test;

import java.util.Arrays;

import com.demo.service.sorting.CountingSortService;

public class TestCountingSort {

	public static void main(String[] args) {
		int [] arr= {3,2,1,4,1,2,7,4,7};
		int [] arr1= CountingSortService.countingSort(arr);
		System.out.println("Result  "+Arrays.toString(arr1));

	}

}
