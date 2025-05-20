package com.demo.test;

import java.util.Arrays;

import com.demo.service.sorting.MergeSort;

public class TestMergeSort {

	public static void main(String[] args) {
		int[] arr= {2,10,5,7,9,3,4,11};
		MergeSort.mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
