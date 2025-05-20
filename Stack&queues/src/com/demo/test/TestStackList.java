package com.demo.test;

import com.demo.stackQueue.StackList;

public class TestStackList {

	public static void main(String[] args) {
	 StackList ob = new StackList();
	 ob.push(10);
	 ob.push(20);
	 ob.push(40);
	 ob.displayData();
	 System.out.println("-----------------------------");
	 System.out.println(ob.pop());
	 System.out.println(ob.pop());
	 System.out.println(ob.pop());
	 System.out.println(ob.pop());
	}

}
