package chapter4;
import chapter4.Question4_7;
import dataStructure.*;

public class Question4_9 {

	/**
	 * 4.9 You are given a binary tree in which each node contains a value. Design an algorithm
	 * to print all paths which sum to a given value. Note that a path can start or end anywhere in the tree.
	 * two nodes must be at the same path.
	 */
	static int  path_num =0;
	
	public static void findPathRecur(TreeNode n, int[] path, int level, int value){
		if(n == null) return;
		
		path[level] = n.data;
		int sum = 0;
		//reverse order
		for (int i = level; i >=0; i--){
			sum += path[i];
			if (sum == value) {
				path_num++;
				print(path,i,level);
			}
				
		}
		
		findPathRecur(n.left, path,level+1, value);
		findPathRecur(n.right , path, level+1, value);
		 
		path[level] = Integer.MIN_VALUE;
		
	}
	
	public static void findPath(BinaryTree bt, int value){
		int[] path = new int[bt.depth()];
		findPathRecur(bt.getRoot(),path,0,value);
	}
	
	public static void print(int[] path, int start, int end){
		System.out.print("The "+path_num+" path is:");
		for (int i=start; i<= end; i++){
			System.out.print(path[i]+" ");
		}
		System.out.println();
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
		bst.insert(3);
		bst.insert(-4);
		bst.insert(4);
		bst.inorderPrint();
		System.out.println(bst.depth());
		findPath(bst,7);
		System.out.println();

	}

}
