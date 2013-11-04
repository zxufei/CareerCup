package Interview;

import chapter4.Question4_7;
import dataStructure.BinarySearchTree;
import dataStructure.BinaryTree;
import dataStructure.TreeNode;

public class CalculatePath {
	/**
	 * 
	 * @param tr
	 * @param start
	 * @param end
	 * @return
	 * calculate edges between two nodes in binary tree, two nodes can be
	 * start and end anywhere.
	 */

	public static int sum2NodePath(BinaryTree tr, TreeNode start, TreeNode end){
		TreeNode ancestor = Question4_7.find1stAncestor(tr, start, end);
		TreeNode point1 = start;
		TreeNode point2 = end;
		int path = 0;
		while(point1 != ancestor || point2 != ancestor){
			if(point1 != ancestor){
				TreeNode parent1 = tr.findParent(point1);
				path++;
				point1 = parent1;
			}
			if(point2 != ancestor){
				TreeNode parent2 = tr.findParent(point2);
				path++;
				point2 = parent2;
			}
		}
		return path;
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
		
		System.out.println(sum2NodePath(bst,bst.search(1),bst.search(7)));

	}

}
