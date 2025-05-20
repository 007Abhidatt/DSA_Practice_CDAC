package com.demo.graphs;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.stacks.MyGenericStack;
import com.demo.stacks.MyQueueList;

public class AdjacencyList {
	Node[] heads;
	class Node{
		int data;
		//int weight;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	 
	public AdjacencyList(int v) {
		heads = new Node[v];
	}
	
	public void addGraph() {
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<heads.length ;i++) {
			for (int j =0 ; j<heads.length ; j++) {
				System.out.println("edge "+i+"------>"+j);
				int num = sc.nextInt();
				if(num == 1) {
					Node newNode = new Node(j);
					if(heads[i] == null) {
						heads[i] = newNode;
					}
					else {
						newNode.next = heads[i];
						heads[i] = newNode;
					}
				}
			}
		}
	}
	
	public void displayData() {
		for(int i=0;i<heads.length;i++) {
			System.out.println("Node "+i+"----->");
			Node temp = heads[i];
			while(temp!=null) {
				System.out.println(temp.data+"---->");
				temp= temp.next;
			}
			System.out.println("null\n");
		}
	}
	
	public void dfsTraversal(int n) {
		MyGenericStack<Integer> mystack = new MyGenericStack<>();
		boolean [] visited = new boolean[heads.length];
		mystack.push(n);
		int [] mydfs = new int[heads.length];
		for(int i=0; i < visited.length; i++) {
			visited[i]= false;
		}
		int count = 0;
		while(!mystack.isEmpty()) {
			int d =mystack.pop();
			if(!visited[d]) {
				//mark it as visited
				visited[d] = true;
				mydfs[count] = d;
				count++;
				//add all non visited adjescent vertices in the stack
				Node temp =heads[d];
				while(temp!=null) {
					if(!visited[temp.data]) {
						mystack.push(temp.data);
					}
					temp = temp.next;
				}
			}
			mystack.displayData();
			System.out.println("---------------------");
		}
		System.out.println(Arrays.toString(mydfs));
		
	}
	
	
	public void bfsTraversal(int n) {
		MyQueueList queue = new MyQueueList();
		boolean [] visited = new boolean[heads.length];
		int [] mybfs = new int[heads.length];
		queue.enqueue(n);
		
		for(int i=0 ; i<visited.length ; i++) {
			visited[i]=false;
		}
		int count =0;
		while(!queue.isEmpty()) {
			int d= queue.dequeue();
			
			if(!visited[d]) {
				visited[d]=true;
				mybfs[count]=d;
				count++;
				
				//
				Node temp= heads[d];
				while(temp!=null) {
					if(!visited[temp.data]) {
						queue.enqueue(temp.data);
					}
					temp= temp.next;
				}
			}
			queue.displayData();
			System.out.println("------------------------");
		}
		System.out.println(Arrays.toString(mybfs));
	}
	
	
	
	

}
