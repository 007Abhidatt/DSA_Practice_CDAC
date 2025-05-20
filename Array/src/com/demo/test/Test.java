package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import day1com.demo.beans.MyClass;

public class Test {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	MyClass ob=new MyClass(4);
	for(int i=0;i<ob.getLength();i++)
	{
		System.out.println("enter number");
		int n=sc.nextInt();
		ob.add(n);
	}
	
	System.out.println(ob);
	
//	System.out.println("sum of all elements in array");
//	System.out.println("sum"+ob.getSum());
//	System.out.println("rotate array");
// ob.leftrotateArr(3);
// System.out.println(ob);
	ob.rightrotateArr(2);
	System.out.println(ob);
// System.out.println(Arrays.toString(ob.reverseArray(true)));
// System.out.println(ob);
// System.out.println(Arrays.toString(ob.replaceIndexValue()));	
//	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
