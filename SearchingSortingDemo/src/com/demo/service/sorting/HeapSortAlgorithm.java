package com.demo.service.sorting;

import java.util.Arrays;

public class HeapSortAlgorithm {
  
	public static void heapifyMax(int []arr,int n,int i) {
		int left= 2*i+1;
		int right = 2*i+2;
		int largest=i;
		while(left<n && arr[left] > arr[largest]) {
			largest=left;
		}
		while(right<n && arr[right] > arr[largest]) {
			largest=right;
		}
		if(largest!=i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			heapifyMax(arr,n,largest);
		}
	}
	public static void heapSortAscending(int[] arr) {


	for(int i=(arr.length)/2-1;i>=0;i--) {
			heapifyMax(arr,arr.length,i);
		}
		int n=arr.length;
		for(int i=n-1;i>=0;i--) {
			int temp = arr[0];
			arr[0] =arr[i];
			arr[i]=temp;
			
			System.out.println(Arrays.toString(arr));
			heapifyMax(arr,i,0);
		}
	}
	
	public static void heapSortDescending(int []arr) {
		for(int i=(arr.length)/2-1; i>=0 ; i--) {
			
			heapifyMin(arr, arr.length , i);
		}
		
		int n= arr.length ;
		for(int i=n-1; i>=0 ; i--) {
			int temp = arr[0];
			arr[0]=arr[i];
			arr[i]= temp;
			heapifyMin(arr, i,0);
		}
		
	}
	
	private static void heapifyMin(int[] arr, int n, int i) {
		
		int left = 2*i+1;
		int rigth = 2*i+2;
		int smallest = i;
		
		while(left<n && arr[left]<arr[smallest]) {
			smallest= left;
		}
		while(rigth<n && arr[rigth]<arr[smallest]) {
			smallest=rigth;
		}
		
		if(smallest!=i) {
			int temp =arr[smallest];
			arr[smallest]= arr[i];
			arr[i]=temp;
			heapifyMin(arr, n , smallest);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
