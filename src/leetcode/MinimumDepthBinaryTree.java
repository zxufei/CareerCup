package leetcode;
import dataStructure.*;
public class MinimumDepthBinaryTree {

	/**
	 * @param args
	 * Given a binary tree, find its minimum depth.
		The minimum depth is the number of nodes along the shortest path from 
		the root node down to the nearest leaf node.
	 */
	
	//must deal with one of two child is none. we must set it to be maximum value
	//otherwise the minimum of two depth would be always 0.
	public int minDepth(TreeNode root) {
	        // IMPORTANT: Please reset any member data you declared, as
	        // the same Solution instance will be reused for each test case.
	       if (root == null) return 0;
	       int leftDepth = minDepth(root.left);
	       int rightDepth = minDepth(root.right);
	       if (leftDepth == 0 && rightDepth == 0){
	           return 1;
	       }
	       else if (leftDepth == 0) leftDepth = Integer.MAX_VALUE;
	       else if (rightDepth == 0) rightDepth = Integer.MAX_VALUE;
	       return Math.min(leftDepth,rightDepth)+1;
	       
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
