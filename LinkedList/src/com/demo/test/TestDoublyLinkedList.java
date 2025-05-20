package com.demo.test;

import com.demo.linkedlist.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList dlist=new DoublyLinkedList();
		dlist.addNode(4);
		dlist.addNode(6);
		dlist.addNode(12);
		dlist.addNode(19);
		dlist.addNode(40);
		dlist.displayData();
//		dlist.deleteByValue(4);
//		dlist.deleteByValue(18);
//		dlist.deleteByValue(40);
		System.out.println("---------------------------------------");
		//dlist.displayDataReverse();
		dlist.addByPosition(18, 6);
    	dlist.addByPosition(45, 3);
		dlist.addByPosition(27, 1);
		dlist.displayData();
		dlist.deleteByPosition(8);
		

	}

}
