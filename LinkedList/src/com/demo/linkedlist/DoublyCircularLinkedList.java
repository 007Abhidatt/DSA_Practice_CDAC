 package com.demo.linkedlist;

public class DoublyCircularLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public void addNode(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head= newNode;
			newNode.next = newNode;
			newNode.prev = newNode;
		}
		else {
			Node temp = head.prev;
			newNode.next = temp.next;
			temp.next = newNode;
			newNode.prev = temp;
			head.prev =newNode;
			
		}
		
	}
	
	
	public void displayData() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			Node temp = head;
			do {
				System.out.println(temp.data);
				temp = temp.next;
			}while(temp!= head);
		}
	}
	
	public void displayReverse() {
		if(head == null) {
			System.out.println("List is Empty ");
		}
		else {
			Node temp =head.prev;
			do {
				System.out.println(temp.data);
				temp = temp.prev;
			}while(temp != head.prev);
		}
	}
	

	public void addByPosition(int val ,int pos) {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node newNode = new Node(val);
			if(pos==1) {
				newNode.prev = head.prev;
				newNode.next = head;
				head.prev.next = newNode;
				head.prev = newNode;
				head = newNode;
				
			}
			else {
				Node temp =head;
				int count =0;
				for(int i=0; temp.next!= head && i<pos-2;i++) {
					temp =temp.next;
					count++;
				}
				if(count == pos-2) {
					newNode.next = temp.next;
					newNode.prev = temp;
					temp.next.prev = newNode;
					temp.next = newNode;
				}
				else {
					System.out.println("Position out of bounds "+pos);
				}
			}
		}
	}
	
	public void deleteByPosition(int pos) {
		if(head == null) {
			System.out.println("List is Empty");
		}
		else {
			Node temp =head;
			if(pos == 1) {
				head.prev.next = head.next;
				head.next.prev = head.prev;
				head= head.next;
				temp.next = null;
				temp.prev = null;
			}
			else {
				int count =0;
				for(int i=0; temp.next!= head  && i<pos-1;i++) {
					temp=temp.next;
					count++;
				}
				if(count == pos-1) {
					temp.next.prev = temp.prev;
					temp.prev.next = temp.next;
					temp.prev = null;
					temp.next =null;
				}
				else {
					System.out.println("Position out of bounds "+pos);
				}
			}
		}
	}

}
