package com.demo.test;

import java.util.Arrays;

import com.demo.service.sorting.InsertionSortService;

public class TestInsertionSort {

	public static void main(String[] args) {
		int [] arr = {10 ,1,7,6,4,9};
		InsertionSortService.insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
