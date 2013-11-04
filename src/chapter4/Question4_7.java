package chapter4;

import dataStructure.BinarySearchTree;
import dataStructure.BinaryTree;
import dataStructure.TreeNode;

public class Question4_7 {

	/**
	 * 4.7 Design an algorithm and write code to find the first common ancestor of two nodes
	 * in a binary tree.Avoid storing additional nodes in a data structure.
	 * Note: This is not necessarily a binary search tree.
	 */
	
	//if p Treenodes is in this root of subtrees.
	public static boolean covers(TreeNode rt, TreeNode p){
		if(rt == null) return false;
		if(rt == p) return true;
		return covers(rt.left,p) || covers(rt.right,p);
	}
	
	public static TreeNode ancestorRecur(TreeNode n,TreeNode p, TreeNode q){
		if(n == null) return null; //not found
		if(n == p || n == q ) return n; //recursion end
		
		boolean is_left_p = covers(n.left,p);
		boolean is_left_q = covers(n.left,q);
		if(is_left_p != is_left_q) return n;
		else{
			if(is_left_p){
				return ancestorRecur(n.left,p,q);
			}
			else return ancestorRecur(n.right,p,q);
		}
	}
	
	public static TreeNode find1stAncestor(BinaryTree tr, TreeNode p, TreeNode q){
		return ancestorRecur(tr.getRoot(),p,q);
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
		TreeNode p = bst.getRoot().left.left;System.out.println(p.data);
		TreeNode q = bst.getRoot().left.right;System.out.println(q.data);
		System.out.println(find1stAncestor(bst,p,q).data);
		bst.inorderPrint();
		
		

	}

}
