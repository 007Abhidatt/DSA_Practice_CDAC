package com.demo.test;

import java.util.Scanner;

import com.demo.service.sorting.NthMax;



public class TestNthMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {1,45,56,21,78, 91 ,2};
		System.out.println("Eter the value of n");
		int n=sc.nextInt();
		int nthmax = NthMax.findNthMax(n,arr);
		System.out.println(nthmax);
		

	}

}
