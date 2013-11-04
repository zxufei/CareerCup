package leetcode;
import dataStructure.*;

public class SameTree {

	/**
	 * @param args
	Given two binary trees, write a function to check if they are equal or not.
	Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
	*/
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
		if (p == null && q == null) return true;
		if (p != null && q == null) return false;
		if (p == null && q != null) return false;
		if (p.data != q.data) return false;
		return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
	}
	
	public static boolean isSameTree(BinaryTree tr1, BinaryTree tr2){
		return isSameTree(tr1.getRoot(),tr2.getRoot());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
