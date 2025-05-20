package com.demo.stackQueue;

public class MyQueueList {
	Node front ,rear;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data= data;
			this.next = null;
		}
	}
	public MyQueueList() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		if(front == null) {
			System.out.println("The Queue is empty");
			return true;
		}
		return false;
	}
	
	public void enqueue(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			front= newNode;
			rear = newNode;
		}
		else {
			rear.next = newNode;
			rear = newNode;
		}
		System.out.println("Added Successfully");
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("The Queue is empty");
			return -1;
		}
		else {
			Node temp =front ;
			int num= front.data;
			front = front.next;
			temp.next = null;
			return num;
		}
	}
	
	public void displayData() {
		Node temp = front;
		while(temp!= null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

}
