package leetcode;
import dataStructure.*;

public class BalancedBinaryTree {

	/**
	 * @param args
	 * Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined 
as a binary tree in which the depth of the two subtrees of 
every node never differ by more than 1.
	 */
    public boolean isBalanced(TreeNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (checkHeight(root) == -1) return false;
        else return true;
    }
    
    public int checkHeight(TreeNode root){
        if (root == null) return 0;
        int leftCheck = checkHeight(root.left);
        if (leftCheck == -1) return -1;
        int rightCheck = checkHeight(root.right);
        if (rightCheck == -1) return -1;
        
        if (Math.abs(leftCheck-rightCheck) > 1) return -1;
        else return Math.max(leftCheck, rightCheck) +1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
