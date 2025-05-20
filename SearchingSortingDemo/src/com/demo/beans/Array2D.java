package com.demo.beans;

import java.util.Scanner;

public class Array2D {
	private int[][] arr;
	private int count;
	public Array2D() {
		super();
		arr=new int[2][2];
	}
	public Array2D(int a,int b) {
		super();
		arr=new int [a][b];
	}
	
	
	public Array2D(int[] [] arr) {
		this.arr=arr;

	}
	public void add(int row,int col, int x) {
		if (row < arr.length && col < arr[0].length) {
			arr[row][col]=x;
		}
	}
	
	public int [][] getSum(int[][]a,int[][]b){
		int [][] newarr= new int[a.length][a[0].length];
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[0].length ; j++) {
				newarr[i][j]= a[i][j]+b[i][j];
			}
		}
		return newarr;
	}
	public void accept() {
		Scanner sc =new Scanner(System.in);
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[0].length ; j++) {
				System.out.println("value : ");
				arr[i][j]= sc.nextInt();
			}
		}
		
	}
	public void display() {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[0].length ; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	

}
