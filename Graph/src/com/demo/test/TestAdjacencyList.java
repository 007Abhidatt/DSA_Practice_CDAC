package com.demo.test;

import com.demo.graphs.AdjacencyList;

public class TestAdjacencyList {

	public static void main(String[] args) {
		AdjacencyList ob = new AdjacencyList(4);
		ob.addGraph();
		ob.displayData();
		ob.dfsTraversal(0);
		ob.bfsTraversal(0);
	}

}
