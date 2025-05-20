package com.demo.test;

import com.demo.stackQueue.MyHashTable;

public class TestMyHashTable {

	public static void main(String[] args) {
		MyHashTable ob = new MyHashTable();
		ob.insertData(10);
		ob.insertData(20);
		ob.insertData(31);
		ob.insertData(52);
		ob.insertData(43);
		ob.insertData(78);
		ob.insertData(36);
		ob.insertData(112);
		ob.insertData(14);
		ob.insertData(16);
		ob.insertData(22);
		ob.insertData(63);
		ob.displayData();
		ob.searchData(36);
		ob.searchData(118);
		

	}

}
