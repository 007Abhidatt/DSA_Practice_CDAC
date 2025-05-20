package com.demo.test;

import java.util.Scanner;

import com.demo.service.searching.SearchService;

public class TestBinarySearch {

	public static void main(String[] args) {
		int [] arr = { 1,21,5,41,6,15,20};
		int[] arr1= {1,3,7,8, 10 , 15 ,100};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to search");
		int n=sc.nextInt();
		
		
	//	int pos=SearchService.sequentialSearch(n,arr);
		
		//int pos = SearchService.binarySearch(n,0,arr1.length-1, arr1 );
		
		int pos= SearchService.binarySearchNR(n, 0, arr.length-1, arr1); 
		
		
		
		
		if(pos>-1) {
			System.out.println("The number is found at position : "+pos);
			
		}else {
			System.out.println("Not Found ");
		}
		

	}
	
	
	

	
	

}
