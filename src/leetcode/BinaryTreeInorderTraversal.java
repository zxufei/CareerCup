package leetcode;
import dataStructure.*;
import java.util.*;

public class BinaryTreeInorderTraversal {

	/**
	 * @param args
	 * Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?

confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
	 */
	
	//recursion method
	public static ArrayList<Integer> inorderTraversalRec(TreeNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
		ArrayList<Integer> result = new ArrayList<Integer>();
		inorder(root,result);
		return result;
    }
	
	public static void inorder(TreeNode root, ArrayList<Integer> result){
		if (root != null){
			inorder(root.left, result);
			result.add(root.data);
			inorder(root.right, result);
		}
	}
	
	//non-recursion method
	public static ArrayList<Integer> inorderTraversal(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		ArrayList<Integer> inorder = new ArrayList<Integer>();
		TreeNode current = root;
		while (true){
			if (current != null){
				s.push(current);
				current = current.left;
			}
			else{
				if (s.isEmpty()) return inorder;
				else{
					current = s.pop();
					inorder.add(current.data);
					current = current.right;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree s = new BinarySearchTree();
		s.insert(1);
		s.insert(2);
		s.insert(5);
		System.out.println(inorderTraversal(s.search(1)));
	}

}
