package com.demo.service.sorting;

import java.util.Arrays;

public class InsertionSortService {
	public static void insertionSort(int [] arr) {
		for(int i=1; i<arr.length; i++ ) {
			
			int key= arr[i];
			 
			int lasts = i-1;
			
			while(lasts>=0 && arr[lasts]>key) {
				arr[lasts+1]=arr[lasts];
				lasts--;
			}
		
			arr[lasts+1]=key;	
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
	
	

}
