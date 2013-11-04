package chapter4;

import dataStructure.BinarySearchTree;
import dataStructure.TreeNode;

public class Question4_1 {

	/**
	 * @param args
	 * Implement a function to check if a binary tree is balanced. 
	 * For the purpose of this question, a balanced tree is defined to be 
	 * a tree such that the heights of the two subtrees of any node
	 * never differ by more than one.
	 */
	
	public static int checkHeight(TreeNode rt){
		if(rt == null) return 0; // height of 0
		
		int leftHeight = checkHeight(rt.left);
		if(leftHeight == -1) return -1; // not balanced
		int rightHeight = checkHeight(rt.right);
		if(rightHeight == -1) return -1;
		
		if(Math.abs(rightHeight-leftHeight) > 1){
			return -1;
		}
		else return Math.max(leftHeight, rightHeight)+1; //return this root from their child max height and plus one height.
	}
	
	public static boolean isBalanced(TreeNode rt){
		if(checkHeight(rt) == -1){
			return false;
		}
		else return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(6);
		bst.insert(10);
		bst.insert(7);
		bst.insert(2);
		bst.insert(1);
		bst.insert(5);
		bst.insert(11);
		bst.insert(12);//true
		bst.insert(13);//false
		System.out.println(isBalanced(bst.search(6)));

	}

}
