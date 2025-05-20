package com.demo.linkedlist;


public class SinglyLinkedList {
	Node head;
	   class Node{
		  int data;
		  Node next;
		 public Node(int val) {
			 this.data= val;
			 this.next=null;
		 }
	}  
	   //constructor of SinglyLikedList class
	   public SinglyLinkedList(){
		   head=null;
	   }
	   
	   // adding node at specifi position
	    public void addByPosition(int val,int pos) {
	    	if(head==null) {
	    		System.out.println("The list is empty");
	    	}
	    	else {
	    		Node newnode= new Node(val);
	    		if(pos==1) {
	    			newnode.next=head;
	    			head=newnode;
	    		}
	    		else {
	    			int count =0;
	    			Node temp= head;
	    			for(int i=0; temp.next!= null && i<pos-2;i++) {
	    				temp=temp.next;
	    				count ++;
	    			}
	    			if(count==pos-2) {
	    				newnode.next= temp.next;
	    				temp.next= newnode;
	    			}
	    			else {
	    				System.out.println("Position is out of bound");
	    			}
	    		}
	    	}
	    }
	    
	    //adding at last position;
	    public void addNode(int val) {
	    	Node newnode =new Node(val);
	    	if(head==null) {
	    		head = newnode;
	    	}
	    	else {
	    		Node temp = head;
	    		while(temp.next != null) {
	    			temp= temp.next;
	    		}
	    		temp.next = newnode;
	    	}
	    }
	    
	    // adding newnode by value
	    public void addByValue(int val, int num) {
	    	//check Linked list is empty or not
	    	if(head== null) {
	    		System.out.println("Linked list is empty");
	    	}
	    	
	    	else {
	    	   Node newnode = new Node(val);
	    	   Node temp = head;
	    	   while(temp.next!=null && temp.data!= num) {
	    		   temp = temp.next;
	    		   
	    	   }
	    	   //add node after num
	    	   if(temp.data == num) {
	    		   newnode.next= temp.next;
	    		   temp.next = newnode;
	    	   }
	    	   else {
	    		   System.out.println("node not found ");
	    	   }
	    	}
	    }
	    
	    public int deleteByPosition(int pos) {
	    	Node temp= head;
	    	if(pos==1) {
	    		head= temp.next;
	    		temp.next=null;
	    		return temp.data;
	    	}
	    	else {	
	    	Node prev = null;
	    	int count=0;
	    	for(int i=0;temp.next!=null && i<pos-1;i++) {
	    		prev=temp;
	    		temp= temp.next;
	    		count++;
	    		
	    	}
	    	if(count==pos-1) {
	    		prev.next=temp.next;
	    		temp.next=null;
	    		return temp.data;
	    	}
	    	else {
	    		System.out.println("Position out of bound "+pos);
	    		return -1;
	    	  }
	    	}
	    }
	    
	    public void deleteByvalue(int num) {
	    	Node temp  = head;
	    	if(head.data==num) {
	    		head=temp.next;
	    		temp.next = null;
	    	}
	    	else {
	    		Node prev = null;
	    		
	    		while(temp.next!=null && temp.data!=num) {
	    			prev = temp;
	    			temp=temp.next;
	    		}
	    		if(temp.data== num) {
	    			prev.next= temp.next;
	    			temp.next= null;
	    			
	    		}
	    		else {
	    			System.out.println("num not found in linked list");
	    		}
	    			
	    	}
	    }
	    
	    
	    
	    
	  
	    public void displayData() {
	    	Node temp = head;
	    	while(temp!=null) {
	    		System.out.println(temp.data+",");
	    		temp = temp.next;
	    	}
	    	System.out.println();
	    }
	    
	    
	    
	    

}
