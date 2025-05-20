package com.demo.test;

import java.util.Arrays;

import com.demo.service.sorting.QuickSortServce;

public class QuickSort {

	public static void main(String[] args) {
		int [] arr = {7,4,2,9,5,10,3,15};
		QuickSortServce.quickSort(arr, 0, arr.length-1);
		System.out.println("Array sort using Quick Sort");
		System.out.println(Arrays.toString(arr));

	}

}
