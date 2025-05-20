package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.stackQueue.MyGenericStack;

public class TestMyGenericStack {

	public static void main(String[] args) {
//		MyGenericStack<String> ob = new MyGenericStack<>();
//		ob.push("hello");
//		ob.push("test");
//		ob.push("welcome");
//		ob.displayData();
//		System.out.println("------------------");
//		System.out.println(ob.pop());
//		System.out.println(ob.pop());
//		System.out.println(ob.pop());
//		System.out.println(ob.pop());
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string with spaces");
		String s= sc.nextLine();
		String []sarr = s.split(" ");
		MyGenericStack ob1 = new MyGenericStack<>();
		System.out.println(Arrays.toString(sarr));
		for (int i=0 ; i<sarr.length;i++) {
			ob1.push(sarr[i]);
			
		}
		
		while(!ob1.isEmpty()) {
			System.out.println(ob1.pop());
		}

	}

}
