package com.demo.service.sorting;

import java.util.Arrays;

public class SelectionSortService {
	
	//To find Index of min number
	private static int findMin(int[] arr, int start, int end) {
		int minidx=start;
		int min = arr[start];
		for(int i=start; i<end ;i++ ) {
			if(min>arr[i]) {
				min=arr[i];
				minidx=i;
				
			}
		}
		return minidx;
	}
	
	
	
	
	//Sorting in Ascending 
	public static void SelectionSortAscending(int []arr) {
		for(int i=0 ; i<arr.length-1; i++) {
			
		
		//finding min no.
		int minidx = findMin(arr, i , arr.length);
		//swap the min value to first element of sorted
		int temp = arr[i];
		arr[i]= arr[minidx];
		arr[minidx]= temp;
		 System.out.println("iteration "+i+"------>"+i+"swapped index " +minidx );
		 System.out.println(Arrays.toString(arr));
		}
		
	}

	public static void SelectionSortDescending(int []arr) {
		for(int i=0 ; i<arr.length-1; i++) {
			
		
		//finding min Index
		int maxidx = findMax(arr, i , arr.length);
		//swap the min value to first element of sorted
		int temp = arr[i];
		arr[i]= arr[maxidx];
		arr[maxidx]= temp;
		 System.out.println("iteration "+i+"------>"+i+"swapped index " +maxidx );
		 System.out.println(Arrays.toString(arr));
		}
		
	}




	private static int findMax(int[] arr, int start, int end) {
		int maxidx = start;
		int max=arr[start];
		for(int i=0 ; i<arr.length-1; i++) {
			if(max<arr[i]) {
				max=arr[i];
				maxidx=i;
			}		
		}
		return maxidx;
	}
	
	
	
	

}
