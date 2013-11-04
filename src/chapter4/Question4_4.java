package chapter4;
import java.util.*;

import dataStructure.*;

public class Question4_4 {

	/**
	 * @param args
	 * 
	 * 4.4 Given a binary tree, design an algorithm which creates a linked list
	 * of all the nodes at each depth.(e.g.,if you have a tree with depth D, you'll have D LL.
	 *
	 */
	
	public static ArrayList<LinkedList<TreeNode>> depthList(BinarySearchTree bst){
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> cur = new LinkedList<TreeNode>();
		if(bst.getRoot() == null){
			return null;
		}
		else{
			cur.add(bst.getRoot());
			result.add(cur);
			while(cur.size() > 0){
				LinkedList<TreeNode> parent = cur;
				cur = new LinkedList<TreeNode>();
				for(TreeNode n:parent){
					if(n.left!=null){
					cur.add(n.left);}
					if(n.right!=null){
					cur.add(n.right);
					}
				}
				result.add(cur);
			}
		}
		return result;
	}
	
	public static void print(ArrayList<LinkedList<TreeNode>> a){
		for(LinkedList<TreeNode>list:a){
			for(TreeNode n:list){
			System.out.print(n.data+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(6);
		bst.insert(10);
		bst.insert(7);
		bst.insert(2);
		bst.insert(1);
		bst.insert(5);
		bst.insert(11);
		bst.inorderPrint();
		ArrayList<LinkedList<TreeNode>> a = depthList(bst);
		print(a);
	}

}
