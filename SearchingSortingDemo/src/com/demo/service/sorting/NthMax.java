package com.demo.service.sorting;

public class NthMax {

	public static int findNthMax(int n, int[] arr) {
		int maxidx=-1;
		int i=0;
		for(i=0 ; i<n; i++) {
			maxidx=findMax(arr,i,arr.length);
			System.out.println("Max number"+i+"---->"+arr[maxidx]);
			if(i<n-1) {
				int temp= arr[i];
				arr[i]=arr[maxidx];
				arr[maxidx]= temp;
			}
			
		}
		return arr[maxidx];
	}

	private static int findMax(int[] arr, int start, int end) {
		int maxidx=start;
		int max=arr[start];
		for(int i=start; i<end; i++) {
			if(max<arr[i]) {
				max=arr[i];
				maxidx=i;
			}
		}
		return maxidx;
	}

	
}
