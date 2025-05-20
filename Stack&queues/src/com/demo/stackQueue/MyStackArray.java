package com.demo.stackQueue;

public class MyStackArray {
	int [] arr;
	int top;
	public MyStackArray() {
		arr= new int[5];
		top=-1;
	}
	public MyStackArray(int size) {
		arr= new int[size];
		int top=-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==arr.length-1;
	}
	
	public void push(int val) {
		if(!isFull()) {
			top++;
			arr[top]=val;
			System.out.println("pushed "+val );
		}else {
			System.out.println("Stack is Full");
		}	
	}
	
	public int pop() {
		if(!isEmpty()) {
			int num=arr[top];
			top--;
			return num;
		}else {
			System.out.println("Stack is empty");
		}
		return -1;
	}
	
	

}
