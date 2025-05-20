package com.demo.linkedlist;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmpLinkedList {
	Node head;
	class Node{
		Employee data;
		Node next;
		public Node(Employee data){
			this.data=data;
			this.next=null;
		}
	}
	public EmpLinkedList() {
		head=null;
	}
	public void displayData() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println();
	}
	public void addPosition(Employee ob, int pos) {
		if(head== null) {
			System.out.println("list is empty");
			return;
		}
		else {
		Node newemp= new Node(ob);
		if(pos==1) {
			newemp.next= head;
			head= newemp;
		}
		else {
			Node temp = head;
			int count=0;
			for(int i=0;temp.next!=null && i<pos-2;i++) {
				temp=temp.next;
				count++;
			}
			if(count==pos-2) {
				newemp.next=temp.next;
				temp.next=newemp;
			}
			else {
				System.out.println("Position is out of bound "+pos);
			}
		}
	}
	}
 public void addNode(Employee ob) {
	 Node emp= new Node(ob);
	 if(head==null) {
		 head = emp;
	 }
	 else {
		 Node temp= head;
		 while(temp.next!= null) {
			 temp=temp.next;
		 }
		 temp.next=emp;
	 }
	 
 }
 
 public void addNodeByEmpno(Employee ob ,int empno) {
	 
	 if(head==null) {
		 System.out.println("list is empty");
	 }
	 else {
		 Node empnode= new Node(ob);
		 
		 Node temp= head;
		 while(temp.next!=null && temp.data.getEmpno()!=empno) {
			 temp=temp.next;
		 }
		 if(temp.data.getEmpno()==empno) {
			empnode.next=temp.next;
			temp.next=empnode;
		 }
		 else {
			 System.out.println("empno not found");
		 }
	 }
 }
 
 public Employee deleteByEmpno(int empno) {
	 if(head==null) {
		 System.out.println("List is empty");
	 }
	 else {
		 Node temp=head;
		 if(head.data.getEmpno()==empno) {
			 head=temp.next;
			 temp.next=null;
			 return temp.data;
		 }
		 else {
			 Node prev=null;
			 while(temp.next!=null && temp.data.getEmpno()!=empno) {
				 prev=temp;
				 temp= temp.next;
			 }
			 if(temp.data.getEmpno()==empno) {
				 prev.next=temp.next;
				 temp.next=null;
				 return temp.data;
			 }
			 else {
				 System.out.println("Empno not found");
				 return null;
			 }
		 }
	 }
	 return null;
 }
 
 //public Employee deleteByName()
 public Employee deleteByEname(String ename) {
	 if(head==null) {
		 System.out.println("List is empty");
	 }
	 else {
		Node temp=head;
		 if(head.data.getEname().equals(ename)) {
			 head=temp.next;
			 temp.next=null;
			 return temp.data;
		 }
		 else {

			 Node prev=null;
			 while (temp != null) {
			        if (temp.data.getEname().equals(ename)) {
			        	// Remove the node
			            prev.next = temp.next; 
			        } else {
			        	// Move to the next node
			            prev = temp; 
			        }
			     // Traverse the list
			        temp = temp.next; 
			    } 
	
  }
	 
 }
	return null;
 }
 
 public void findBySal(double sal){
		Node temp=head;
		while(temp!=null) {
			if(temp.data.getSal() > sal) {
			System.out.println(temp.data);
			
			
			}
			temp=temp.next;
		}
	 
	 }
 }
 
 
 
 
 
 
 
 
