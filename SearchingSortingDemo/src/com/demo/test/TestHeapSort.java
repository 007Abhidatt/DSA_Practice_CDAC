package com.demo.test;

import java.util.Arrays;

import com.demo.service.sorting.HeapSortAlgorithm;

public class TestHeapSort {

	public static void main(String[] args) {
		int [] arr= {5,7,1,2,4,10,12};
		//HeapSortAlgorithm.heapSortAscending(arr);
		HeapSortAlgorithm.heapSortDescending(arr);
		System.out.println("Result : "+Arrays.toString(arr));
		

	}

}
