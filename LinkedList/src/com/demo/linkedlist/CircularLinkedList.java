package com.demo.linkedlist;

public class CircularLinkedList {
  Node head;
   class Node{
	   int data;
	   Node next;
	   public Node(int data) {
		   this.data = data;
		   this.next = null;
	   }
   }
   public void displayData() {
	   if(head == null) {
		   System.out.println("List is empty");
	   }
	   else {
		   Node temp = head;
		   do {
			   System.out.println(temp.data);
			   temp = temp.next;
			   
		   }while(temp!=head);
	   }
   }
   public void addNode(int val) {
	   Node newNode = new Node(val);
	   if(head == null) {
		   head = newNode;
	   }
	   else {
		   Node temp =head;
		   while(temp.next!= head) {
			   temp = temp.next;
		   }
		   temp.next = newNode;
	   }
	   newNode.next =head;
   }
   
   public void addByPosition(int val,int pos) {
	   Node newNode = new Node(val);
	   if(head == null) {
		   System.out.println("List is empty");
	   }
	   else {
		   Node temp =head;
		   if(pos==1) {
			   while(temp.next!= head) {
				   temp = temp.next;
			   }
			   newNode.next = head;
			   head = newNode;
			   temp.next = head;
		   }
		   else {
			   int count =0;
			   for(int i=0;temp.next!=head && i<pos-2;i++) {
				   temp =temp.next;
				   count++;
			   }
			   if(count == pos-2) {
			   newNode.next=temp.next;
			   temp.next=newNode;
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
		   Node temp = head;
		   if(pos == 1) {
			   //take temp to last position
			   while(temp.next!= head) {
				   temp = temp.next;
			   }
			   temp.next= head.next;
			   head.next = null;
			   head = temp.next; 
		   }
		   else {
			   Node prev =null;
			   int count =0;
			   for(int i=0; temp.next!=head && i<pos-1;i++) {
				   prev = temp;
				   temp =temp.next;
				   count++;
			   }
			   if(count == pos-1) {
				   prev.next = temp.next;
				   temp.next = null;
			   }
			   else {
				   System.out.println("Position out of bounds "+pos);
			   }
			   
		   }
	   }
	   
   }
}
