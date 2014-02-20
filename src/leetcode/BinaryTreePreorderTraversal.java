package leetcode;
import java.util.*;
import dataStructure.*;

public class BinaryTreePreorderTraversal {

	/**
	 * @param args
Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?
	 */

	 public ArrayList<Integer> preorderTraversal(TreeNode root) {
	        // IMPORTANT: Please reset any member data you declared, as
	        // the same Solution instance will be reused for each test case.
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        preorder(root,result);
	        return result;
	    }
	    
	    public void preorder(TreeNode root, ArrayList<Integer> result){
	        if (root!= null){
	            result.add(root.data);
	            preorder(root.left,result);
	            preorder(root.right,result);
	        }
	    }
	
	    //non recursion
	public ArrayList<Integer> preorderTraversal2(TreeNode root){
		Stack<TreeNode> s = new Stack<TreeNode>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (root == null) return res;
		s.push(root);
		while (!s.isEmpty()){
			TreeNode n = s.pop();
			res.add(n.data);
			if (n.right != null){
				s.push(n.right);
			}
			if (n.left != null){
				s.push(n.left);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
