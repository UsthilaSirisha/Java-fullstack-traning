package com.day13;



	class Node {
		int key;
		Node left,right;
	  Node(int key) {
			this.key = key;
			left = right= null;
		}
	}
	class BinaryTree{
		Node root;
		BinaryTree(){
			root = null;
		}
		boolean isBalanced(Node node) {
			return checkHeight(node) != -1;
		}
		int checkHeight(Node node) {
			if(node == null) {
				return 0 ;
			}
			int leftHeight=checkHeight(node.left); 
				if(leftHeight == -1) {
					return -1;
				}int rightHeight=checkHeight(node.right); 
				if(rightHeight == -1) {
					return -1;
				}
				if(leftHeight>rightHeight +1 ||rightHeight>leftHeight +1) {
					return -1;
				}if(leftHeight>rightHeight) {
					return leftHeight +1;
				}else {
					return rightHeight + 1;
				}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left =new Node(2);
		tree.root.right =new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right =new Node(5);
		tree.root.right.left =new Node(6);
		tree.root.right.right =new Node(7);
		if(tree.isBalanced(tree.root)) {
			System.out.println("The tree is balanced.");
		}else {
			System.out.println("The tree is not balanced.");
		}
		BinaryTree unbalancedTree = new BinaryTree();
		//unbalancedTree.root=new Node();
		unbalancedTree.root.left= new Node(1);
		unbalancedTree.root.left.left= new Node(2);
		unbalancedTree.root.left.left= new Node(3);
		unbalancedTree.root.left.left.left= new Node(4);
		if(unbalancedTree.isBalanced(unbalancedTree.root)) {
			System.out.println("The tree is balance.");
		}else {
			System.out.println("The tree is not balanced.");
			
		}
		
			
		}
		

	}


