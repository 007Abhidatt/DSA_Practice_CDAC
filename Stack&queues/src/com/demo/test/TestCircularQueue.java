package com.demo.test;

import com.demo.stackQueue.CircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		CircularQueue ob = new CircularQueue();
		ob.enqueue(20);
		ob.enqueue(30);
		ob.enqueue(40);
		ob.enqueue(50);
		ob.enqueue(60);
		ob.enqueue(70);
		System.out.println("Dequeue "+ob.dequeue());
		ob.enqueue(100);
		ob.enqueue(120);
		System.out.println("Dequeue "+ob.dequeue());
		System.out.println("Dequeue "+ob.dequeue());
		ob.enqueue(200);
		ob.enqueue(300);
		while(!ob.isEmpty()) {
			System.out.println("Dequeue "+ob.dequeue());
		}
	}

}
