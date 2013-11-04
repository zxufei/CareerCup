package leetcode;
import dataStructure.*;

public class MaxDepthBinaryTree {

	/**
	 * @param args
		Given a binary tree, find its maximum depth.
		The maximum depth is the number of nodes along the longest path
		from the root node down to the farthest leaf node.
	 */
	/**
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	
	public int maxDepth(TreeNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (root == null) return 0;
        else return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
