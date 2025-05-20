package com.demo.service.sorting;

public class QuickSortServce {
	
	public static void quickSort(int []arr, int start , int end) {
		if(start<end) {
			int p = partition(arr, start , end);
			//
			quickSort(arr, start, p-1);
			
			quickSort(arr , p+1 , end);
			
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = start;
		int i= start;
		int j = end;
		
		while(i<j) {
			while(i<end && arr[i]<=arr[pivot]) {
				i++;
			}
			while(j>pivot && arr[j]>arr[pivot]) {
				j--;
			}
			if(i<j) {
				int temp= arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
			
			
		}
		
		int temp = arr[pivot];
		arr[pivot]= arr[j];
		arr[j]= temp;
	
		return j;
	}
	

}
