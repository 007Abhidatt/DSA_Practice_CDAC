package com.demo.test;

import com.demo.linkedlist.DoublyCircularLinkedList;


public class TestDoublyCircularLinkedList {
	public static void main(String[] args) {
		DoublyCircularLinkedList dlist = new DoublyCircularLinkedList();
		dlist.addNode(3);
		dlist.addNode(18);
		dlist.addNode(9);
		dlist.addNode(6);
		dlist.addNode(1);
		//dlist.displayData();
		//dlist.displayReverse();
		dlist.addByPosition(27, 6);
		dlist.addByPosition(45, 3);
		dlist.addByPosition(94, 1);
		dlist.displayData();
		System.out.println("---------------------------");
		dlist.deleteByPosition(8);
		dlist.deleteByPosition(4);
		dlist.deleteByPosition(1);
		dlist.deleteByPosition(12);
		dlist.displayData();
	
	}

}
