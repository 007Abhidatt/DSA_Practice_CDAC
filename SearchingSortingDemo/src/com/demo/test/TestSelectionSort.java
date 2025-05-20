package com.demo.test;

import java.util.Arrays;

import com.demo.service.sorting.SelectionSortService;

public class TestSelectionSort {

	public static void main(String[] args) {
		int [] arr= {1,8, 6 ,2,5,21 , 9};
		//SelectionSortService.SelectionSortAscending(arr);
		SelectionSortService.SelectionSortDescending(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	

}
