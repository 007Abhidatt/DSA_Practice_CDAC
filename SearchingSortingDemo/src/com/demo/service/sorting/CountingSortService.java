package com.demo.service.sorting;

import java.util.Arrays;

public class CountingSortService {

	public static int[] countingSort(int [] arr) {
		//find max no int the array
		int max =findMax(arr);
		//create new array of size max+1
		int [] count=new int[max+1];
		//intialize above array with 0
		for(int i=0;i<count.length;i++) {
			count[i]=0;
		}
		//add count of no in the array
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		System.out.println(Arrays.toString(count));
		//find cummalative sum
		for(int i=1;i<count.length;i++) {
			count[i]= count[i-1] +count[i];
			
		}
		System.out.println(Arrays.toString(count));
		
		int []output =new int[arr.length];
		for(int i=0 ;i<arr.length;i++) {
		int pos=count[arr[i]]-1;
		output[pos]=arr[i];
		count[arr[i]]--;
		
		}
		System.out.println(Arrays.toString(output));
		return output;
	}

	private static int findMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

}
