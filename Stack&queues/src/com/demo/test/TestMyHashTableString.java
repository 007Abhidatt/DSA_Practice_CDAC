package com.demo.test;

import com.demo.stackQueue.MyHashTableString;

public class TestMyHashTableString {

	public static void main(String[] args) {
		MyHashTableString ob = new MyHashTableString();
		ob.insertData("omkar");
		ob.insertData("abhidatt");
		ob.displayData();
		ob.searchData("abhidatt");
		ob.searchData("abhishek");
		

	}

}
