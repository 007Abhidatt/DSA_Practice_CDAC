package com.demo.stackQueue;

public class CircularQueue {
	int []arr;
	int front ,rear;
	
	public CircularQueue() {
		arr = new int[5];
		front =-1;
		rear = -1;
	}
	
	public CircularQueue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	
	public boolean isEmpty() {
		if(front == -1) {
			System.out.println("the queue is empty");
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(front ==0 && rear==arr.length-1) {
			System.out.println("The queue is full");
			return true;
		}else {
			if(front==rear+1) {
				System.out.println("The queue is full");
				return true;
			}
		}
		return false;
	}
	
	public void enqueue(int val) {
		if(!isFull()) {
			if(front==-1) {
				front =0;
			}
			rear=(rear+1)%arr.length;
			arr[rear]=val;
			System.out.println("added sucessfuly in queue "+val);
		}
	}
	
	public int dequeue() {
		if(!isEmpty()) {
			int num = arr[front];
			if(rear == front) {
				front =-1;
				rear = -1;
			}
			else {
				front = (front+1)% arr.length;
			}return num;
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
