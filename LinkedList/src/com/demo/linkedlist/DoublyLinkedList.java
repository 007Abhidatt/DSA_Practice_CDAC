package com.demo.linkedlist;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data=data;
			this.next= null;
			this.prev = null;
		}
	}
	
	public void displayData() {
		if(head== null) {
			System.out.println("List is Empty");
		}
		else {
			Node temp =head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp= temp.next;
			}
		}
	}
	
	 public void addNode(int val) {
		 Node newNode = new Node(val);
		 if(head==null) {
			 head=newNode;
		 }
		 else {
			 Node temp= head;
			 while(temp.next!=null) {
				 temp=temp.next;
			 }
			 newNode.next=temp.next;
			 temp.next=newNode;
			 newNode.prev= temp;
		 } 
	 }
	 
	 public void addByPosition(int val,int pos) {
		 if(head == null) {
			 System.out.println("List is Empty");
		 }
		 else {Node temp = head;
		      Node newNode = new Node(val);
			 if(pos==1) {
				head.prev = newNode;
				newNode.next = head;
				newNode.prev = null;
				head= newNode;
				 
			 }
			 else {
				 int count=0;
				 for(int i= 0;temp.next!= null && i<pos-2;i++){
					 temp =temp.next;
					 count++; 
				 }
				 if(count == pos-2) {
					 newNode.next= temp.next;
					 newNode.prev=temp;
					 temp.next= newNode; 
					 temp.next.prev= newNode;
				 }
				 else {
					 System.out.println("Position out of bounds "+pos);
				 }
			 }
		 }
	 }
	 
	 public void addByValue(int num,int val) {
		 if(head==null) {
			 System.out.println("List is Empty");
		 }
		 else {
			 Node newNode = new Node(num);
			 if(head.data==num) {
				 newNode.next=head;
				 head.prev=newNode;
				 head=newNode;
			 }
			 else {
				 Node temp = head;
				 while(temp.next!=null && temp.data!=val) {
					 temp =temp.next;
				 }
				 if(temp.data == val) {
					 newNode.next = temp.next;
					 temp.next=newNode;
					 newNode.prev= temp;
					 if(temp.next!= null) {
						 temp.next.prev = newNode;
					 }
				 }
				 else {
					 System.out.println("Value not found "+val);
				 }
			 }
		 }
	 }
	 
	 public void deleteByPosition(int pos) {
		 if(head == null) {
			 System.out.println("The List is empty");
		 }
		 else {Node temp = head;
			 if(pos == 1) {
				 head = temp.next;
				 temp.next.prev = null;
				 temp.next = null;
				
			 }
			 else {
				 int count =0;
					for(int i=0; temp.next!= head  && i<pos-1;i++) {
						temp=temp.next;
						count++;
					}
					if(count == pos-1) {
						temp.prev.next = temp.next;
						if(temp.next!= null) {
							temp.next.prev = temp.prev;
						}
						temp.next = null;
						temp.prev = null;
					}
					else {
						System.out.println("Position out of bounds "+pos);
					}
				}
			}
		}

			 
		 
	 
	 
	 public void deleteByValue(int val) {
		 if(head== null) {
			 System.out.println("list is empty");
		 }
		 else {
			 Node temp = head;
			 if(head.data==val) {
				 head= temp.next;
				 temp.next= null;
				 head.prev = null;
				 
			 }else {
				 while(temp.next!=null && temp.data!= val) {
					 temp=temp.next;
				 }
				 if(temp.data== val) {
					 temp.prev.next= temp.next;
					 if(temp.next!=null) {
						 temp.next.prev=temp.prev;
					 }
					 temp.next= null;
					 temp.prev = null;
					 
				 }else {
					 System.out.println("value not found in linked list");
				 }
			 }
			 
		 }
	 }
	 
	 public void displayDataReverse() {
		 if(head==null) {
			 System.out.println("List is Empty");
		 }
		 else {
			 Node temp = head;
			 while(temp.next!=null) {
				 temp = temp.next;
			 }
			 while(temp!=null) {
				 System.out.println(temp.data);
				 temp =temp.prev;
			 }
		 }
	 }

}
