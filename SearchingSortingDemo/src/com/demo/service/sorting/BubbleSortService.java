package com.demo.service.sorting;

import java.util.Arrays;

public class BubbleSortService {

	public static void swap(int a ,int b , int [] arr ) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
		
	}
	public static void display(int []arr) {
		for(int i=0;i<arr.length;i++) {
			
			System.out.print( " "+arr[i]+",");
		}
	}
	
	//Bubble Sort Method......
	public static void bubbleSortAscending(int[]arr) {
		for(int round =1; round<arr.length ; round++) {
			
			for(int j=0; j<arr.length-round; j++) {
				if(arr[j]>arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
					swap(j,j+1 , arr);
					
				}
			}
		}
	}
	
	public static void bubbleSortDescending(int[]arr) {
		for(int round =1; round<arr.length ; round++) {
			
			for(int j=0; j<arr.length-round; j++) {
				if(arr[j]<arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
					swap(j,j+1 , arr);
					
				}
			}
		}
	}
	
	
	public static void impBubbleSortAscending(int[] arr) {
		boolean flag= false ;
		for(int i=0;i<arr.length;i++) {
			flag =false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]){
					int temp= arr[j-1];
					arr[j-1] = arr[j];
					arr[j]= temp;
					flag=true;
				}
				
			}
			if(!flag) {
				break;
			}
			
			System.out.println("iteration :"+i);
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void impBubbleSortDescending(int[] arr) {
		boolean flag= false ;
		for(int i=0;i<arr.length;i++) {
			flag =false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]<arr[j]){
					int temp= arr[j-1];
					arr[j-1] = arr[j];
					arr[j]= temp;
					flag=true;
				}
				
			}
			if(!flag) {
				break;
			}
			
			System.out.println("iteration :"+i);
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void InsertionSortAscending(int[]arr) {
		for(int round =1; round<arr.length ; round++) {
			int val=arr[round];
			
			for(int j=round-1; j>=0; j--) {
				if(arr[j]>val) {
                   arr[j+1]=arr[j];
					
				}
				else {
					break;
				}
				arr[j+1]=val;
			}
			
		}
	}
}
