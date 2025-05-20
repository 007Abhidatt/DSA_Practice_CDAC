package com.demo.test;

import com.demo.linkedlist.CircularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList clist = new CircularLinkedList();
		clist.addNode(12);
		clist.addNode(2);
		clist.addNode(6);
		clist.addNode(9);
		clist.addNode(1);
		//clist.displayData();
		clist.addByPosition(18,6);
		clist.addByPosition(27, 3);
		clist.addByPosition(36, 1);
		clist.addByPosition(99, 15);
		clist.displayData();
		System.out.println("------------------------");
		clist.deleteByPosition(8);
		clist.deleteByPosition(4);
		clist.deleteByPosition(1);
		clist.deleteByPosition(12);
		clist.displayData();
		

	}

}
