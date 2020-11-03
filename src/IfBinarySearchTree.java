package com.nishant.dsalgo;

public class IfBinarySearchTree {

	Node root;
	
	boolean isBST() {
		
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
	}

	/* Returns true if the given tree is a BST and its 
    values are >= min and <= max. */
	private boolean isBSTUtil(Node node, int minValue, int maxValue) {
		// TODO Auto-generated method stub
		
		/* an empty tree is BST */
		if(node ==null) {
			return true;
		}
		
		 /* false if this node violates the min/max constraints */
		if(node.data < minValue || node.data >maxValue) {
			
			return false;
		}
		
		/* otherwise check the subtrees recursively 
        tightening the min/max constraints */
        // Allow only distinct values 
		return(isBSTUtil(node.left, minValue, node.data-1) && isBSTUtil(node.right, node.data-1,maxValue ));

	}
	
	public static void main(String[] args) {
		
		IfBinarySearchTree tree = new IfBinarySearchTree();
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		
		
		if (tree.isBST()) 
            System.out.println("IS BST"); 
        else
            System.out.println("Not a BST"); 
		
	}
	
	
	
	boolean isBinarySTree(Node node, int minValue, int maxValue) {
		
		if(node == null) {
			
			return true;
		}
		
		if(node.data < minValue && node.data > maxValue) {
			
			return false;
		}
		
		
		return (isBinarySTree(node.left, minValue, node.data-1) && isBinarySTree(node.right, node.data+1, maxValue));
		
		
	}
	
}
