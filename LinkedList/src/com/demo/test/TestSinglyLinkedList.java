package com.demo.test;

import com.demo.linkedlist.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList slist= new SinglyLinkedList();
		slist.addNode(5);
		slist.addNode(7);
		slist.addNode(9);
		slist.addNode(15);
		slist.addNode(25);
		slist.displayData();
//		slist.addByPosition(4, 1);
//		slist.addByPosition(6, 3);
//		slist.addByPosition(18, 8);
//		slist.addByValue(11, 15);
//		slist.deleteByPosition(1);
//		slist.deleteByPosition(3);
//		slist.deleteByPosition(6);
		slist.deleteByvalue(5);
		slist.displayData();
		slist.deleteByvalue(25);
		slist.deleteByvalue(56);
		
		slist.displayData();

	}

}
