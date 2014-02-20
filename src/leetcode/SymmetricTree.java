package leetcode;

import java.util.ArrayList;

import dataStructure.BinaryTree;
import dataStructure.TreeNode;

public class SymmetricTree {

	/**
	 * @param args
	 * Given a binary tree, check whether
	 *  it is a mirror of itself (ie, symmetric around its center).
	 *  For example, this binary tree is symmetric:

		    1
		   / \
		  2   2
		 / \ / \
		3  4 4  3
		But the following is not:
		    1
		   / \
		  2   2
		   \   \
		   3    3
		Note:
		Bonus points if you could solve it both recursively and iteratively.
	 * 非递归解法：按层遍历，每一层检查一下是否对称。
		递归解法：
		其中左子树和右子树对称的条件：
		两个节点值相等，或者都为空
		左节点的左子树和右节点的右子树对称
		左节点的右子树和右节点的左子树对称
	 */
	//non-recursion
	public static boolean isSymmetric(TreeNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        ArrayList<TreeNode> pre = new ArrayList<TreeNode>();
        ArrayList<TreeNode> cur = new ArrayList<TreeNode>();
        if(root == null) return true;
        
        pre.add(root);
        while (!checkEmpty(pre)){
            for (TreeNode n:pre){
                if (n.left == null) cur.add(new TreeNode(-1));
                else cur.add(n.left);
                if (n.right == null) cur.add(new TreeNode(-1));
                else cur.add(n.right);
            }
            if (!isPolindrome(cur)) return false;
            pre.clear();
            pre.addAll(cur);
            cur.clear();
        }
        return true;
    }
    
    public static boolean checkEmpty(ArrayList<TreeNode> arr){
        for (TreeNode a:arr){
            if (a.data != -1) return false;
        }
        return true;
    }
    public static boolean isPolindrome (ArrayList<TreeNode> level){
        for (int i=0; i<level.size()/2; i++){
            if (level.get(i).data != level.get(level.size()-1-i).data) return false;
        }
        return true;
    }
    
    //recursion
    public static boolean isSymmetricRec(TreeNode root){
    	if (root == null) return true;
    	return isSymmetric2(root.left, root.right);
    }
    
    public static boolean isSymmetric2(TreeNode left, TreeNode right){
    	if (left == null) return right == null;
    	if (right == null) return left == null;
    	if (left.data != right.data) return false;
    	if (!isSymmetric2(left.left,right.right)) return false;
    	if (!isSymmetric2(left.right,right.left)) return false;
    	return true;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bst = new BinaryTree();
		bst.insert(1);
		bst.getRoot().left = new TreeNode(2);
		bst.getRoot().right = new TreeNode(2);
//		bst.getRoot().left.right = new TreeNode(3);
//		bst.getRoot().right.right = new TreeNode(3);
		bst.inorderPrint();
		System.out.print(isSymmetricRec(bst.getRoot()));
	}

}
