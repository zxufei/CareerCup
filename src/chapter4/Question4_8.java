package chapter4;
import dataStructure.*;

public class Question4_8 {

	/**
	 * 4.8 You have two very large binary trees: T1, with millions of nodes, and
	 * T2, with hundreds of nodes. Create an algorithm to decide if T2 is a subtree of T1.
	 * A tree T2 is a subtree of T1 if there exists a node n in T1 such that
	 * the subtree of n is identical to T2. That is, if you cut off the tree at node n, the two trees
	 * would be identical.
	 */
	public static boolean subTree(BinaryTree t1, BinaryTree t2){
		return subTreeRecur(t1.getRoot(), t2.getRoot());
	}
	
	//recur
	public static boolean subTreeRecur(TreeNode n1, TreeNode n2){
		if(n2 == null) return true;
		if (n1.data == n2.data){
			return matchTree(n1, n2);
		}
		
		return subTreeRecur(n1.left,n2) || subTreeRecur(n1.right, n2);
	}
	
	public static boolean matchTree(TreeNode n1, TreeNode n2){
		if (n1 == null && n2 == null) return true;
		if (n1 == null && n2 != null) return false;
		if (n1 != null && n2 == null) return false;
		if(n1.data != n2.data) return false;
		return matchTree(n1.left,n2.left) && matchTree(n1.right, n2.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bst = new BinaryTree();
		bst.insert(6);
		bst.insert(10);
		bst.insert(7);
		bst.insert(2);
		bst.insert(1);
		bst.insert(5);
		bst.insert(11);
		bst.insert(3);
		bst.insert(-4);
		bst.insert(4);
		bst.inorderPrint();
		
	}

}
