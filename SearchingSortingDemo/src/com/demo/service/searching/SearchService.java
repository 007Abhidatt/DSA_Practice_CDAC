package com.demo.service.searching;

public class SearchService {

	public static int sequentialSearch(int n, int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	// binary search using recursion.
	public static int binarySearch(int searchnum , int low , int high ,int [] arr ) {
		
		if(low<=high) {
			int mid = (int)(low+high)/2;
			if(searchnum==arr[mid]) {
				return mid;
			}
			else if(searchnum<arr[mid]) {
				return binarySearch(searchnum , low , mid-1, arr);
			}
			else {
				return binarySearch(searchnum , mid+1 , high, arr);
			}
			
		}
		return -1;
		
	}
	
	// binary search using non recursion......
	public static int binarySearchNR(int searchnum,int low,int high,int [] arr) {
		while(low<=high) {
			int mid=(int)(low+high)/2;
			if(searchnum==arr[mid]) {
				return mid;
			}
			else if(searchnum<arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
