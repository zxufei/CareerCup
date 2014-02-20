package leetcode;
import dataStructure.*;
import java.util.*;

public class BinaryTreePostorderTraversal {

	/**
	 * @param args
Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [3,2,1].

Note: Recursive solution is trivial, could you do it iteratively?
	 */
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        ArrayList<Integer> result = new ArrayList<Integer>();
        postorder(root, result);
        return result;
    }
    
    public void postorder(TreeNode root, ArrayList<Integer> result){
        if (root != null){
            postorder(root.left,result);
            postorder(root.right,result);
            result.add(root.data);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
