package chapter4;

import dataStructure.BinarySearchTree;
import dataStructure.TreeNode;

public class Question4_3 {

	/**
	 * @param args
	 * Given a sorted (increasing order) array, write an algorithm to create a binary search tree
	 * with minimal height.
	 */
	
	public static void arrayToBSTRecursion(int[] array,int start, int end, BinarySearchTree bst){
		if (start >  end) return;
		else{
		int middle = (start + end)/2;
		bst.insert(array[middle]);
		arrayToBSTRecursion(array,start, middle-1,bst);
		arrayToBSTRecursion(array,middle+1,end,bst);
		}
	}
	public static BinarySearchTree arrayToBST(int[] array){
		BinarySearchTree bst = new BinarySearchTree();
		arrayToBSTRecursion(array,0,array.length-1,bst);
		return bst;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6,7};
		arrayToBST(a).inorderPrint();
		
	}

}
