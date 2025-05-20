package com.demo.test;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.linkedlist.EmpLinkedList;

public class TestEmpLinkedList {

	public static void main(String[] args) {
		EmpLinkedList elist= new EmpLinkedList();
		elist.addNode(new Employee(1,"omkar","6565656", 23000));
		elist.addNode(new Employee(5,"rohan","6565656", 44000));
		elist.addPosition(new Employee(2,"abhidatt","989889898", 35000),2);
		elist.addNodeByEmpno(new Employee(4,"rohan","78787878", 24000),1);
    	elist.displayData();
		//elist.deleteByEname("rohan");
		//elist.displayData();
	    elist.findBySal(23000);
	    
		

	}

}
