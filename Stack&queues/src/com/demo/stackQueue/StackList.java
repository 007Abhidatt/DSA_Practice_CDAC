package com.demo.stackQueue;

public class StackList {
	Node top;
	class Node{
		int data;
		Node next;
		  
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public StackList() {
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(int val) {
		Node newNode = new Node(val);
		if(!isEmpty()) {
			newNode.next = top;
		}
		top = newNode;
		System.out.println("Pushed "+val);
	}
	
	public void displayData() {
		Node temp = top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp =temp.next;
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			Node temp =top;
			top = temp.next;
			temp.next = null;
			return temp.data;
		}
		else {
			System.out.println("List is empty");
			return -1;
		}
	}

}
