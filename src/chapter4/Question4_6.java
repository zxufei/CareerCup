package chapter4;

import dataStructure.*;

public class Question4_6 {

	/**
	 * 4.6 Write an algorithm to find the next node(i.e., in-order successor)
	 * of a given node in a bst. You may assume that each node has a link to its parent.
	 */
	
	public static TreeNode nextInorderSuccessor(TreeNode n, BinarySearchTree bst){
		TreeNode point = n;
		if(n.right != null){
			point = point.right;
			while(point.left != null){
				point = point.left;
			}
			return point;
		}
		else{
			TreeNode parent = bst.findParent(point);
			while(true){	
				if(parent != null){
					if(parent.data < point.data){
						point = parent;
						parent = bst.findParent(point);
					}
					else{
						return parent;
					}
				}
				else return null;
			}	
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
		
		TreeNode n = bst.search(1);
		if(nextInorderSuccessor(n,bst)!=null){
		System.out.println(n.data +" next node is "+nextInorderSuccessor(n,bst).data);
		}
		else System.out.println(n.data +" is a largest number in bst.");
		
	}

}
