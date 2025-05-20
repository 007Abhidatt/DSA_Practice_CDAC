package com.demo.stackQueue;

public class MyHashTableString {
	Node[] heads;
	class Node{
		String data; 
		Node next;
		
	public Node(String data) {
		this.data= data;
		this.next = null;
	  }
	}
	
	public MyHashTableString() {
		heads = new Node[5];
	}
	
	public MyHashTableString(int size) {
		heads = new Node[size];
	}
	
	public void insertData(String num) {
		Node newNode = new Node(num);
		int pos= num.length()%heads.length;
		if(heads[pos]== null) {
			heads[pos]= newNode;
		}
		else {
			newNode.next = heads[pos];
			heads[pos] = newNode;
		}
	}
	
	public boolean searchData(String num) {
		int pos = num.length()%heads.length;
		if(heads[pos] == null) {
			System.out.println("The Bucket is Empty no. not Found");
			return false;
		}
		else {
			Node temp = heads[pos];
			while(temp!=null) {
				if(temp.data.equals(num)) {
					System.out.println("String found "+num+ "in the bucket "+pos);
					return true;
				}
				temp = temp.next;
			}
			System.out.println("data not found "+num+" in the bucket -1");
			return false;
		}
	}
	
	public void displayData() {
		for (int i=0 ;i<heads.length; i++) {
			Node temp= heads[i];
			System.out.print(i+"-------->");
			while(temp!=null) {
				System.out.print(temp.data+"--------->");
				temp= temp.next;
			}
			System.out.print("null\n");
		}
	}

}


