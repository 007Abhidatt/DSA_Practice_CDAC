package com.demo.test;

import com.demo.stackQueue.MyQueueList;

public class TestQueueList {

	public static void main(String[] args) {
		MyQueueList ob = new MyQueueList();
		ob.enqueue(10);
		ob.enqueue(20);
		ob.enqueue(30);
		ob.enqueue(40);
		ob.enqueue(50);
		while(!ob.isEmpty()) {
			System.out.println(ob.dequeue());
		}

	}

}
