package leetcode;

import leetcode.PopulateNextRightPointerInEachNode.TreeLinkNode;

public class PopulateNextRightPointerInEachNodeII {

	/**
	 * @param args
	 * Follow up for problem "Populating Next Right Pointers in Each Node".

What if the given tree could be any binary tree? Would your previous solution still work?

Note:

You may only use constant extra space.
For example,
Given the following binary tree,
         1
       /  \
      2    3
     / \    \
    4   5    7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \    \
    4-> 5 -> 7 -> NULL
	 */
	public class TreeLinkNode {
	      int val;
	      TreeLinkNode left, right, next;
	      TreeLinkNode(int x) { val = x; }
	  }
	
	 public void connect(TreeLinkNode root) {
	        // IMPORTANT: Please reset any member data you declared, as
	        // the same Solution instance will be reused for each test case.
	        while (root != null){
	            TreeLinkNode head = null;
	            TreeLinkNode pre = null;
	            while(root != null){
	                if (head == null){
	                    head = root.left == null?root.right:root.left;
	                }
	                
	                if (root.left != null){
	                    if (pre != null) pre.next = root.left;//link, if pre == null, the first one
	                    pre = root.left;
	                }
	                
	                if (root.right != null){
	                    if (pre != null) pre.next = root.right;//link, if pre == null, the first one
	                    pre = root.right;
	                }
	                
	                root = root.next;//to the next node.
	            }
	            root = head;//to the next level
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
