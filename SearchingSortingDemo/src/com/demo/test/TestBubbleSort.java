package com.demo.test;

import java.util.Arrays;

import com.demo.service.sorting.BubbleSortService;

public class TestBubbleSort {

	public static void main(String[] args) {
		int [] arr= {1,5 ,4,38, 78 ,21,15};
		
//		BubbleSortService.display(arr);
//		
//		BubbleSortService.bubbleSort(arr);
//		
//		System.out.println();
//		
//		BubbleSortService.display(arr);
		
		//BubbleSortService.impBubbleSortAscending(arr);
		//BubbleSortService.impBubbleSortDescending(arr);
		
		BubbleSortService.InsertionSortAscending(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
