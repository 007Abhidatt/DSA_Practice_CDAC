package com.demo.stackQueue;

import com.demo.stackQueue.StackList.Node;

public class MyGenericStack <T>{
	Node top;
	class Node{
		T data;
		Node next;
		  
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public MyGenericStack() {
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(T val) {
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
	
	public T pop() {
		if(!isEmpty()) {
			Node temp =top;
			top = temp.next;
			temp.next = null;
			return temp.data;
		}
		else {
			System.out.println("List is empty");
			return null;
		}
	}


}
