package com.demo.test;

import com.demo.stackQueue.MyStackArray;

public class TestStackArray {

	public static void main(String[] args) {
		MyStackArray ob= new MyStackArray();
		ob.push(10);
		ob.push(20);
		ob.push(30);
		ob.push(40);
		ob.push(50);
		System.out.println("------------------");
		while(!ob.isEmpty()) {
			System.out.println(ob.pop());
		}

	}

}
