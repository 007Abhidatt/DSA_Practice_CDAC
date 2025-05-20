package com.demo.test;

import com.demo.tree.MyBinarySerachTree;

public class TestMyBinarySearchTree {

	public static void main(String[] args) {
		MyBinarySerachTree ob = new MyBinarySerachTree();
		int [] arr = {10 , 15,20,3,6,25,30, 11 , 7 ,8, 5};
		for(int i=0; i<arr.length ; i++) {
			ob.insertNode(arr[i]);
		}
		ob.inorder();
		ob.preorder();
		ob.postorder();
		
	System.out.println(ob.serachNode(25));
	ob.serachNodeNonRecur(5);
	         
	}

}
