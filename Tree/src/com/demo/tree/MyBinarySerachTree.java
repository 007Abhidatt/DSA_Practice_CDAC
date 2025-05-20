package com.demo.tree;

public class MyBinarySerachTree {
	Node root;
	public class Node{
		int data; 
		Node left;
		Node right;
		public Node(int data){
			this.data=data;
		    this.left= null;
		    this.right=null;
		    
		}
		
	}
	public MyBinarySerachTree (){
		root=null;
		
	}

	public void insertNode( int key) {
		root= insertData(root, key);
	}

	public Node insertData(Node root, int key) {
		Node newNode = new Node(key);
		if(root==null) {
			root= newNode;
			return root;
		}
		else {
			if(key<root.data) {
               root.left = insertData(root.left,key);	
               
			}
			else {
				root.right = insertData(root.right,key);
			}
			return root;
		}	
		
	}
	//InOrder...traversal
		 public void inorder() {
			 inorderTraversal(root);
			 System.out.println();
		 }

		private void inorderTraversal(Node root) {
			if(root!=null) {
				inorderTraversal(root.left);
				System.out.print(root.data+",");
				
				inorderTraversal(root.right);
			}
			
		}
	
		//PostOrder...traversal
		 public void postorder() {
			 postorderTraversal(root);
			 System.out.println();
		 }

		private void postorderTraversal(Node root) {
			if(root!=null) {
				
				postorderTraversal(root.left);
				postorderTraversal(root.right);
				System.out.print(root.data+",");
			}
			
		}
	
	//PreOrder...traversal
	 public void preorder() {
		 preorderTraversal(root);
		 System.out.println();
	 }

	private void preorderTraversal(Node root) {
		if(root!=null) {
			System.out.print(root.data+",");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
		
	}
	
	//Search in BinaryTree....
	public boolean serachNode(int key) {
		return searchBinaryTreeRecursive(root , key);
	}

	private boolean searchBinaryTreeRecursive(Node root, int key) {
		if(root!=null) {
			if(root.data==key) {
			System.out.println("key found");
			return true;
			}
			else {
				if(root.data>key) {
					return searchBinaryTreeRecursive(root.left , key);
					
				}
				else {
					return searchBinaryTreeRecursive(root.right , key);
				}
			}
		}
		return false;
	}
	
	//Search in BinaryTree....
		public boolean serachNodeNonRecur(int key) {
			return searchBinaryTreeNonRecursive(root , key);
		}

	private boolean searchBinaryTreeNonRecursive(Node root, int key) {
		if(root!=null) {
			Node temp = root;
			while(temp!=null) {
				if(temp.data==key) {
					System.out.println("key found");
					return true;
				}else if(temp.data>key) {
					temp= temp.left;
				}
				else {
					temp=temp.right;
				}
			} 
			return false;
		}
		return false;
		
	}
	
	
	  
}
